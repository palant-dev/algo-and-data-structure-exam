package Exercise2;


public class Lesson5_4 {
	private int top;
	
	public Lesson5_4(int t) {
	  top = t;
  }
	
	public void show() {
		for(int i = 2; i <= top; i++) {
			boolean divisibile = false;
			int j = 2;
			while((j < i) && !divisibile) {
				if(i % j == 0) divisibile = true;
				j++;
			}
			if(!divisibile) System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Lesson5_4 x = new Lesson5_4(100);
		x.show();
	}

}
