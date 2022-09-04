package ee.taltech.b_practise.assignment6;

import java.util.List;

public class EvenMax {

    //done: A modify function to pass tests
    //done: B make your solution pretty
    //done: C use streams

    /**
     * returns maximum even number from the list
     * even numbers are numbers evenly divisible by 2
     * for example 2, -6, 128, 2n
     */
    public static Integer maximum(List<Integer> params) {

        try{
            return params.stream().filter(each -> each % 2 == 0).max(Integer::compareTo).get();
        }catch (Exception e){
            return null;
        }
    }

    //done: D programmer has designed to return null on null/empty input
    // You can observe it on tests as: _null_is_maximum_of_no_numbers, _null_is_maximum_of_odd_numbers
    // Can you name 2 different ways developer could have solved these differently?
    // (There should be more than 2 options, but naming 2 is enough)
    // Answer:
    // 1 Write if condition at first, check if it's empty or null - then return the value
    // 2 Don't write an if, but try to catch nullpointer exception, and return null in that case
    //done: E
    // Which option would you prefer and why?
    // Answer: 2nd, because the code is short, and also catches other exceptions. It of course has its downsides
}
