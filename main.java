import java.util.*;
class main
 {
    public static void main(String[] args) 
    {
    	boolean cond=true;
    	String[] acc_name=new String[100];
    	double[] acc_balance=new double[200];
    	int x=0;
    	Scanner sc=new Scanner(System.in);
    	while(cond)
    	{
    		System.out.println("1. Add customer account");
    		System.out.println("2. Change customer name");
    		System.out.println("3. Check account balance");
            System.out.println("4. Deposit money");
            System.out.println("5. Withdraw money");
            System.out.println("6. Display account details");
            System.out.println("7. Exit");
            int n=sc.nextInt();
             	if(n==1)
             	 {
             	 	System.out.println("Input customer name");
             	 	String name=sc.nextLine();
             	 	acc_name[x]=name;
             	 	System.out.println("Input acc balance");
             	 	 double bal=sc.nextDouble();
             	 	 acc_balance[x]=bal;
             	 	 System.out.println("Account created successfully");
             	 	 System.out.println("Account name="+acc_name[x]);
             	 	 System.out.println("Account number="+(x+1));
             	 	 System.out.println("Account balance="+acc_balance[x]);
             	 	 x=x+1;
                     //break;

             	 }


              else if(n==2)
                {
                	System.out.println("Enter acc number");
                	int acc_index=sc.nextInt();
                	System.out.println("enter new name");
                	String name_temp=sc.nextLine();
                	String s=acc_name[acc_index];
                	acc_name[x]=name_temp;
                	System.out.println("Name changed successfully");
                	System.out.println("Account number"+acc_index);
                	System.out.println("Account name"+acc_name[acc_index]);
                }


              else if(n==3)
                 {
                 	System.out.println("Enter account number");
                 	int acc_index=sc.nextInt();
                 	System.out.println("Account name="+acc_name[acc_index]);
                 	System.out.println("account balance"+acc_balance[acc_index]);

                 }


              else if(n==4)
                {
                	System.out.println("enter account number");
                	int acc_index=sc.nextInt();
                	System.out.println("enter amount to be deposited");
                	double amt=sc.nextDouble();
                	acc_balance[acc_index]=+amt;
                	System.out.println("money deposited");
                	System.out.println("current balance"+acc_balance);
                }

              else if(n==5)
                {
                	System.out.println("enter account number");
                	int acc_index=sc.nextInt();
                	System.out.println("enter amount to be withdrawn");
                	double amt=sc.nextDouble();
                	acc_balance[acc_index]=-amt;
                	System.out.println("money withdrawn");
                	System.out.println("current balance"+acc_balance);
                }

              else if(n==6)
                {
                	System.out.println("enter account number");
                	int acc_index=sc.nextInt();
                	System.out.println("Account number is"+acc_index);
                	System.out.println("Account balance"+acc_balance[acc_index]);
                	System.out.println("Account name"+acc_name[acc_index]);
                }

               else if(n==7)
                {
                	System.out.println("exiting");
                	System.exit(0);
                }
                 else
                 System.out.println("Wrong input");
             

    	}
    }
 }