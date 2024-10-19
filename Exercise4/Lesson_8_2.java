package Exercise4;

class Pair {
    int anInt;
    float aFloat;

    public Pair(int x, float y) {
        anInt = x;
        aFloat = y;
    }
}

public class Lesson_8_2 {
    public static void main(String[] args) {
        Pair pairInstance = new Pair(22, 42);
        System.out.println(pairInstance.aFloat);
        System.out.println(pairInstance.anInt);
    }
}