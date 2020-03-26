package guru.springframework;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Junit 5 test class
 */
public class Junit5Test {

    @Test
    void someFauxTest() {

        Assert.assertEquals("foo", "foo");
    }

    @Disabled
    @Test
    void someDefaultTest() {

        Assert.assertEquals("foo", "foo");
    }
}
