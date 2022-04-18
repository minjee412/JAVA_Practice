public class if_for {
    public static void main(String[] args){
        int age = 15;
        String item = "";
        String subItem = "";

        System.out.println("조건시작!");
        
        //  성인여부 확인
        // if (age > 12) item = "아이템1";
        if (age > 19) {
            item = "아이템1"; subItem="서브아이템1";
        } else{
            item="없음";
            subItem="없음";
        }

        System.out.println("조건끝!");
        System.out.println("item:" + item);
        System.out.println("subItem:" + subItem);

    //     //조건-1
    //     if(조건){
    //         //  참일때 진행
    // }

    //     //조건-2
    //     if(조건){
    //         //  참일때
    //     } else{
    //         //  참이 아닐때
    //     }

    //     //조건-3
    //     if(조건1){
    //         // 조건1이 참일때 실행
    //     } else if (조건2){
    //         //  조건2가 참일때 실행
    //     } else {
    //         // 조건1, 조건2가 참이 아닐때
    //}    

    }
}
