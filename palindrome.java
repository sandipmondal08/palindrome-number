import java.util.*;
public class palindrome {
    public static void checkPalindrome(int n){
        int num = n;
        int palindrome = 0;
        int pow = 0;
        while(n > 0){
            int lastDigit = n % 10;
            palindrome = palindrome * 10 + lastDigit;
            pow++;
            n = n/10;
        }

        if(num == palindrome){
            System.out.print(num +" is a palindrome number");
        }else{
            System.out.print(num + " is not a palindrone number");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        checkPalindrome(a);
    }
}
