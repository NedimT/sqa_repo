package basiclearning;

public class Exercise6 {
	public static void main(String args[]){
		String[] stringArr = new String[]{" Turkey", "GrEece", "England ","Germany", "Mexico"};
		printF3(stringArr);
	}
	public static void printF3(String[] sArr){
		boolean bool = false;
		for(int i=0; i<= (sArr.length-1); i++) {
			if(sArr[i].length() >3 | bool){
				sArr[i] = sArr[i].toLowerCase();
				bool = true;
			}
			sArr[i] = sArr[i].trim();
			System.out.println("First 3 letters of "+sArr[i]+" is "+sArr[i].substring(0,3));
				
		}
	}
}
