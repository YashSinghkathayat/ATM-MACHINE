
import java.util.*;



class ATM {

    float Balance;
    int PIN = 6288;

    public void checkpin(){
        System.out.println("Enter the pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin== PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            
        }

    }

    public void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();


        if(opt==1){
            CheckBalance();
        }
        else if(opt==2){
            WithdrawMoney();
        }
        else if (opt==3){
            DepositeMoney();
        }
        else if(opt==4){
            return;
        }else{
            System.out.println("enter a valid choice");
        }



    }
    public void CheckBalance(){
        System.out.println("Balance"+ Balance);
        menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter the amount to Withdraw :");
        Scanner sc  = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }else{
            Balance = Balance - amount;
            System.out.println("money withdrwal sucessfully");
            System.out.println("Current Balance: "+ Balance);
            menu();
        }
        
    }
    public void DepositeMoney(){
        System.out.println("Enter the amount :");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        Balance = Balance + amount;
        System.out.println("Money deposited sucessfully");
        System.out.println("Current Balance: "+ Balance);
        menu();

    }
    
     
}



public class AtmMachine{
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();
        
    }


}