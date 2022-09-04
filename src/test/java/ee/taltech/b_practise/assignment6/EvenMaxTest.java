package ee.taltech.b_practise.assignment6;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class EvenMaxTest {

    @Test
    void _null_is_maximum_of_no_numbers() {
        assertEquals(null, EvenMax.maximum(null));
        assertEquals(null, EvenMax.maximum(new ArrayList<>()));
    }

    @Test
    void _null_is_maximum_of_odd_numbers() {
        assertEquals(null, EvenMax.maximum(List.of(1, 3, 5)));
    }

    @Test
    void _4_is_maximum_of_2_3_4() {
        assertEquals(4, (int) EvenMax.maximum(List.of(2, 3, 4)));
    }

    @Test
    void _4_is_maximum_of_2_3_4_5() {
        assertEquals(4, (int) EvenMax.maximum(List.of(2, 3, 4, 5)));
    }

    @Test
    void _min_integer_is_maximum_of_min_integer() {
        assertEquals(Integer.MIN_VALUE, (int) EvenMax.maximum(List.of(Integer.MIN_VALUE)));
    }

    @Test
    void _negative2_is_maximum_of_n2_n3_n4() {
        assertEquals(-2, (int) EvenMax.maximum(List.of(-2, -3, -4)));
    }

    @Test
    void _negative2_is_maximum_of_n1_n2_n3_n4() {
        assertEquals(-2, (int) EvenMax.maximum(List.of(-1, -2, -3, -4)));
    }
}
