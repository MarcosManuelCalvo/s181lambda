package s1812;

public class s1812 {
/*Crea una Functional Interface que continga  un mètode abstracte getPiValue (),
 * que retorn a un valor double; en una  altra classe, instancie la  interfície
 * i assigneu-li  mitjançant una lambda el valor 3.1415.
 * Invoca  el  mètode getPiValue de la  instància d'interfície i  imprimeix el resultat . */
	public static void main(String[] args) {
		Lambda l1 = () -> {
			return 3.1415;
		};

		System.out.println(l1.getPiValue());
		
	}

}
