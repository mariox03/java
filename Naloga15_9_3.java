import java.util.Scanner;

/*Napiši program, ki prebere dve števili, ki morata biti manjši od 45, 
njuna razlika pa večja od 9 in prvo število manjše od drugega. V primeru, da to ne drži
izpiše, da je prišlo do napake. Števila na intervalu med prebranima številoma sešteje
in izpiše vsoto in srednjo vrednost.
*/

public class Naloga15_9_3 {
    public static void main(String[] args) {
        int x, y, v;
        float d, c;
        c = 0;
        v = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi prvo stevilo: ");
        x = input.nextInt();
        System.out.print("Vnesi drugo stevilo: ");
        y = input.nextInt();

        if (x < 45 && y < 45 && y - x > 9 && x < y) {
            for (int i = x; i < y; i++) {
                v += i;
                c = c + 1;
            }
        } else {
            System.out.println("Prislo je do napake!");
        }
        d = v / c;
        System.out.print("Povrecna vrednost je: " + d);
        input.close();
    }
}
