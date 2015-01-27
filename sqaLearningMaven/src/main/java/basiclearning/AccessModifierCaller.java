package basiclearning;

public class AccessModifierCaller {
	
	public static void main(String args[]){
		AccesModifiers am = new AccesModifiers();
		System.out.println(am.publicVar);
		System.out.println(am.protVar);
		System.out.println(am.packVar);
		//Can not access private
		//System.out.println(am.priVar);
	}
}
