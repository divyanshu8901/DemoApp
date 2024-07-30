package in.ineuron.bean1;
import java.util.Scanner;

class NotValidAgeException extends Exception
{
	public NotValidAgeException(String message)
	{
		super(message);
	}
}

class Applicant
{
	 	int age ;

		public void input()
		{
			Scanner sc = new Scanner(System.in );
			System.out.println("Enter your age :");
			age = sc.nextInt();
			sc.close();
		}
	
		public void verify() throws Exception
		{
			if(age < 18)
			{
				 
				NotValidAgeException e = new NotValidAgeException("you are not elegible");
				System.out.println(e.getMessage());
				throw e;
				
			}else if (age > 60)
			{
				NotValidAgeException e = new NotValidAgeException("you are not elegible");
				System.out.println(e.getMessage());
				throw e;
				
			}else 
			{
				System.out.println("you are eligible");
			}
		}
		
	 
}

class RTO
{
	public void initiate() throws Exception
	{
		Applicant a = new Applicant();
		a.input();
		a.verify();
	}
	
}


public class LaunchRto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RTO rt = new RTO();
			try {
			rt.initiate();
			}
			catch(Exception e1)
			{
				
			}
	}

}
