/*Napiši program, ki izpiše števila med 6 in 53 in vsoto teh števil deljeno s številom teh števil.*/

public class Naloga15_9_1 {
    public static void main(String[] args) {
        int v = 0;
        float a = 0;
        int m = 0;

        for (int i = 7; i < 53; i++) {
            v = v + i;
            System.out.println(i);
            m++;
        }

        a = (float) v / m;
        System.out.println("------------------------");
        System.out.println("Vsota je: " + a);
        System.out.println("------------------------");
    }
}
