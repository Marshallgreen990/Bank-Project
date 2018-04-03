/**********************************BANK PROJECT*******************************/


//for scanner and Delay function
              import java.util.*;

//for console reader
             import java.io.*;

//for  IAE
            import java.lang.*;

public class BankFunction{
		static	  long account_Number,mobile_Number;
		 static  String account_Holders_Name;
		 static char account_password;
		 static  double account_Balance =0.0;
		  
	//main method	  
		   public static void main(String[] args) {
			
	 //for iterating the menu bar		  
       do  {
                          menu();
		                  int choice;
						  Scanner scn=new Scanner(System.in);
                                   choice = scn.nextInt();
									switch(choice) { 
                                                       case 1 : 
                                                                     new_User_Registration();
		                                                            break; 
                                                       case 2 : 
                                                                existing_User();
                                                                break; 
                                                       case 3 : 
                                                              System.out.println("exit...");
                                                               System.exit(0);

                                                                 
                                                      default: 
                                                               System.out.println("Invalid response"); 
                                                                      } 

           }while(1==1);
} 

static void menu(){
	iterate();
	                      System.out.println();
						  System.out.println();
						  System.out.println();
						  System.out.println("*******ENTER THE OPTIONS YOU WANT TO PERFORM******");
                          System.out.println();
						  System.out.println();
						  System.out.println("1. NEW USER [ENTER  FOR SIGN UP]");
                          System.out.println("2. EXISTING USER");
						  System.out.println("3. EXIT");
}
	
static void new_User_Registration(){
   clear_The_Screen();
 
	                                                           Scanner scn=new Scanner(System.in);
	                                                            System.out.println("THANK  YOU FOR SHOWING CONCERN TO OUR BANK ");
													            System.out.println();
																System.out.println("PLEASE FILL ALL DETAILS \n");
																System.out.println();
																System.out.printf("  FULL NAME \t\t\t ");
																BankFunction.account_Holders_Name=scn.nextLine();
																
																System.out.printf("\n  MOBILE NO \t\t\t ");
																BankFunction.mobile_Number=scn.nextLong();
															
																System.out.print("\n  ACCOUNt NO \t\t \t ");
																BankFunction.account_Number=scn.nextLong();
															
																System.out.print("\n  DEPOSIT BAL[MIN=500] \t\t ");
																BankFunction.account_Balance=scn.nextLong();

                                                                System.out.println();
																scn.nextLine();
                                                                System.out.print("\nENTER YOUR FOUR DIGIT SECRET NUMBER");
																
																Console cns= System.console();
																char [] account_password=cns.readPassword();;
																System.out.println();
																System.out.println("\n\nTHANK YOU FOR JOING \n");
																System.out.println("YOU WILL BE REDIRECTED AUTOMATICALLY TO OUR HOMEPAGE WITHIN 5 SECONDS");
                                                                try {

		                                                              //sleep 5 seconds
			                                                               Thread.sleep(5000);

			                                                                } catch (InterruptedException e) {
			                                                                   e.printStackTrace();
		                                                                                  }

																	  System.out.println();
	                                                               	 System.out.println();
																	 clear_The_Screen();
                                                                   } 




static void existing_User(){
	
 clear_The_Screen();
                                                           	    System.out.println("ENTER ACCOUNT  No: ");
 													            System.out.println();
																Scanner sc = new Scanner(System.in);
																long ac = sc.nextLong();
																 System.out.println();

																 if(BankFunction.account_Number == ac)
																{ 
																	 System.out.println("WELCOME  "+BankFunction.account_Holders_Name);
																        System.out.println();
																		System.out.println();
											                            System.out.println();
																		System.out.println();
                                                                }											
                                                                 
															else{
           	                                                		System.out.println("USERNAME MISMATCHED");
                                                                    System.exit(0);
															}
															  
															   Scanner scn=new Scanner(System.in);
													   do{
																  
															   System.out.println(" WHAT OPERATION YOU WANT TO PERFORM\n");
															   System.out.println("1.    DEPOSIT         \t  2.    WITHDRAWL\n");
															   System.out.println("3.    CHECK BAL    \t  4.    exit   \n");
                                                              
															
														     		  int choice;
															         	  choice = scn. nextInt();
															         switch(choice) 
																       {
																		  case 1:
																		          	clear_The_Screen();
																		       	    deposit();
                                                                                    break;

                                                                         case 2:
																			         clear_The_Screen();
																		             withdrawl();
																		             break;
                                                                     
																	      case 3:
																		             clear_The_Screen();
																		            System.out.println("Your account balance is\n " +BankFunction.account_Balance);
																			        System.out.println();
																			        System.out.println();
																			        System.out.println();
																		            break;

                                                                         case 4:
													 						        System.out.println("EXIT\n\n");
																		            System.exit(0);

																		default:
																				    System.out.println("invalid option\n");
																   }
 
                                                           }while(1!=0);
                                   }                         


static void deposit(){

  Scanner scn=new Scanner(System.in);
   System.out.println("ENTER AMOUNT TO DEPOSIT\n");
  double amt=scn.nextDouble();
  System.out.println(" SUCCESSFULLY rs" +amt +"Deposited\n");
  amt=BankFunction.account_Balance + amt;
  BankFunction.account_Balance=amt;
}

static void withdrawl(){

 Scanner scn=new Scanner(System.in);
  System.out.println("ENTER AMOUNT YOU WANT TO WITHDRAWL\n");
  double amt=scn.nextDouble();
  if(amt <= BankFunction.account_Balance)
	{
	  System.out.println("Rs" +amt+ "  withdrawl\n");
  amt=BankFunction.account_Balance  -  amt;
  BankFunction.account_Balance=amt;
}
else
	{System.out.println("insufficient balance\n");}
}


 static void iterate(){ 

                          for(int j=0;j<20;j++)
                              {
                                  try {
									   //sleep 5 seconds
			                            Thread.sleep(100);
                                         } catch (InterruptedException e) {
                                                  e.printStackTrace();
                                        }
 
		                          System.out. printf("*");
                              }
	                                      
										  String s="welcome to vipul bank";
       
        
                          for(int j=0;j<s.length();j++)
                                {
                                          try {
                                          //sleep 5 seconds
                                               Thread.sleep(100);
                                                 } catch (InterruptedException e) {
                                                     e.printStackTrace();
                                                   }
                     		System.out.print(s.charAt(j));
								}
   
                                for(int	j=0;j<20;j++)
                                  {
                                     try {
									//sleep 5 seconds
			                           Thread.sleep(100);
                                              } catch (InterruptedException e) {
                                       e.printStackTrace();
                                    }
                             System.out.printf("*");
                                   }
	   }


	  static void clear_The_Screen(){
		  
		   for(int clear = 0; clear < 1000; clear++)
               {
                 System.out.println("\b") ;
			   }
	  }
}

