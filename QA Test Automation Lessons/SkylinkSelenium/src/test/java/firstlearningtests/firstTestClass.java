package firstlearningtests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.ArrayList;

@RunWith(JUnit4.class)
public class firstTestClass {

    @Test
    public void firstTestClass() {
        ArrayList<String> numberArray = new ArrayList<String>();
        numberArray.add("one"); // 0
        numberArray.add("two"); // 1
        numberArray.add("three");//2
        numberArray.add("four");//3
        numberArray.add("five");//4
        numberArray.add("six");//5
        numberArray.add("seven");//6
        numberArray.add("eight");//7
        numberArray.add("nine"); //8
        numberArray.add("ten"); //9

        for (int i = 0; i < 10
                ; i = i + 2) {
            System.out.println(numberArray.get(i) + "is even");
            System.out.println(numberArray.get(i)+ "is odd");
        }
    }
}

