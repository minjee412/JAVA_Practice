public class 학생테스트 {
    public static void main(String[] args) {
        // 학생 공부하는학생 =  new  학생(); // 기본생성자
        // 공부하는학생.이름 = "박하은"; // 학생 생성자가 호출 되어 짐.

        학생 공부하는학생 =  new  학생("박하은"); // 이름 파라미터를 갖는 학생 생성자가 호출 되어짐.

        System.out.println(공부하는학생.이름);


        학생 조는학생 = new 학생();
        조는학생.이름 = "조하영";

        System.out.println(조는학생.이름);

    }
}
