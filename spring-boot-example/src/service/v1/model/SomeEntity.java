package service.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by matthewtruebe on 5/28/19.
 */
public class SomeEntity {

    @JsonProperty("some_entity_id")
    private Long someEntityId;

    @JsonProperty("some_entity_value")
    private String someEntityValue;

    public Long getSomeEntityId() {
        return someEntityId;
    }

    public void setSomeEntityId(Long someEntityId) {
        this.someEntityId = someEntityId;
    }

    public String getSomeEntityValue() {
        return someEntityValue;
    }

    public void setSomeEntityValue(String someEntityValue) {
        this.someEntityValue = someEntityValue;
    }


}
