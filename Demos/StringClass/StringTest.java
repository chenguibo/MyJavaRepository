package StringClass;

import java.util.StringJoiner;

public class StringTest {
    public static void main(String[] args) {
//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        String s3 = "abc";
//        String s4 = "abc";
//        System.out.println(s1 == s2); // 比较堆地址。false
//        System.out.println(s3 == s4); // 比较串值。true
//        System.out.println(s3 == s1); // 堆地址和串值比较。false
//
//        System.out.println(s1.equals(s2)); // true
//        System.out.println(s1.equalsIgnoreCase(s2)); // true。忽略大小写
//        System.out.println(s1.equals(s3)); // true
        // 注意：next()输入的，和串值==比较，是false

//        String s1 = "cgb";
//        System.out.println(s1.charAt(1)); // g

        // StringBuilder相关用法。StringBuilder的字符串拼接效率快
//        StringBuilder s1 = new StringBuilder("cgb");
//        s1.reverse();
//        System.out.println(s1); // bgc
//        s1.append("lll");
//        System.out.println(s1); // bgclll
//        System.out.println(s1.length()); // 6
//        String s2 = s1.toString();
//        System.out.println(s2); // bgclll

        // StringJoiner相关用法。StringJoiner的字符串拼接更方便。
//        StringJoiner s1 = new StringJoiner(", ", "[", "]");
//        s1.add("2");
//        System.out.println(s1.toString()); // [2]
//        System.out.println(s1.length()); // 3

        String s1 = "abc";
        char[] c1 = s1.toCharArray();
        System.out.println(c1[1]); // b
    }
}
