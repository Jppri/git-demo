package JavaBasic;

import java.util.Arrays;

public class JavaIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 5;
		char letter = 'j';
		String name = "jeff";
		double price;
		boolean myCard = true;

		System.out.println("hi, my name is " + name + " and I'm " + age + " years old.");
		
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2[2]);
		
		//List<int> arr2ArrayList = Arrays.asList(arr2);
		//for loop
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int j = 0; j<arr2.length; j++) {
			System.out.println(arr2[j]);
		}
		
		//String Array
		String[] names = {"jeff", "adrian", "angela", "aj"};
		
		for(int k = 0; k<names.length; k++) {
			System.out.println(names[k]);
		}
		
		for(String s:names) {
			System.out.println(s);
		}
		
		for(int j:arr2) {
			System.out.println(j);
		}
	}

}
