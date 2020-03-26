package guru.springframework;

import org.junit.jupiter.api.Test;

/**
 * Class name ends with IT it is for
 * Integration test.
 * Failsafe pick this class and run separately after the
 * package command finished
 */
public class JavaHelloWorldIT {

    @Test
    void myFauxIntegrationTest() {

        System.out.println("My IT Ran");
    }
}
