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
    public void testSetGetSize(){
        float expected = 23L;

        testSneaker.setSize(expected);
        Assertions.assertEquals(expected,testSneaker.getSize());
    }

    @Test
    public void testSetGetQty(){
        int expected = 32;

        testSneaker.setQty(expected);
        Assertions.assertEquals(expected,testSneaker.getQty());
    }

    @Test
    public void testSetGetPrice(){
        float expected = 120L;

        testSneaker.setPrice(expected);
        Assertions.assertEquals(expected,testSneaker.getPrice());
    }

    @Test
    public void testSetGetSport(){
        String expected = "Soccer";

        testSneaker.setSport(expected);
        Assertions.assertEquals(expected,testSneaker.getSport());
    }
}
