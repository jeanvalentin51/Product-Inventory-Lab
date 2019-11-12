package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {
    Sneaker testSneaker = new Sneaker();

    @Test
    public void testSetGetName() {
        String expected = "oleg";

        testSneaker.setName(expected);
        Assertions.assertEquals(expected, testSneaker.getName());

    }

    @Test
    public void testSetGetBrand() {
        String expected = "valentin";

        testSneaker.setBrand(expected);
        Assertions.assertEquals(expected, testSneaker.getBrand());

    }

    @Test
    public void testSetGetSport(){
        String expected = "soccer";

        testSneaker.setSport(expected);
        Assertions.assertEquals(expected,testSneaker.getSport());
    }
}
