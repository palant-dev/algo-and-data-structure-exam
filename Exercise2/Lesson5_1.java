package Exercise2;

// Modifica il file sorgente dell’esercizio precedente (Lesson5_1.java) usando 
// strutture while al posto dei for.

public class Lesson5_1 {
	private int dim;
	
	public Lesson5_1(int d) {
	  dim = d;
  }

	
	public void show() {
		int i = 1;
		while(i <= dim) {
			int j = 1;
			while(j <= dim) {
				System.out.print(i * j);
				System.out.print("\t");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("---");
	}

	public static void main(String[] args) {
		Lesson5_1 x = new Lesson5_1(5);
		Lesson5_1 y = new Lesson5_1(10);
		Lesson5_1 z = new Lesson5_1(12);
		x.show();y.show();z.show();
	}

}
