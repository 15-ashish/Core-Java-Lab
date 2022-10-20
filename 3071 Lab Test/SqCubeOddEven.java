/*
Program: menu driven program
Ashish Sahay
19 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class SqCubeOddEven
{
	
	   //calc method starts
	   static void calc(int g,float num) //formal arguments 
	   {
		    switch(g) //Switch case starts----->>>taking input value in int g and switches the control to desired case
			{
			 case 1:
			     
				 float sq=num*num;
				 System.out.println("Square of given number is "+sq); //Squaring 
				 
				 
		      break;  //break the flow and allow the control to come out of switch case
			
			 case 2:
                   float cube=(num*num*num);
				   System.out.println("Cube of given number is "+cube); //cubing
				   
		      break;   //break the flow and allow the control to come out of switch case
			
			 case 3:
			      if(num%2==0)
					  System.out.println("Given number is even");//odd/even
				  else
					  System.out.println("Given number is odd ");
				  
		      break; //break the flow and allow the control to come out of switch case
			
			 
			 default:
			   System.out.println("Invalid Input");//Runs if all other cases are not met.
			  
			} 
	   }//End of calc() method
	   
	   static void input() //method to take input from user 
	   {
		   Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          
		  float number;
		  int choice;
          
		  System.out.println("Enter your number:");//user input------->@number
		  number=sc.nextFloat();
		  
		  System.out.println("Enter your choice 1->square 2->cube and 3-> check odd/even");
		  choice=sc.nextInt();//user input ----> choice
		  
		  calc(choice,number);
		  
		  
	   }

   
	//main started
	public static void main(String args[])
	{
		  
		  
		 input(); 
		
		   
	}
		
	// end of main
}
// end of class 
