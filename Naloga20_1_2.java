//Napiši program, ki izpiše vsoto vsakega petega števila na intervalu med 1 in 56.

public class Naloga20_1_2 {
    public static void main(String[] args) {
        int c = 0;

        for (int a = 1; a < 56; a++) {
            c = c + 5;
        }
        System.out.print(c);
    }
}
