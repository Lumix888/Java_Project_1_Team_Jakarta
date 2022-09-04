package ee.taltech.b_practise.assignment8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FilterTest {
    //todo write the tests you think are necessary :)
    @Test
    void _null_list_returns_null(){
        assertEquals(null, Filter.filterToPositivesAndNegatives(null));
        assertEquals(null, Filter.filterToPositivesAndNegatives(List.of()));
    }

    @Test
    void _numbers_are_ordered_properly_when_both_groups_present(){
        assertEquals(List.of(1, 3, 4, 5), Filter.filterToPositivesAndNegatives(List.of(-3, -5, -7, 1, 3, 4, 5)).getPositives());
        assertEquals(List.of(-3, -5, -7), Filter.filterToPositivesAndNegatives(List.of(-3, -5, -7, 1, 3, 4, 5)).getNegatives());
    }

    @Test
    void _zero_goes_into_positive_numbers_list(){
        assertEquals(List.of(0, 1, 20, 200), Filter.filterToPositivesAndNegatives(List.of(-5, -6, -20, 0, 1, 20, 200)).getPositives());
    }

    @Test
    void _single_element_list_returns_a_list(){
        assertEquals(List.of(1), Filter.filterToPositivesAndNegatives(List.of(1)).getPositives());
    }

    //DONE: write a test that asserts that if there are only negative numbers, list of positive numbers is empty
    //DONE: write a test that asserts that if there are only positive numbers, list of negative numbers is empty

    @Test
    void _only_negative_numbers(){
        assertEquals(List.of(), Filter.filterToPositivesAndNegatives(List.of(-3, -5, -7)).getPositives());
    }

    @Test
    void _only_positive_numbers(){
        assertEquals(List.of(), Filter.filterToPositivesAndNegatives(List.of(1, 3, 4, 5)).getNegatives());
    }
}
