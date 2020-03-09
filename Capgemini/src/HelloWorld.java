import java.util.*;

public class HelloWorld {
	 public static void main(String args[]) 
	    { 

		List<String> a1 = new ArrayList<String>();
		a1.add("true");
		a1.add("10");
		a1.add("10");
		a1.add("Akash");
		System.out.println(a1);
		
		List<String> a2 = new LinkedList<String>();
		a2.add("true");
		a2.add("10");
		a2.add("Akash");
		System.out.println(a2);
		
		Set<String> a3 = new HashSet<String>();
		a3.add("true");
		a3.add("Soni");
		a3.add("10");
		a3.add("Akash");
		System.out.println(a3);
		
		Set<String> a4 = new LinkedHashSet<String>();
		a4.add("true");
		a4.add("10");
		a4.add("Soni");
		a4.add("Akash");
		System.out.println(a4);
		
		Set<String> a5 = new TreeSet<String>();
		a5.add("true");
		a5.add("10");
		a5.add("Soni");
		a5.add("Akash");
		System.out.println(a5);
		
		 String s1=new String("a");
		 String s2=new String("a");
		 System.out.println(s1=s2);		 
		 System.out.println(s1==s2);
		 
	    }

	 
}

