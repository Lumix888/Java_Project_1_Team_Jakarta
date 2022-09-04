package ee.taltech.b_practise.assignment3;

import java.util.List;
import java.util.stream.Collectors;

public class Multiplier {

    //DONE: A modify function to pass tests
    //DONE: B modify function to pass edge case tests
    //DONE: C make your solution pretty
    //DONE: D use streams

    /**
     * multiplies each param element with multiplier
     */
    public static List<Integer> multiplier(List<Integer> params, Integer multiplier) {
        if (params == null) { return List.of(); }
        if (multiplier == null) { return params; }
        return params.stream().map(x -> x*multiplier).collect(Collectors.toList());
    }
}
