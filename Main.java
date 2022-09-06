class Customer{
    long phoneNo;
    String name;
    String address;

    Customer(long num, String n, String a){
        this.phoneNo = num;
        this.name = n;
        this.address = a;
    }

    public void getCustomer(){
        System.out.println("Phone N0. :" + this.phoneNo);
        System.out.println("Name: "+ this.name);
        System.out.println("Address: "+ this.address);
    }

}

class Account extends Customer{
    String accountType;
    int balance = 5000;

    Account(long num, String n, String a,String at) {
        super(num, n, a);
        this.accountType = at;
    }

    public void getAccountType(){
        System.out.println("Account Type: "+ this.accountType);
    }

    public void withdraw(int amount){
        this.balance = this.balance - amount;
        System.out.println("amount is debited: " + amount);
        System.out.println("Remaining amount: "+ this.balance);
    }
    public void deposit(int amount){
        this.balance = this.balance + amount;
        System.out.println("amount is credited: " + amount);
        System.out.println("Remaining amount: "+ this.balance);
    }

}

public class Main {
    public static void main(String[] args) {
//        Customer c1 = new Customer(9999999999l,"utkarsh","Bihar");
//        c1.getCustomer();

        Account ac1 = new Account(9999999999l,"utkarsh","Bihar", "saving");
        ac1.getAccountType();
        ac1.withdraw(200);
        ac1.deposit(200);

    }
}