package exhan;
public class UserRegistration 
{

public void profile(String country,int age)throws InvalidAgeException,InvalidCountryException

{
	if(!"India".equals(country))
	{
		throw new InvalidCountryException("user outside india cannot be registered");
			}
	if(age<18)
	{
		throw new InvalidAgeException("user is not eligible");
		
	}
}
	public static void main(String[] args) 
	{
		UserRegistration r=new UserRegistration();
		try
		{
			r.profile("India",17);
			
		}
		catch(ArithmeticException i)
		{
			System.out.println(i.getMessage());
		}
		
		catch(InvalidCountryException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
