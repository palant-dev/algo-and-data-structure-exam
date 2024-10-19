package Exercise2;

// A seconda del valore assunto dalla variabile x, il programma dovrebbe scrivere una parola diversa.
// – Ad esempio, con x == 3 il programma dovrebbe scrivere «baciare».
// – Purtroppo, però, il programmatore ha commesso qualche errore… Come si comporta in realtà il programma? Come bisogna modificarlo  perché si comporti secondo le specifiche?

public class Lesson5_5 {

	public static void main(String[] args) {
		int x = 3;
		switch (x) {
		case 1: System.out.println("tell"); 
                break;
		case 2: System.out.println("do"); 
                break;
		case 3: System.out.println("kiss"); 
                break;
		case 4: System.out.println("letter"); 
                break;
		case 5: System.out.println("testament"); 
                break;
		default: System.out.println("dunno..."); 
                break;
		}

	}

}
