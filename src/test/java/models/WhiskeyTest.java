package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WhiskeyTest {

    Whiskey testWhiskey = new Whiskey();

    @Test
    public void testSetGetBrand() {
        String expected = "valentin";

        testWhiskey.setBrand(expected);
        Assertions.assertEquals(expected, testWhiskey.getBrand());

    }

    @Test
    public void testSetGetQty(){
        int expected = 32;

        testWhiskey.setQty(expected);
        Assertions.assertEquals(expected,testWhiskey.getQty());
    }

    @Test
    public void testSetGetId(){
        int expected = 32097;

        testWhiskey.setId(expected);
        Assertions.assertEquals(expected,testWhiskey.getId());
    }
}
