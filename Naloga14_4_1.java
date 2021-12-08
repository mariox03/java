/*Napiši program, ki izpiše vsoto števil na intervalu med 2 in 25 in število števil, ki so v vsoti.*/

public class Naloga14_4_1 {
    public static void main(String[] args) {
        int v;
        v = 0;

        for (int i = 3; i < 25; i++) {
            v = v + i;
            System.out.println(v);
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
    }
}
