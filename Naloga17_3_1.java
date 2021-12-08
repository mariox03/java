/*Napiši program, ki izpiše vsako drugo število med 3 in 43 in vsoto teh števil na intervalu*/

public class Naloga17_3_1 {
    public static void main(String[] args) {
        int i, v;
        i = 4;
        v = 0;

        while (i < 43) {
            System.out.println(i);
            v += i;
            i += 2;
        }
        System.out.println("-----------------------------");
        System.out.println("Vsota je: " + v);
    }
}
