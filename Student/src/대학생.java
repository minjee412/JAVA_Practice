public class 대학생 {
    public String 이름;
    public int 나이;
    public String 성별;
    public String 학과;

    public 대학생(){
    }

    public 대학생(String 이름){
        this.이름 = 이름;
    }

    public 대학생(String 이름, int 나이){
        this(이름);
        this.나이 = 나이;
    }

    public 대학생(String 이름, int 나이, String 성별){
        // this.이름 = 이름;
        // this.나이 = 나이;
        this(이름,나이);

        this.성별 = 성별;
    }

    public 대학생(String 이름, int 나이, String 성별, String 학과){
        // this.이름 = 이름;
        // this.나이 = 나이;
        // this.성별 = 성별;
        this(이름,나이,성별);

        this.학과 = 학과;
    }

    // 신입생6
    /* public 대학생(String 이름, String 성별){
        this.이름 = 이름;
        this.나이 = 나이;
        this.성별 = 성별;
        this.학과 = 학과;
    } */

    // 신입생7
    /* public 대학생(String 이름, String 학과){
        this.이름 = 이름;
        this.나이 = 나이;
        this.성별 = 성별;
        this.학과 = 학과;
    } */

    /* 😱 ()에 파라미터는 타입으로 구분 하기 때문에 파라미터 이름이 달라도 타입이 같으면,
    동일한 값으로 인식 됨. 😱 */
}
