import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean flag = isPalindrome(Integer.parseInt(input.next()));
        System.out.println(flag);
    }
    public static boolean isPalindrome(int x){
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }
}
