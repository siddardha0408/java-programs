class Account{
    String accountNumber;
    String accountType;
    double balance;
    double interestRate;
    double overdraftLimit;
     void setdetails(String accNo,String accType,double bal,double rate,double limit ){
        accountNumber = accNo;
        accountType = accType;
        balance = bal;
        interestRate = rate;
        overdraftLimit = limit;


     }
      void deposit(double amount){
        balance += amount;
        System.out.println("deopsited"+amount+"new balance"+balance);

      }
      void withdraw(double amount){
        if(accountType.equals("current")){
            if((balance+overdraftLimit)>=amount){
                balance -= amount;
                System.out.println("withdraw"+amount+"new balance:"+balance);

            }
            else{
                System.out.println("overdraft limit exceeded!");

            }
        }
        else{
            if(balance >= amount){
                balance -=amount;
                System.out.println("withdraw"+amount+"new balance:");

            }
            else{
                System.out.println("insufficient balance:");

            }
        }
      }
void calculateInterest(){
    if(accountType.equals("savings")){
        double interest = balance*interestRate;
        System.out.println("interest:"+interest);

    }
    else{
        System.out.println("no interest for current account:");

    }
}
 void tansfer(double amount,Account receiver){
    if(balance >= amount){
        balance -= amount;
        receiver.balance += amount;
        System.out.println("transfered"+amount+"to"+receiver.accountNumber);

    }
    else{
        System.out.println("transfer failed:insufficient balance:");

    }
 }
  void display(){
     System.out.println("account number:"+accountNumber);
     System.out.println("account type:"+accountType);
     System.out.println("balance:"+balance);


  }

}

class Bankaccountmanagementsystem
{
     public static void main(String [] args){
        Account acc1 = new Account();
        Account acc2 = new Account();
        acc1.setdetails("s123","savings",5000,0.04,0);
        acc2.setdetails("c456","current",2000,0,5000);
        System.out.println(".....savings account.....");
        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.calculateInterest();
        acc1.display();
        System.out.println("\n.....current account....");
        acc2.deposit(1000);
        acc2.withdraw(4000);
        acc2.calculateInterest();
        acc2.display();
        System.out.println("\n...transfer from savings to current....");
        acc1.tansfer(1000, acc2);
        System.out.println("\n final balances...");
        acc1.display();
        acc2.display();

     }
}