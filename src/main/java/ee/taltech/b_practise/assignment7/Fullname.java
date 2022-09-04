package ee.taltech.b_practise.assignment7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fullname {

    //DONE: A modify function to pass tests
    //DONE: B make your solution pretty
    //DONE: C use streams (extra)

    public static String fullname(String firstName, String lastName) {
        if (firstName == null && lastName == null) { return ""; }
        if (firstName == null) { return lastName; }
        if (lastName == null) { return firstName; }

        return List.of(firstName.trim(), lastName.trim())
                   .stream()
                   .filter(x -> !x.trim().isBlank())
                   .reduce("", (acc, x) -> acc + " " + x).trim();
    }


}
