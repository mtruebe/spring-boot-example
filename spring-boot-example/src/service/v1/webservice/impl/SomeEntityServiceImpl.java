package service.v1.webservice.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import service.v1.model.SomeEntity;
import service.v1.webservice.SomeEntityService;

@Service
public class SomeEntityServiceImpl implements SomeEntityService {

    @Value("${another_value}")
    private String anotherValue;

    public SomeEntity getSomeEntity(Long someEntityId, String someEntityValue){
        SomeEntity someEntity = new SomeEntity();

        someEntity.setSomeEntityId(someEntityId);
        someEntity.setSomeEntityValue(someEntityValue);

        return someEntity;
    }

    public SomeEntity getAnotherValue(Long someEntityId){
        SomeEntity someEntity = new SomeEntity();

        someEntity.setSomeEntityId(someEntityId);
        someEntity.setSomeEntityValue(anotherValue);

        return someEntity;
    }

}
