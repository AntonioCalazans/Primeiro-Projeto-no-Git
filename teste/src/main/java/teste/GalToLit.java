package teste;

public class GalToLit {

	public static void main(String[] args) {
		double gallons;
		double litters;
		double gallonsxliters = 3.754;
		
		int counter;
		
		counter = 0;
		for (gallons = 1; gallons <= 100; gallons++) {
			litters = gallons * gallonsxliters;
			System.out.println(gallons + " gallons is " + litters + " litters." );
			
			counter++;
			
			if(counter == 10) {
				System.out.println();
				counter=0;
			}
		}
		
		
		
	}

}
