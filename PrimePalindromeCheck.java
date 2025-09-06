import java.util.Scanner;
public class PrimePalindromeCheck {
     static boolean isprime(int num){
        if(num<=1)
        return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
            return false;

        }
        return true;

     }
     static boolean ispalindrome(int num){
        int original=num;
        int reversed=0;
        while(num>0){
        int digit=num%10;
        reversed=reversed*10+digit;
        num/=10;
        }
        return original==reversed;


     }
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=sc.nextInt();
        boolean prime=isprime(number);
        boolean palindrome=ispalindrome(number);
        if(prime&&palindrome){
            System.out.println(number+"is a prime palindrome");

        }
        else if(prime){
            System.out.println(number+"is a prime but not a palindrome");

        }
        else if(palindrome){
            System.out.println(number+"is a palindrome but not a prime");

        }
        else{
            System.out.println("numberis neither prime nor palindrome");

        }
        sc.close();

     }
    
}
