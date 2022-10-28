import java.util.*;
public class Hari {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number that you want to convert it into binary form");
        int n = read.nextInt();
        String binary_num = "";
        do {
            if (n % 2 == 0) {
//                System.out.print(0);
                binary_num += 0;
            } else if (n % 2 == 1) {
//                System.out.print(1);
                binary_num += 1;
            }
            n = n / 2;
        } while (n != 0);
//  Using while loop :
//        while (true) {
//            if (n % 2 == 0) {
//                System.out.print(0);
//                binary_num += 0;
//            }
//            else if (n % 2 == 1) {
//                System.out.print(1);
//                binary_num += 1;
//            }
//            n = n/2;
//            if (n == 0){
//                break;
//            }
//        }
        System.out.println("\n"+"Read this in reverse order"+"\n"+binary_num);
    }
}
