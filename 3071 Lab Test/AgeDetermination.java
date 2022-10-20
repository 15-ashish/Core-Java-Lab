
/*
Program:WAP to take input of age of three people and determine oldest and youngest
 Ashish Sahay
20 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class AgeDetermination
{
	public static void main(String args[])
	{
		  Scanner sc= new Scanner(System.in);//declaring object of class Scanner
          int age1,age2,age3;
		  
		  String name1;
		  String name2;
		  String name3;// declaring variable name
          
		  System.out.println("Enter the  Name of first person");
		  name1=sc.nextLine();//user input--->name1
		  
		  System.out.println("Enter his/her age ");
		  age1=sc.nextInt();//user input ----> age1
		  
		  System.out.println("Enter the  Name of second person");
		  name2=sc.next();//user input--->name2
		  
		  System.out.println("Enter his/her age ");
		  age2=sc.nextInt();//user input ----> age2
		  
		  System.out.println("Enter the  Name of third person");
		  name3=sc.next();//user input--->name3
		  
		  System.out.println("Enter his/her age ");
		  age3=sc.nextInt();//user input ----> age3
		   
		   
		  
		  	  
		  System.out.println("\n\n");
		  
		 
		 
		  if((age1>age2)&&(age1>age3))//checking for discount
		  {
			  System.out.println("Mr./Mrs "+name1+",you are oldest of three person.Your age is "+age1);
		  }//
		  else 
		  {
			  if((age2>age3)&&(age2>age1))
			   System.out.println("Mr./Mrs, "+name2+" ,you are older of three person.your age is "+age2);//
		      else
			   System.out.println("Mr./Mrs, "+name3+" ,you are older of three person.your age is "+age3);
		  }
		  //end of ifelse
			  
		  if((age1<age2)&&(age1<age3))//Determining age
		  {
			  System.out.println("Mr./Mrs "+name1+",you are youngest of three person.Your age is "+age1);//
		  }
		  else  
		  {
			  if((age2<age3)&&(age2<age1))
			   System.out.println("Mr./Mrs, "+name2+" ,you are youngest of three person.your age is "+age2);//
		      else
			   System.out.println("Mr./Mrs, "+name3+" ,you are youngest of three person.your age is "+age3);
		  }
		  //end of ifelse
		
	}	
		
	}//end of main