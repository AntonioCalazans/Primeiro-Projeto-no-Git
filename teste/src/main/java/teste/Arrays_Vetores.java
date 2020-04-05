package teste;
///Comentário - branch antonio_neto
public class Arrays_Vetores {

	public static void main(String[] args) {

		int[] a = new int[100];
		String nomeDoProjeto = FakerAPI;
		int counter = 0; //Contador para o array
		int par = 0; // Incrementar números pares
		
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				a[i] = i;
				System.out.println("a " + i + " = " + i);
				
				par++;
				counter++;
				
				if (counter == 10) {
					System.out.println();
					counter = 0;
					
				}
			
			}
			
		}
		System.out.println("Quantidade de números: " + par);
	}

}
