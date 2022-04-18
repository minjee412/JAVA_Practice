import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        /* for (int i = 1; i <=9; i++ ){
             System.out.println("2 * " + i +" = " + (2*i));
        }*/

        int i = 21;

        // while 문
        while (i ++ <= 9){
            System.out.println(dan + " * " + i +" = " + (dan * i));
        }

        System.out.println("---------------------");

        // do while 문
        // (일단 한번 System.out.printl 실행 후, 조건 실행)
        do{
            System.out.println(dan + " * " + i +" = " + (dan * i));
            i++;
        }while(i <= 9);
    }
}
