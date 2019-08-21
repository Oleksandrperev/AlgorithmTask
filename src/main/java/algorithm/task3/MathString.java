package algorithm.task3;

public class MathString {

    public static String calc(String a, String op, String b) {

        Integer numberA = Integer.valueOf(a);

        Integer numberB = Integer.valueOf(b);

        int res;

        String result = "";

        switch (op) {
            case "+":
                res = numberA + numberB;
                result = String.valueOf(res);
                break;
            case "-":
                res = numberA - numberB;
                result = String.valueOf(res);
                break;
            case "*":
                res = numberA * numberB;
                result = String.valueOf(res);
                break;
            case "/":
                res = numberA / numberB;
                result = String.valueOf(res);
                break;
            default:
                result = "This operator is not accepted";
                break;
        }

        return result;
    }

}
