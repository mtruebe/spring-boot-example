package service.v1.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import service.v1.model.SomeEntity;

public class SomeEntityTest {

    @Test
    public void testSomeEntity(){
        SomeEntity someEntity = new SomeEntity();
        someEntity.setSomeEntityValue("test");
        someEntity.setSomeEntityId(Long.valueOf(1));

        System.out.println("TestSomeEntityId");
        Assert.assertTrue(someEntity.getSomeEntityId().equals(Long.valueOf(1)));

        System.out.println("TestSomeEntityValue");
        Assert.assertTrue(someEntity.getSomeEntityValue().equals("test2"));

    }


}

