package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {
    Sneaker testSneaker = new Sneaker();

    @Test
    public void setgetTestName(){
        String expected = "oleg";

        testSneaker.setName (expected);
        Assertions.assertEquals(expected,testSneaker.getName());

    }
}
