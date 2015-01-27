package classExercise;

import basiclearning.AccesModifiers;

public class AccesModifiersChild extends AccesModifiers{
	public static void main(String args[]){
		AccesModifiersChild am = new AccesModifiersChild();
		System.out.println(am.publicVar);
		System.out.println(am.protVar);
		//Can not call outside package
		//System.out.println(am.packVar);
		//Can not access private
		//System.out.println(am.priVar);
	}
}
