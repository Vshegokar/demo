import java.io.*;
class Armstrong
{
	public static void main(String args[]) throws IOException
	{
		int n,d,temp,sum=0;
		InputStreamReader inp=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(inp);
		System.out.println("Enter a three digit number");
		n=Integer.parseInt(br.readLine());
		temp=n;
		while(n!=0)
		{
			d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		}
		if(sum==temp)
			System.out.println(temp+" is an armstrong number");
		else
			System.out.println(temp+" is not an armstrong number");
	}
}