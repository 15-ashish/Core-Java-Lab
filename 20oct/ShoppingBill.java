
/*
Program:WAP to give 10% discount to user whose shopping bill is greater than 2000
 Ashish Sahay
 20 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class ShoppingBill //calculating  discount
{
	static void calc(String itemname,int qty)
	{
		 float discountedamount,finalamount;
		 int totalbill=(qty*540);
		  if((totalbill>=2000))//checking for discount
		  {
			  System.out.println("Your Item ,"+itemname+" is eligible to get discount of 10% ");//
			  discountedamount=(totalbill/10);
			  finalamount=(float)(totalbill-discountedamount);
			  System.out.println("Your final amount to pay is "+finalamount);
			  
		  }
		  else
		  {
			   System.out.println("sorry !!! Your item, "+itemname+" is not eligible to get dicount....You have to pay "+totalbill);//
		  }//end of ifelse
	}//end of ShoppingBill() method
	
	
	
	
	
	
	static void input()//method starts
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          
		  
		  String itemname;// declaring variable 
          int qty;
		  
		  System.out.println("Enter the Item Name");
		  itemname=sc.nextLine();//user input-->> item name
		  
		  System.out.println("Enter the quantity");
		  qty=sc.nextInt();//user input ----> quantity
		  calc(itemname,qty);//calling method to calculate discount
	}
	//end of input()
	
	public static void main(String args[])
	{
		  input();//calling method to take input
		  

		
	}//end of main
}