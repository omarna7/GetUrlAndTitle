package Utilities;

public class Stringutilites {
    public static void main(String[] args) {
    }
    public static void  verifyEquals(String expected, String actual){


String result= expected.equals(actual)?"pass": "fail";
        System.out.println(result);
    }
}
