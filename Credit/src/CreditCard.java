public class CreditCard {
    private long cardNumber;
    public String cardOwner;

    public long balance;
    public long point;

    // public void 카드사용(long 카드사용금액){
    //     카드사용누적금액 += 카드사용금액;
    // }
    public void use(long amount){
        balance += amount;
    }

    // public void 카드비용지급(long 지급금액){
    //     카드사용누적금액 -= 지급금액;
    //     포인트지급(지급금액 / 1000);
    // }
    public void payBill(long amount){
        balance -= amount;
        addPoint (amount / 1000);
    }

    // private void 포인트지급(long 포인트금액){
    //     누적포인트 += 포인트금액;
    // }
    private void addPoint(long point){
        this.point += point;
    }

    //setter
    public void setCardNumber(long cardNumber){
        if(cardNumber < 1000_0000_0000_0000L){
            System.err.println("카드번호가 잘못되었습니다.");
        }else {
            this.cardNumber = cardNumber;
        }
    }

    //getter
    public long getCardNumber(){
        return cardNumber;
    }

}

