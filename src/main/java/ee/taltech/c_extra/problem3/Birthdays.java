package ee.taltech.c_extra.problem3;


import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class Birthdays {

    //DONE: A
    // Great date API was added with Java 8.
    // New classes were added like LocalDate, Period and others.
    // What does API mean in this context?
    // Answer:
    // Application Programming Interface - suite of classes/implementations
    //
    //

    //DONE: B
    // In the main method initialize birthdays of all of your team mates (do not have to be real birthdays).
    // Call function "oldest" to find out who is the oldest. You will have to modify "oldest" to work properly.
    // Hint: when googling add java 8 to your search
    // Print out the result (oldest date).

    //DONE: C
    // Create a function to find out the age of person.
    // Hint: all the classes you require are mentioned on line 10
    // Print out the result (age in years).

    public static void main(String[] args) {
        LocalDate lucasBirthday = LocalDate.of(1988, 10, 30);
        LocalDate dachiBirthday = LocalDate.of(1998, 6, 16);
        LocalDate olgaBirthday = LocalDate.of(1998, 10, 23);
        LocalDate valdoBirthday = LocalDate.of(1970, 4, 23);
        LocalDate peppeBirthday = LocalDate.of(1999, 12, 5);

        List<LocalDate> birthdays = List.of(lucasBirthday, dachiBirthday, olgaBirthday, valdoBirthday, peppeBirthday);

        LocalDate oldest = oldest(birthdays);
        System.out.println("Oldest birthday: " + oldest);
        System.out.println("Ages in years: ");
        age(birthdays).stream().forEach(System.out::println);

    }

    /**
     * returns the oldest/earliest date
     */
    public static LocalDate oldest(List<LocalDate> birthDays){
        return birthDays.stream().min(LocalDate::compareTo).get();
    }

    public static List<Integer> age(List<LocalDate> birthDays) {
        LocalDate now = LocalDate.now();
        return birthDays.stream().map(x -> Period.between(x, now).getYears()).collect(Collectors.toList());
    }
}
