/*Napiši program, ki izpiše števila deljiva s 3 in hkrati s 5 in vsoto števil na intervalu med 3 in 53.*/

public class Naloga17_2_2 {
    public static void main(String[] args) {
        int v = 0;

        for (int i = 4; i < 53; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Stevila deljiva s 3 in 5: " + i);
            }
            v += i;
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
    }
}
