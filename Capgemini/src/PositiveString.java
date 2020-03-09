import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=scr.next();
		int flag=0;
		for(int i=0;i<str.length()-2;i++) 
		{
			if(str.charAt(i)<str.charAt(i+1) && str.charAt(i+1)<str.charAt(i+2)) {
				flag=1;
			}
			else
				flag=0;
		}
	if(flag==1) {
		System.out.println("Positive String");
	}
	else {
		System.out.println("Not a Positive String");
	}
}
}