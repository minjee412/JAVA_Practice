package 차량테스트;
public class 차량 {
    
    public String 이름 = "차량";
    public double 최대속도;
    public int 정원;

    public 차량(){
        System.out.println("차량의 기본 생성자 호출!");
    }

    public 차량(double 최대속도, int 정원){
        System.out.println("차량의 매개변수를 받는 생성자(최대속도,정원) 호출 !");
        this.최대속도 = 최대속도;
        this.정원 = 정원;
    }
    // 최대속도 , 정원 값을 넘기는 생성자

    public void 정보출력(){
        System.out.println("이름 : " + 이름);
        System.out.println("최대속도 : " + 최대속도);
        System.out.println("정원 : " + 정원);
    }
}
