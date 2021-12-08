/*Napiši program, ki trikrat izpiše števila med 6 in 19. Pri tem prvič uporabi for zanko, drugič while in tretjič do while zanko.*/

public class Naloga1_1 {
    public static void main(String[] args) {
        for (int i = 7; i < 19; i++)
            System.out.println(i);

        System.out.println("--------------------------");

        int r = 7;

        while (r < 19) {
            System.out.println(r);
            r++;
        }
        System.out.println("--------------------------");

        int v = 7;

        do {
            System.out.println(v);
            v++;
        } while (v < 19);
    }
}
