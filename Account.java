public class Account{
int accountNumber;
String name;
double balance;

public Account(int accountNumber,String name,double balance){
this.accountNumber = accountNumber;
this.name = name;
this.balance = balance;
}

public void deposit(double amount){
balance= balance+amount;
System.out.println("deposit successful.New balance "+ balance);
}

public void withdraw(double amount){
if(balance>=amount){
balance= balance-amount;
System.out.println("withdraw successful! .New balance "+ balance);
}
else{
System.out.println("Insufficient balance");
}
}
public void showDetails(){
System.out.println("Account Number: "+accountNumber);
System.out.println("Name: "+name);
System.out.println("Balance: "+balance);
}
}
