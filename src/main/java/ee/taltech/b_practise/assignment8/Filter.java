package ee.taltech.b_practise.assignment8;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    //done: A write tests in FilterTest
    //done: B make tests pass
    //done: C make your solution pretty
    // it's up to you how you want to handle null inputs
    // you don't need to modify PositivesAndNegatives object
    // P.S streams don't add much value here

    /**
     * divides integer input into positives and negatives
     * zero 0, can be treated as positive
     */
    public static PositivesAndNegatives filterToPositivesAndNegatives(List<Integer> numbers) {

        if(numbers == null || numbers.isEmpty()){
            return null;
        }

        return new PositivesAndNegatives(
                numbers.stream().filter(each -> each >= 0).collect(Collectors.toList()),
                numbers.stream().filter(each -> each < 0).collect(Collectors.toList())
        );
    }
}
