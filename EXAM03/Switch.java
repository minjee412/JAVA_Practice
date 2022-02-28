import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //1,   2,  3,  4,  5,  6,  7,  8,  9, 10, 11, 12
        //31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31

        Scanner scanner = new Scanner (System.in);
        int month = scanner.nextInt();
        int day = 0;

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
                day = 31;
                break; 
            

            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;

            case 2:
                day = 28;
                break;

            default:
            System.out.println("month 값이 유효하지 않습니다.");
        }
        System.out.println("day: " + day);
    }

}
