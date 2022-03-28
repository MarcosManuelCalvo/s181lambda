package s1813;


/*
Crea  una Functional Interface que conting a un mètode abstracte reverse (),
que retorn e un valor String; en una  altra classe,  injecta a la interfície
creada mitjançant una lambda el cos de l  mètode, de manera que torne la  mateixa
cadena que rep  com a paràmetre  però a l'inrevés.
Invoca la instància de la  interfície passant-li una cadena i  comprovant el resultat. 
*/
public class s1813 {

	public static void main(String[] args) {
		Lambda l1 = (s) -> {
			String result = "";
	         for(int i = s.length()-1; i >= 0; i--)
	            result += s.charAt(i);
	         return result;
		};

		System.out.println(l1.reverse("lopokis"));
	}

}
