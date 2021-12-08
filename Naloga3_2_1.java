import java.util.Scanner;

/*Napiši program, ki prebere določeno število vnosov (to mu določimo na začetku - vnesi število vnosov). Nato izpiše vnos in zaporedno številko vnosa.*/

public class Naloga3_2_1 {
    public static void main(String[] args) {
        int a, b;
        b = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Vnesi število vnosov: ");

        a = input.nextInt();
        b = a + 1;

        System.out.print("Vnos: ");
        System.out.println(a);
        System.out.print("Zaporedno stevilo vnosa: ");
        System.out.println(b);
        input.close();
    }
}
