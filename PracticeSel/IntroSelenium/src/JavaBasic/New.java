package JavaBasic;

public class New {
	    static int sum = 0;
	    static int[] numbers = {1,2,3,4,5};
	    public static void main(String[] args) {
	        int total = summation();
	        System.out.println(total);

	    }

	    static int summation(){
	        for (int sumBa:numbers){
	            sum += sumBa;
	        }
	        return sum;
	    }
	}

