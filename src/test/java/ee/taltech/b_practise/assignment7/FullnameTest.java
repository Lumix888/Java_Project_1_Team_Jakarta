package ee.taltech.b_practise.assignment7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FullnameTest {

    @Test
    void first_name_and_last_name_return_full_name() {
        assertEquals("Lionel Messi", Fullname.fullname("Lionel", "Messi"));
    }

    @Test
    void multiple_first_name_and_last_name_return_full_name() {
        assertEquals("Lionel Andres Messi", Fullname.fullname("Lionel Andres", "Messi"));
    }

    @Test
    void first_name_and_NO_last_name_return_first_name_only() {
        assertEquals("Lionel", Fullname.fullname("Lionel", ""));
    }

    @Test
    void NO_first_name_and_last_name_return_last_name_only() {
        assertEquals("Messi", Fullname.fullname("", "Messi"));
    }

    @Test
    void empty_first_and_last_name_return_empty_full_name() {
        assertEquals("", Fullname.fullname("", ""));
    }

    @Test
    void equality_is_checked_correctly() {
        assertEquals("Lionel Messi", Fullname.fullname("Lionel", "Mes" + "si"));
    }

    //done
    // if you know how to compare equality between objects correctly you should not have problems with this test
    // https://i.kym-cdn.com/photos/images/newsfeed/000/096/044/trollface.jpg?1296494117
    @Test
    void empty_first_and_last_name_new_string_return_empty_full_name() {
        assertEquals("", Fullname.fullname(new String(""), new String("")));
    }

    @Test
    void null_first_name_and_last_name_return_last_name() {
        assertEquals("Messi", Fullname.fullname(null, "Messi"));
    }

    @Test
    void first_name_and_null_last_name_return_first_name() {
        assertEquals("Lionel", Fullname.fullname("Lionel", null));
    }

    @Test
    void empty_first_and_null_last_name_return_empty_full_name() {
        assertEquals("", Fullname.fullname("", null));
    }

    @Test
    void null_first_and_empty_last_name_return_empty_full_name() {
        assertEquals("", Fullname.fullname(null, ""));
    }

    @Test
    void null_first_and_null_last_name_return_empty_full_name() {
        assertEquals("", Fullname.fullname(null, null));
    }
}
