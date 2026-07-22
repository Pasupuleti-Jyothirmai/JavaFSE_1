import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator created");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator destroyed");
    }

    @Test
    void testAdd() {
        System.out.println("Executing testAdd()");
    }

    @Test
    void testSubtract() {
        System.out.println("Executing testSubtract()");
    }
}