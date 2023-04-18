import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String temp = "2+47-8*3+1-6-3";
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(temp);
        String[] items = sc.nextLine().split("");
        for (int i = 0; i < items.length; i++) {
            if (!items[i].equals("\\+") && !items[i].equals("-") && !items[i].equals("\\*") && !items[i].equals("/")) {
                if (!items[i+1].equals("\\+") && !items[i+1].equals("-") && !items[i+1].equals("\\*") && !items[i+1].equals("/")) {
                items[i] += items[i+1];
                items[i+1] = "";
                }
              //  System.out.println(items[i]);
            }
        }
        for (String item : items) {
            System.out.println(item);
        }

        //ArrayList<String> arr = new ArrayList<>(Arrays.asList(items));
        //System.out.println(arr);
        //arr.indexOf("*");

        //System.out.println(arr.indexOf("*"));
    }
}