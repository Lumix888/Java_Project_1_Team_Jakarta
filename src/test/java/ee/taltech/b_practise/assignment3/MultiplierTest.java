package ee.taltech.b_practise.assignment3;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MultiplierTest {

    @Test
    void _empty_list_multiplied_by_any_number_is_empty() {
        assertEquals(List.of(), Multiplier.multiplier(List.of(), 2));
        assertEquals(List.of(), Multiplier.multiplier(List.of(), -200));
    }

    @Test
    void _1_2_3_multiplied_by_2_is_2_4_6() {
        assertEquals(List.of(2, 4, 6), Multiplier.multiplier(List.of(1, 2, 3), 2));
    }

    @Test
    void _1_2_3_multiplied_by_3_is_3_6_9() {
        assertEquals(List.of(3, 6, 9), Multiplier.multiplier(List.of(1, 2, 3), 3));
    }

    @Test
    void _n1_n2_n3_multiplied_by_n2_is_2_4_6() {
        assertEquals(List.of(2, 4, 6), Multiplier.multiplier(List.of(-1, -2, -3), -2));
    }

    //todo p2 these are some edge case tests

    @Test
    void null_list_returns_empty_list() {
        assertEquals(List.of(), Multiplier.multiplier(null, 2));
        assertEquals(List.of(), Multiplier.multiplier(null, null));
    }

    @Test
    void null_multiplier_doesnt_multiply_list() {
        assertEquals(List.of(-1, 2, -3), Multiplier.multiplier(List.of(-1, 2, -3), null));
    }
}
