public class Variables {
    

    String name = "";       // 클래스 내부에 있는 변수 : 멤버 변수 = 속성 = 필드 (클래스가 안에서만 적용 됨.)

    public static void main(String[] args) {
        String name2 = "안녕하세요.";   // 메서드(함수) 안에 있는 변수 : 지역 변수 (해당 메서드 안에서만 적용 됨.)

            System.out.println(name2);
    }
}

//  👀  변수 명명 규칙
//  ex) class Car{ 
//          🟡 파스칼 표기법   ->      java에서 클래스를 정의할 때
//          Date, LocalDateTime, String, Scanner

//          🟡 카멜표기법  ->      java에서 변수, 메소드를 정의할 때
//          void speedTest(){  
//              int speedTest = 10;  
//          }    

//          🟡 언더바표기법(스네이크표기법) - 소문자     ->      c, php
//          void speed_test(){
//          }

//          🟡 언더바표기법(스네이크표기법) - 대문자     ->      SQL문법, java에서는 '상수'
//          final int MAX_SPEED = 100;
//          
//          SQL문 예시)
//          SELECT * FROM USER

//           🟡 헝가리언표기법 (변수값에 데이터 형태를 언급해준다. )
//           int iMaxSpeed;
//           String strUserName;
//      }