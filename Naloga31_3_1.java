import java.util.Scanner;

/*Napiši program, ki prebere določeno število vnosov (to mu določimo na začetku - vnesi število vnosov). Nato izpiše prebrana števila, ki so deljiva s številko števila vnosov, ki smo jo določili na začetku*/

public class Naloga31_3_1 {
    public static void main(String[] args) {
        int vnosi;

        Scanner input = new Scanner(System.in);

        System.out.print("Vnesi stevilo vnosov: ");
        vnosi = input.nextInt();

        int a[] = new int[vnosi];

        System.out.println("---------------------------------------");
        System.out.println("Vnesi " + vnosi + " stevil:");

        for (int i = 0; i < vnosi; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("---------------------------------------");
        System.out.println("Stevila deljiva s stevilom vnosov:");
        System.out.println("---------------------------------------");

        for (int i = 0; i < vnosi; i++) {
            if (a[i] % vnosi == 0) {
                System.out.println(a[i]);
            }
        }
        input.close();
    }
}
