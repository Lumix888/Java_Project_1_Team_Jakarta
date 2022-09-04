package ee.taltech.b_practise.assignment4;

import java.util.List;
import java.util.stream.Collectors;

public class PowerOf3 {

    //DONE: A modify function to pass tests
    //DONE: B you decide what happens on null input, write a test and logic :)
    // don't worry about nulls inside the list (1, null, 3)
    //DONE: C make your solution pretty
    //DONE: D use streams

    /**
     * multiplies each number to the power of three
     */
    public static List<Integer> toThePowerOfThree(List<Integer> params) {
        if(params == null){ return List.of(); }
        return params.stream().map(each -> each*each*each).collect(Collectors.toList());
    }
}
