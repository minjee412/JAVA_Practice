public class 콜라 {

    /* 명시적 초기화 : 변수를 선언할 때, 이미 값을 할당 하는 것 */
    private static int 용량 = 20; // static 은 정적인 변수
    public int 제조일자 = 10; // ➡ 인스턴스 변수 (객체가 만들어져야 의미가 있다.)

    /* 초기화 블럭 (static이 붙는 경우 or 안붙는 경우) */
    /* 1. 붙는 경우 */
    static{
        System.out.println("클래스 초기화 블럭");

        용량 = 40;
        System.out.println("용량 : " + 용량);

        // 제조일자 = 20; // 인스턴스 변수를 쓰면 에러 발생 (객체가 만들어져야 의미가 있기 때문에)
        // System.out.println("제조일자" : " + 제조일자); 
        // 🟠에러 (인스턴스가 만들어 지기 전에 호출 했기 때문에)

    }

    {
        System.out.println("인스턴스 초기화 블럭");

        용량 = 50; // static은 정적인 변수이기 때문에 일반 { } 안에서는 재할당 할 수 없다. 
        제조일자 = 20;
        System.out.println("용량 : " + 용량);
        System.out.println("제조일자 : " + 제조일자);


    }

    public 콜라(){
        System.out.println("생성자 호출");
        용량 = 60;
        제조일자 = 60;
        System.out.println("용량 : " + 용량);
        System.out.println("제조일자 : " + 제조일자);

    }

}
