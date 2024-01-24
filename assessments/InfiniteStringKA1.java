package assessments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfiniteStringKA1 {
	
	public static int inf_string(String a, String b)
	{
	  boolean res = false;
	  
	  while(a.length()<b.length()){
		  a = a+a;
	 }
	 res = a.contains(b);
	 if(res==true) {
		return 1;
	 }
     return 0;
		
	}
	public static void main(String[] args)throws  IOException,NumberFormatException
	{
		// TODO Auto-generated method stub
		int t;
		 BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		 t =Integer.parseInt(input.readLine());
		
		 try{
		 while(t>0)
		 {
			 
			 
		 String a = input.readLine();
		 String b[] = a.split(" ");
					 
		 int ans = inf_string(b[0], b[1]);
		 
		 if(ans == 1)
		 {
		 System.out.println("YES");
		 }
		 else
		 {
		 System.out.println("NO");
		 }
		
		 t--;
		 }
		 }catch(Exception e){
		
		 }
		 

	}

}
