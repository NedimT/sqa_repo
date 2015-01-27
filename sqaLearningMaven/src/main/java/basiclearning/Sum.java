package basiclearning;

public class Sum {
	public static void main(String args[]){
		int sum = 0;
		int i = 0;
		for( i=1;i<=2000; i++){
			sum += i;
			if(sum >= 2000){
				break;
			}
		}
		System.out.println("Sum is " +sum);
	    i =0;
		sum = 0;
		while(sum <= 2000){
			System.out.println("i = "+i+"sum = "+sum);
			sum += i;
			i++;
		}
		System.out.println("i is "+i+" sum is "+sum);
	}
	
}



