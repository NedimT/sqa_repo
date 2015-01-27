package classExercise;

import basiclearning.AccesModifiers;

public class AccessModifierPackCaller {
	public static void main(String args[]){
		AccesModifiers am = new AccesModifiers();
		System.out.println(am.publicVar);
		//Can not call outside package
		//System.out.println(am.protVar);
		//System.out.println(am.packVar);
		//Can not access private
		//System.out.println(am.priVar);
	}
}
