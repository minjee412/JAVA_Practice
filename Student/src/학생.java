public class 학생 {
    public String 이름;

    /*
    //기본생성자 (메서드와 비슷하게 생겼지만, void가 없음)
    public 학생(){
        System.out.println("학생 생성자가 호출 되어 짐.");
    }
    */

    //(String 이름) 이라는 매개변수를 갖는 생성자
    public 학생(String 이름){
        System.out.println("이름 파라미터를 갖는 학생 생성자가 호출 되어짐.");
        this.이름 = 이름;
    }

    /*  😨 원래 자바에서는 기본 생성자를 알아서 만들어줌. 😨 
    단, 기본 생성자 외에 임의로 파라미터를 갖는 생성자를 만들었을때는 기본 생성자 안만들어짐.
    그래서 따로 기본 생성자도 만들어 줘야 됨.  */

    //기본생성자 (메서드와 비슷하게 생겼지만, void가 없음)
    public 학생(){
        System.out.println("학생 생성자가 호출 되어 짐.");
    }

}
