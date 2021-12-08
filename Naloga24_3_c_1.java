//Napiši program, ki izpiše vsoto lihih števil na intervalu med 2 in 35 in števila deljiv s tri med 9 in 18.

public class Naloga24_3_c_1 {
    public static void main(String[] args) {
        int v;
        v = 0;

        for (int i = 3; i < 35; i++) {
            if (i % 2 != 0) {
                v = v + i;
            }
            if (i > 9 && i < 18 && i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
    }
}