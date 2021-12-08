/*Napiši program, ki izpiše števila in vsoto števil na intervalu med 3 in 23.*/

public class Naloga3_2_s_1 {
    public static void main(String[] args) {

        int i, v;
        i = 4;
        v = 0;

        while (i < 23) {
            System.out.println(i);
            v += i;
            i++;
        }
        System.out.println("-----------------------------");
        System.out.println("Vsota je: " + v);
    }
}
