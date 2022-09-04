package ee.taltech.b_practise.assignment1;

public class Subtraction {

    //DONE: A create a static function that takes in two ints
    // and returns the result of subtracting second element from the first
    // p.s pay attention to function and parameter names
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        //DONE: B
        // - call your newly created function with 5 and 2, print out the result
        // - call your newly created function with -5 and -2, print out the result

        System.out.println(subtract(5, 3));
        System.out.println(subtract(-5,-2));

        //DONE: C if you were to add another method
        // with the same name, but 3 inputs, then it would be an example of?
        // a) overreaching?
        // b) overloading?
        // c) overriding?
        // d) overreacting?
        // e) overlooking?
        // Answer: b) overloading
    }
}

