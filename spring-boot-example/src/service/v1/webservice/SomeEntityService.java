package service.v1.webservice;

import org.springframework.stereotype.Service;
import service.v1.model.SomeEntity;

import java.util.List;

@Service
public interface SomeEntityService {

    SomeEntity getSomeEntity(Long someEntityId, String someEntityValue);

    SomeEntity getAnotherValue(Long someEntityId);

}
