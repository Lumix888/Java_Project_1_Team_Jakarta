package ee.taltech.c_extra.problem2;

import org.apache.commons.lang3.StringUtils;

public class Dependency {


    //done A
    // Add Apache StringUtils to gradle
    // if added successfully you can uncomment line 3 and 12

    //done B
    // In the context of A, can you explain in your words what is a dependency?
    // Answer: Dependency is a suite of programs(in Java, Interfaces, Classes, their methods and functions)
    // that other people wrote, that we can use
    //
    //
    //done C
    // Can this project "ics0014-2020-test1" become a dependency?
    // Answer: YES

    public static void main(String[] args) {
        boolean notBlank = StringUtils.isNotBlank("       ");
        System.out.println(notBlank);
    }
}
