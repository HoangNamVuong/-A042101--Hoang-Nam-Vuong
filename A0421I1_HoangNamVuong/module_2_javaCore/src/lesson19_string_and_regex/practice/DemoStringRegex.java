package lesson19_string_and_regex.practice;
import java.util.regex.Pattern;
public class DemoStringRegex {
    public static void main(String[] args) {
        String a = "hello";
        String b = " world";
        String c = a.concat(b);
        System.out.println(a);
        System.out.println(c);
//        String a = "1";
        System.out.println(a + (2 + 5));

//        String a = "A01";
//        int b = Integer.parseInt(a);
//        String s1 = "Welcome to java";
//        String s3 = "Welcome to java";
//        String s1 = new String("Welcome to java");
//        String s3 = new String("Welcome to java");

//        System.out.println(s1 == s3);
//        System.out.println(s1.substring(5));
//        System.out.println(s1.substring(5,11));
        //StringBuilder // => đơn luồng
       // StringBuffer // => đa luồng
        String str = "Hello word";
        str = "hello";
        str += "1"; // => Hello word1
        str = "Hello" + " " + "world"; // jvm
        str = str + str + str;

        StringBuilder result = new StringBuilder();
        char[] strToChar = str.toCharArray();
        for (int i = strToChar.length - 1; i >= 0; i--) {
            result.append(strToChar[i]);
        }

        System.out.println(Pattern.matches("..a", "baca"));
        System.out.println(Pattern.matches("(a|b)..", "cca"));
        System.out.println(Pattern.matches("[a-zA-Z].c", "cfc"));
        System.out.println(Pattern.matches("[(^h)a-m].c", "hfc"));
        System.out.println(Pattern.matches("[a-gi-n].c", "hfc"));
        System.out.println(Pattern.matches("a*bb", "bb"));
        System.out.println(Pattern.matches(".{2}", "JJ"));
         //validate số điện thoại biết sdt 090, 091, 092 và là số có 10 chữ số
        String regex = "09[012][\\d]{7}"; // regex email => search mạng
        System.out.println(Pattern.matches(regex, "0905263251")); //=> true
        System.out.println(Pattern.matches(regex, "0935896666")); //=> false
        // ID có định dạng HV-xxxx trong số x là chữ số
        String regex1 = "HV-[\\d]{4}";
        System.out.println(Pattern.matches(regex1, "HV-0000"));
        System.out.println(Pattern.matches(regex1, "HV-0020"));
        System.out.println(Pattern.matches(regex1, "HV-00002"));
        System.out.println(Pattern.matches(regex1, "HV-00a2"));
    }
}
