import java.util.HashSet;
import java.util.Set;

public class HelloClass {
    public static void main(String[] args) {
        String hello = "Hello";

        //Примем в качестве условия, что каждый повторяющийся символ требуется выводить один раз
        char[] charArray = hello.toCharArray();
        Set<Character> doubledSymbols = new HashSet<>();

        System.out.print("Дублирующиеся символы: ");
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    doubledSymbols.add(charArray[j]);
                }
            }
        }
        System.out.println(doubledSymbols);
    }
}
