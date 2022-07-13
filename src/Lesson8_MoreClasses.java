package CS102;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Lesson8_MoreClasses {
    public static void main(String[] args) {
        int i = 3;
        int j = 3;

        System.out.println(i == j);

        Integer i2 = new Integer(12);
        Integer i3 = new Integer(12);

        System.out.println(i2 == i3); //false
        System.out.println(i2.equals(i3)); //true

        System.out.println(Integer.MAX_VALUE);

        BigInteger wealthOfElon = new BigInteger("3000000000000");
        BigInteger times = new BigInteger("100");
        BigInteger totalWealth = wealthOfElon.multiply(times);
        System.out.println(totalWealth);

        BigInteger bi = new BigInteger("12365478967");
        System.out.println(bi.isProbablePrime(3));

        BigDecimal d1 = new BigDecimal("5646445456465465.4545545");
        d1.divide(new BigDecimal(5));

        String fName = "Nan";
        String lName = "Wang";
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s1 == s2); //false
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4); //true
        System.out.println(s1.equals(s2)); //true

        String s5 = "";
        String s6 = null;
        String s7 = new String();

        System.out.println(s5==s7); //false
        System.out.println(s5==s6); //false

        String s9 = "Welcome";
        System.out.println(s9.replace('W','w'));
        System.out.println(s9.replaceFirst("e","ee"));
        System.out.println(s9.replaceAll("e","a"));
        System.out.println(s9); //Welcome

        s9 = s9.replace('e','o');
        System.out.println(s9); //Wolcomo

        String s10 = "Welcome to Java 102";
        String[] words = s10.split("");
        for (int k = 0 ; k < s10.length(); k++){
            System.out.println(s10.charAt(k));
        }
        String[] tokens = "Java,C?C#,C++".split("[.,:;?]");

        for(int y = 0; y<tokens.length;y++){
            System.out.println(tokens[y]);

            System.out.println(String.valueOf(123.456));

            String s11 = String.valueOf(new char[]{'a','b','c'});
            System.out.println(s11);

            String s12 = "";
            for (char c = 'a' ; c < 'z' ; c++){
                s12 += String.valueOf(c);
            }
            System.out.println(s12);

            StringBuilder s13 = new StringBuilder();
            for (char c = 'a';c< 'z'; c++){
                s13.append(String.valueOf(c));
            }
            System.out.println(s13);
        }
    }
}
