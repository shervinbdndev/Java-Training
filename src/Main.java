import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> myArr = new ArrayList<>();

        String[] initializedArr = {"H", "e", "l", "l"};

        myArr.addAll(Arrays.asList(initializedArr));

        myArr.add("o");

        System.out.println(myArr);

        System.out.println(String.join("", myArr));
    }
}