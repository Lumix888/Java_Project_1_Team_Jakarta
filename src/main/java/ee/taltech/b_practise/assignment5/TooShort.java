package ee.taltech.b_practise.assignment5;

import java.util.List;
import java.util.stream.Collectors;

public class TooShort {

    //DONE: A modify function to pass tests
    // notice here we use int length which means no nulls can be passed as length https://imgflip.com/i/3pacs6
    //DONE: B you decide what happens on null input, write a test and logic :)
    // don't worry about nulls inside the list (1, null, 3)
    //DONE: C make your solution pretty
    //DONE: D use streams

    /**
     * returns a list of string where length of a string is bigger than length (>)
     */
    public static List<String> filter(List<String> strings, int length){
        if (strings == null) { return List.of(); }
        return strings.stream().filter(s -> s.length() > length).collect(Collectors.toList());
    }
}
