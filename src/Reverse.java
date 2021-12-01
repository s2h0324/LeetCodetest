import java.util.Scanner;
import java.util.jar.Pack200;

import static java.lang.String.valueOf;
//方法一
/**
 StringBuffer s = new StringBuffer(x+"");
 if(s.charAt(0) == '-') {
 s.reverse();
 String ss = s.substring(0, s.length() - 1);
 try {
 return -Integer.valueOf(ss);
 }catch (Exception e){
 return 0;
 }
 }

 else{
 s.reverse();
 try {
 return Integer.valueOf(s.toString());
 }catch (Exception e){
 return 0;
 }
 }**/
public class Reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //String x  = String.valueOf(reverse(Integer.valueOf(input.next())));
        int x = Integer.parseInt(input.next());
        System.out.println(reverse(x));
    }
    public static Integer reverse(int x){
        long n = 0;
        while(x != 0){
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n==n?(int)n:0;
    }
}
