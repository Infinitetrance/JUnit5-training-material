package abstrct.set00.helloJUnit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("SampleTest")
public class HelloWorldTest {
    @Test
    void firstTest() {
        System.out.println("First test");
    }
}
