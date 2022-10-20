
/*
Program:WAP to take input of age of three people and determine oldest and youngest
 Ashish Sahay
20 oct 2022  
*/
 import java.util.*;//Util Package
 
//declaring a class
class AgeDetermination
{
	
	static void agedetermination(int age1,int age2,int age3, String name1,String name2,String name3) //stars of agedetermination method to check maximum and minimum age and print it
	{
		if((age1>age2)&&(age1>age3))//checking for greater age
		  {
			  System.out.println("Mr./Mrs "+name1+",you are oldest of three person.Your age is "+age1);
		  }
		  else 
		  {
			  if((age2>age3)&&(age2>age1))
			   System.out.println("Mr./Mrs, "+name2+" ,you are older of three person.your age is "+age2);//
		      else
			   System.out.println("Mr./Mrs, "+name3+" ,you are older of three person.your age is "+age3);
		  }
		  //end of ifelse
			  
		  if((age1<age2)&&(age1<age3))//Determining lower age
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
 static void input()//starts of input method
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
		  
		  agedetermination(age1,age2,age3,name1,name2,name3);
		  
		  
	}//end of input method
	
	
	
	//start of main
	public static void main(String args[])
	{
		  input();//calling method to take input from user
		   
		
	}//end of main
}