package com.div;
import java.util.Scanner;

public class MagicalNumbers {
	
	public static int magicNums(int n)
	{
		String binary = null;
		String modified = null;
		
		int count = 0;
		for(int i = 1;i<=n;i++)
		{
			binary = Integer.toBinaryString(i);
			modified = binary.replace("1","2").replace("0", "1");
			
			int sum =0;
			for(int j = 0;j<modified.length();j++)
			{
				sum+=modified.charAt(j)-'0';
			}
			if(sum%2 != 0)
			{
				count++;
			}
		}
		
		//System.out.println("binary form : " + binary);
		//System.out.println("modified binary form : "+modified);
		
		
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(magicNums(n));
	}

}
