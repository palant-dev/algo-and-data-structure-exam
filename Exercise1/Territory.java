package Exercise1;
public class Territory {
        double area;
        int inhabitants;
    
        Territory(double s, int a) {
             area = s;
             inhabitants = a;
        }

        Territory() {
          area = 0.0;
          inhabitants = 0;
        }
    
        double density() {
             return inhabitants / area;
        }
}
