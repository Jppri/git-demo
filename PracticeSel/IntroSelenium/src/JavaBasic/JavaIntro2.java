package JavaBasic;

import java.util.*;

public class JavaIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] numbers = {1,3,5,7,6};
		    int sum = 0;
		    System.out.println(numbers[0]);
		    System.out.println(numbers[4]);
		    
		    for(int i=4; i>=0; i--){
		        System.out.println(numbers[i]);
		    }
		    
		    for(int j=0; j<numbers.length; j++){
		        sum += numbers[j];
		    }
		    System.out.println(sum);
		    System.out.println("*************");
		    ArrayList<String> a = new ArrayList();
		    //create object of the class - object.method
		    a.add("jeff");
		    a.add("Kim");
		    a.add("adrian");
		    a.add("aj");
		    a.add("angela");
		    //System.out.println(a.get(4));
		    
		    for(int i=0; i<a.size(); i++) {
		    	System.out.println(a.get(i));
		    }
		    System.out.println("*************");
		    for(String val:a) {
		    	System.out.println(val);
		    }
		    
		   System.out.println(a.contains("jeff"));
		   
		   String intro = "Hello po gago ka";
		   String[] splittedString = intro.split(" ");
		   for(String g:splittedString) {
			   System.out.println(g);
		   }
		   System.out.println(splittedString[1].trim());
		   
		   for(int i=intro.length()-1; i>=0; i--) {
			   System.out.println(intro.charAt(i));
		   }
		    
	}
}
