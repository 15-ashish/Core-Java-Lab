
/*
Program:WAP to give 10%discount to user whose shopping bill id id greater than 2000
 Ashish Sahay
 20 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class ShoppingBill
{
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          int qty;
		  float discountedamount,finalamount;
		  String itemname;// declaring variable 
          
		  System.out.println("Enter the Item Name");
		  itemname=sc.nextLine();
		  
		  System.out.println("Enter the quantity");
		  qty=sc.nextInt();//user input ----> quantity
		  
		  	  
		  System.out.println("\n\n");
		 
		 int totalbill=(qty*540);
		  if((totalbill>=2000))//checking for discount
		  {
			  System.out.println("Your Item ,"+itemname+" is eligible to get discount of 10%");//
			  discountedamount=(totalbill/10);
			  finalamount=(float)(totalbill-discountedamount);
			  System.out.println("Your final amount to pay is "+finalamount);
			  
		  }
		  else
		  {
			   System.out.println("sorry !!! Your item, "+itemname+" is not eligible to get dicount....You have tp pay "+totalbill);//
		  }//end of ifelse
		
	}	
		
	}//end of main