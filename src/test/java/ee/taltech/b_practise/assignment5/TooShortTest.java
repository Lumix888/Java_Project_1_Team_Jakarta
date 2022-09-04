package ee.taltech.b_practise.assignment5;

import ee.taltech.b_practise.assignment4.PowerOf3;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TooShortTest {

    static final List<String> TEST_STRINGS =
            List.of("The quick brown fox jumps over the lazy dog 1".split(" "));

    @Test
    void no_length_or_negative_dont_filter() {
        assertEquals(TEST_STRINGS, TooShort.filter(TEST_STRINGS, 0));
        assertEquals(TEST_STRINGS, TooShort.filter(TEST_STRINGS, -2));
    }

    @Test
    void length_1_filters_number_1() {
        assertEquals(List.of("The", "quick", "brown", "fox", "jumps",
                "over", "the", "lazy", "dog"),
                TooShort.filter(TEST_STRINGS, 1));
    }

    @Test
    void length_3_filter() {
        assertEquals(List.of("quick", "brown", "jumps", "over", "lazy"),
                TooShort.filter(TEST_STRINGS, 3));
    }

    @Test
    void length_4_filter() {
        assertEquals(List.of("quick", "brown", "jumps"),
                TooShort.filter(TEST_STRINGS, 4));
    }

    @Test
    void length_5_filter() {
        assertEquals(List.of(),
                TooShort.filter(TEST_STRINGS, 5));
    }

    //done 2 you decide what happens on null input list, write a test and logic :)
    // don't worry about nulls inside the list ("Hello", null, "World")

    @Test
    void length_on_null() {
        assertEquals(List.of(), TooShort.filter(null, 42));
    }
}
