import java.util.*;
class Temp
{
  public static void main(String[] args)
  {
    Account ob = new Account(); //Defaukt Constructor
    ob.Traverse();
  }
}

class Account
{
  public void Traverse()
  {
    Scanner sc = new Scanner(System.in);
    int i=0,num1,balance=0,flag=-1;
    while(i!=1)
    { 
      System.out.println("\n\nEnter 1 to Create Account.\nEnter 2 to Deposit Money.\nEnter 3 to Withdraw Money.\nEnter 4 to Check Account Balance.\nEnter 5 to Exit.");
      System.out.print("\nEnter your Choice: ");
      num1=sc.nextInt();
      if(num1<1 || num1>5)
        System.out.println("Invalid Choice!! \nEnter a Valid Input..!!");
      else
      {
        switch(num1)
        {
          case 1:
            if(flag==-1)
            {
              flag=0;
              System.out.println("Account created successfully.");
            }
            else
              System.out.println("Invalid Choice!! \nAccount already successfully...!");
            break;
          case 2:
            System.out.print("\nEnter the amount you want to deposit: ");
            int temp=sc.nextInt();
            balance+=temp;
            break;
          case 3:
            System.out.print("\nEnter the amount you want to withdraw: ");
            int temp2=sc.nextInt();
            balance-=temp2;
            break;
          case 4:
            System.out.println("Balance in your account is: "+balance);
            break;
          case 5:
            i=1;
            System.out.println("Goodbye!! Have a Nice Day....");
            break;
        }
      }
    } 
    sc.close();
  }
}  