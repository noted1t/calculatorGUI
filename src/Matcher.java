import java.util.*;

import static java.lang.String.valueOf;

public class Matcher {
 /*   public static void main(String[] args) {
        //  LinkedList<Character> tempedList = new LinkedList<>();
        String temp = "28 + 47 - 8 * 3 / 1 - 6 - 3";
        //String[] split = temp.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        String split[] = temp.split(" ");
        //  for (String s : split) {
        // System.out.println(s);
        //   }
        System.out.println(mathSolver(split));
        //System.out.println(answ(split));
    }

  */


    public double mathSolver(String toCalc) {
        String tokens[] = toCalc.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("*")) {
                double multiply = Double.parseDouble(tokens[i - 1]) * Double.parseDouble(tokens[i + 1]);
                tokens[i + 1] = String.format("%1$,.2f", multiply);
                tokens[i - 1] = null;
                tokens[i] = null;
                list.remove(list.size() - 1);
                //  list.add(tokens[i + 1]);
            } else if (tokens[i].equals("/")) {
                double division = Double.parseDouble(tokens[i - 1]) / Double.parseDouble(tokens[i + 1]);
                tokens[i + 1] = String.format("%1$,.2f", division);
                tokens[i - 1] = null;
                tokens[i] = null;
                list.remove(list.size() - 1);
                // list.add(tokens[i + 1]);
            } else {
                list.add(tokens[i]);


            }
        }
        double result = Double.parseDouble(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals("+")) {
                result += Double.parseDouble(list.get(i + 1));
                i++;
            } else if (list.get(i).equals("-")) {
                result -= Double.parseDouble(list.get(i + 1));
                i++;
            }
        }
        System.out.println(list.toString());

        return result;
    }


}

