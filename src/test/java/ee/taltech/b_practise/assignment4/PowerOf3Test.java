package ee.taltech.b_practise.assignment4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOf3Test {

    @Test
    void powerOf3_on_empty_list_returns_nothing() {
        assertEquals(List.of(), PowerOf3.toThePowerOfThree(List.of()));
    }

    @Test
    void powerOf3_on_1_2_3_is_1_8_27() {
        assertEquals(List.of(1, 8, 27), PowerOf3.toThePowerOfThree(List.of(1, 2, 3)));
    }

    @Test
    void powerOf3_on_n1_n2_n3_is_n1_n8_n27() {
        assertEquals(List.of(-1, -8, -27), PowerOf3.toThePowerOfThree(List.of(-1, -2, -3)));
    }

    //done B you decide what happens on null input, write a test and logic :)
    // don't worry about nulls inside the list (1, null, 3)

    //DONE: B - added my own test
    @Test
    void powerOf3_on_n1_null_n3_is_n1_null_n27() {
        assertEquals(List.of(), PowerOf3.toThePowerOfThree( null));
    }
}
