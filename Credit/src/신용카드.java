public class 신용카드 {
    public long 카드번호;
    public String 카드소유주;

    public long 카드사용누적금액;
    public long 누적포인트;
    
    // return이 없는 메서드
    public void 카드사용(long 카드사용금액){
        카드사용누적금액 += 카드사용금액;
    }

    // return이 없는 메서드
    public void 카드비용지급(long 지급금액){
        카드사용누적금액 -= 지급금액;

        // long 적립포인트 = 지급금액 / 1000;

        // 포인트지급(적립포인트);
        포인트지급(지급금액 / 1000);
    }

    // return이 없는 메서드(private는 외부에서 사용 못함.)
    private void 포인트지급(long 포인트금액){
        누적포인트 += 포인트금액;
    }

    //카드사용
    //카드비용지급
    //포인트 적립
}
