// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
			int n=Integer.parseInt(args[0]);
			String mode=args[1];
			int sum=1;
			if (mode.equals("v"))
			{
				int i=1;
					for( i=1;i<=n;i++) // Why use a for loop and not while result != 1? 
					{
							boolean sumreached=false; //camel case -> sumReached
							sum=i;
							int count=1;
							if (i==1) { // i ==1 is an odd number, so we dont have to repeat code :)
								System.out.print(sum+" ");
								sum=(sum*3)+1;
								count++;
							}
							while (!sumreached)
							{
								System.out.print(sum+" ");
								if (sum==1) {
									System.out.print("("+count+")");
									System.out.println();
									sumreached=true;
								}
								if (sum%2==0)
								{
									sum=sum/2;
								}
								else
								{
									sum=(sum*3)+1;
									
								}
								count++;
							}
					}	
					i=i-1;
					System.out.println("Every one of the first "+i+" hailstone sequences reached 1.");
			}
			if (mode.equals("c"))
			{
				int i=1;
					for( i=1;i<=n;i++)
					{
							boolean sumreached=false;
							sum=i;
							int count=1;
							if (i==1) {
								sum=(sum*3)+1;
								
							}
							while (!sumreached)
							{
								if (sum==1) {
									sumreached=true;
								}
								if (sum%2==0)
								{
									sum=sum/2;
								}
								else
								{
									sum=(sum*3)+1;
									
								}
								
							}
					}	
					i=i-1;
					System.out.println("Every one of the first "+i+" hailstone sequences reached 1.");
			}




			}
	}

// Good job!
// Notice that we could have: 
//  if (mode.equals('V')) {
	// blah blah code
	// }
// System out print ("Every one of the...blah blah") <- this will print for both mode 'v' and mode 'c'
// Since for both modes we need the sentence that sums up eveything


