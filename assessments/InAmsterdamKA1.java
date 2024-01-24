package assessments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InAmsterdamKA1 {
	
	public int countAm(String str){
		 int result=0;
		 String count[] = str.split(" ");
		 for(int i = 0; i< count.length; i++ ){
		 if(count[i].equalsIgnoreCase("am")){
		 result = result +1;
		 }
		 }
		 return result;
		 }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		 String string = sc.readLine();
		 InAmsterdamKA1 ele = new InAmsterdamKA1();
		 try{
		 int display = ele.countAm(string);
		 System.out.println(display);
		 }catch(Exception e){
		
		 }

	}

}
