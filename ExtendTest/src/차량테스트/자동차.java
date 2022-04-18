package 차량테스트;
public class 자동차 extends 차량 {
    public String 이름 = "자동차";
    public String 배기량;

    public 자동차 (){
        super(); 
        /* ❗ 차량에서 기본 생성자를 없애 버리면, 여기서 호출하고 있는 차량의 기본 생성자를 불러 올수 없어 에러 발생 ! */

        // super(200,2);
        /* ❗ (기본 생성자가 없을 경우)super 클래스에 만들어져 있는 "최대속도"와 "정원"을 받는 생성자를 받아 오면 에러가 발생 되지 않는다. */

        System.out.println("자동차 생성자 호출!");
        // 차량의 생성자도 호출 됨.
    }

    public 자동차(double 최대속도, int 정원, String 배기량){
        // super.최대속도 = 최대속도;
        // super.정원 = 정원;
        // 직접 초기화 하는 방법도 있지만, 생성자를 사용해서 넘길 수 있다.

        super(최대속도, 정원); 
        // 단, super 클래스에 해당 값을 넘기는 생성자를 만들어 줘야 한다.

        this.배기량 = 배기량;
        System.out.println("자동차의 매개변수를 받는 생성자 ( 최대속도, 정원, 배기량) 호출!");
    }

    public void 정보출력(){
        System.out.println("(차량)이름 : " + super.이름);
        // 🔅 super : 내 부모 (여기서는 차량)
        System.out.println("최대속도 : " + 최대속도);
        System.out.println("정원 : " + 정원);

        System.out.println("배기량 : " + 배기량);
        System.out.println("(자동차) 이름: " + this.이름);
        // 🔅 this : 나 자신 (여기서는 자동차)
    }
}
