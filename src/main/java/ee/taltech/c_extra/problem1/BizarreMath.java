package ee.taltech.c_extra.problem1;

public class BizarreMath {

    //DONE: A
    // byte is a data structure from -128 to 127
    // can you explain in plain english (simpler the better)
    // why 127 + 1 = -128 ?!
    // Answer:
    // Because 01111111 + 00000001 = 10000000 Which is -128 in decimal using the 2's complement.
    //
    //DONE: B
    // How is this phenomenon called? (this is unrelated, but funny https://www.youtube.com/watch?v=h5Mc55P1i9g)
    // Answer (one word): overflow
    //
    //DONE: C
    // What would you recommend developer to do?
    // Answer: use a different data type, for example int in this case
    //
    //
    //DONE: D
    // Does the similar thing happen with "int/Integer"?
    // Answer: Yes/No YES

    public static void main(String[] args) {
        byte num = 127;
        byte num2 = (byte) (num + 1);
        System.out.println(num);
        System.out.println("+ 1");
        System.out.println(num2);
    }
}
