import java.util.Scanner;
public class demo009 {
    String Cust_Name = "dileep";
    long Account_no = 123456;
    Double Balance = 10000.00;
    void accept_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("customer name:");
        Cust_Name = sc.nextLine();
        System.out.println(" account number:");
        Account_no = sc.nextLong();
    }
    void Display_details(){
        System.out.println("Hello "+Cust_Name);
        System.out.println("ur balance is "+ Balance);
    }
    public static void main(String[] args){
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
    }
}