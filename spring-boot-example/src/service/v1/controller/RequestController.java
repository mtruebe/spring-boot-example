package service.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import service.v1.model.SomeEntity;
import service.v1.webservice.SomeEntityService;

@RestController
@RequestMapping(value = "/1.0/spring_boot_example", produces = MediaType.APPLICATION_JSON_VALUE)
public class RequestController {

    @Autowired
    private SomeEntityService someEntityService;

    @RequestMapping(value = "/some_entity/{some_entity_id}", method = RequestMethod.GET)
    public SomeEntity getSomeEntity(@PathVariable("some_entity_id") Long someEntityId,
                                    @RequestParam(value = "some_entity_value", required = false) String someEntityValue) throws Exception {
        return someEntityService.getSomeEntity(someEntityId, someEntityValue);
    }

    @RequestMapping(value = "/some_entity/{some_entity_id}/another_value", method = RequestMethod.GET)
    public SomeEntity getSomeEntity(@PathVariable("some_entity_id") Long someEntityId) {
        return someEntityService.getAnotherValue(someEntityId);
    }

}