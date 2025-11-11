// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int input=Integer.parseInt(args[0]);
		double sum=1;
		double divider=3;

		for(int i=1;i<input;i++)
		{
				if (i%2==1) 
				{
				sum=sum-(1.0/divider);
				
				}
				else
				{ 
					sum=sum+(1/divider);
					
				}
				divider=divider+2;
		}
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     "+sum*4);
	}
}
