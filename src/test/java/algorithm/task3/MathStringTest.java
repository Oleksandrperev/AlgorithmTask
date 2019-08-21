package algorithm.task3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathStringTest {

    @Test
    public void testSum() {

        String a = "2";
        String op = "+";
        String b = "2";

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

        Assert.assertEquals("4", result);

        }

    @Test
    public void testSubtraction() {

        String a = "2";
        String op = "-";
        String b = "2";

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

        Assert.assertEquals("0", result);

    }

    @Test
    public void testMultipl() {

        String a = "2";
        String op = "*";
        String b = "2";

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

        Assert.assertEquals("4", result);

    }

    @Test
    public void testDivision() {

        String a = "2";
        String op = "/";
        String b = "2";

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

        Assert.assertEquals("1", result);

    }

    @Test
    public void testIncorrectData() {

        String a = "2";
        String op = "5";
        String b = "2";

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

        Assert.assertEquals("This operator is not accepted", result);

    }


}





