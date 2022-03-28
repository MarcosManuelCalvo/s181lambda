import java.util.Arrays;
import java.util.ArrayList;
public class S1811 {
/*Tenint una llista de cadenes de noms propis,  escriu un mètode que retorn e una
llista de totes les cadenes que comencen amb la lletra 'a' (mayuscula ) i  tenen
exactament 3  lletres. Imprimeix el resultat . 

Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers.
Cada element  hauria d'anar precedit per la  lletra  "e" si el nombre és parell ,
i precedit de la lletra  "o" si el nombre és imparell.
Per exemple, si la llista  d'entrada és (3,44), la  sortida hauria de ser "o3, e44". 
Imprimeix el  resultat. 

Tenint una llista de Strings, escriu un mètode  que retorne una llista de totes les
cadenes  que continguen la lletra ‘o’ i  imprimeix el resultat . 

Has de fer el mateix que en el punt anterior,  però retornant una llista que
incloga els elements amb  més de 5 lletres. Imprimeix  el  resultat. 

Crea una llista amb  els nombs dels mesos de  l’any. Imprimeix tots els
elements de la llista amb  una lambda. 

Has de  fer la mateixa impressió del punt  anterior  però fent-ho mitjançant method reference.

void a3(String[] lista);
String opei(String cadena);
String[] o(String[] lista);
String[] mes5(String[] lista);
void print();
void printR();


*/
	public static void main(String[] args) {
		String[] lista = new String[10];
		lista[0] = "loquendo";
		lista[1] = "Ant";
		lista[2] = "3,44";
		lista[3] = "jhon";
		lista[4] = "parvul";
		lista[5] = "5,6,7,5";
		lista[6] = "ostres";
		lista[7] = "Ane";
		lista[8] = "88,5";
		lista[9] = "Arr";
		interface I00_lambdas {
			void a3(String[] o);
			
		}
		I00_lambdas l0 = (list) -> {
			Arrays.stream(lista)
				.forEach(s -> {
					if(s.charAt(0)=='A')
						if(s.length()==3)
							System.out.println(s);
				}
				);
		};
		l0.a3(lista);
		
		interface I01_lambdas {
			String opei(String cadena);
		}
		I01_lambdas l1 = (cad) -> {
			String s = "";
			String temp = "";
			int i = 0;
			int t = 0;
			String l = cad;
			while(i<cad.length()) {
				if(l.charAt(i)!=',') {
					temp = temp+l.charAt(i);
				}
				else {
					if(temp.length()!=0) {
						t = Integer.parseInt(temp);
						if(t%2 == 0) {
							s = s+'e'+temp+',';
							temp = "";
						}
						else {
							s = s+'o'+temp+',';
							temp = "";
						}
					}
				}
				i++;
			}
			if(i==cad.length()) {
				t = Integer.parseInt(temp);
				if(t%2 == 0) {
					s = s+'e'+temp;
				}
				else {
					s = s+'o'+temp;
				}

			}
			return s;
		};
		System.out.println(l1.opei(lista[2]));
		System.out.println(l1.opei(lista[5]));
		System.out.println(l1.opei(lista[8]));
		
		interface I02_lambdas {
			ArrayList o(String[] String );
		}
		I02_lambdas l2 = (list) -> {
			ArrayList<String> ret = new ArrayList<String>();
			Arrays.stream(lista)
				.forEach(s -> {
					if(s.contains("o")) {
						System.out.println(s);
						ret.add(s);
					}
				}
				);
			return ret;
		};
		l2.o(lista);
		
		interface I03_lambdas {
			ArrayList mes5(String[] String );
		}
		I03_lambdas l3 = (list) -> {
			ArrayList<String> ret = new ArrayList<String>();
			Arrays.stream(lista)
				.forEach(s -> {
					if(s.length()>5) {
						System.out.println(s);
						ret.add(s);
					}
				}
				);
			return ret;
		};

		l3.mes5(lista);
		
		
		

		String[] lista2 = new String[12];
		lista2[0] = "gener";
		lista2[1] = "febrer";
		lista2[2] = "març";
		lista2[3] = "abril";
		lista2[4] = "maig";
		lista2[5] = "juny";
		lista2[6] = "juliol";
		lista2[7] = "agost";
		lista2[8] = "setembre";
		lista2[9] = "octubre";
		lista2[10] = "novembre";
		lista2[11] = "desembre";
		
		
		
		Arrays.stream(lista2).forEach(num -> System.out.println(num));;
	
	}

}
