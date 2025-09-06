import java.util.Scanner;
class bank {
    public double getinterestrate(){
        return 0;
    }
}
 class SBI  extends bank{
    public double getinterestrate(){
        return 8.4;
    }
}
 class HDFC extends bank{
    public double getinterestrate(){
        return 7.3;
    }
}
    class ICICI extends bank{
        public double getinterestrate(){
            return 9.7;
        }
    }
    class PNB extends bank{
        public double getinterestrate(){
            return 8.5;
        }
    }
public class Bankinterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name (SBI, HDFC, ICICI, PNB): ");
        String bankName = sc.nextLine();
        bank b;
        switch (bankName.toUpperCase()) {
            case "SBI":
                b = new SBI();
                break;
            case "HDFC":
                b = new HDFC();
                break;
            case "ICICI":
                b = new ICICI();
                break;
            case "PNB":
                b = new PNB();
                break;
            default:
                System.out.println("Invalid bank name.");
                sc.close();
                return;
        }
        System.out.println("The interest rate for " + bankName.toUpperCase() + " is: " + b.getinterestrate() + "%");
        sc.close();
    }
}
