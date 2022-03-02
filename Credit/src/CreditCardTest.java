public class CreditCardTest {
    public static void main(String[] args) {

        CreditCard myCard = new CreditCard();
        // myCard.cardNumber = 1234_5678_1234_1234L;
        myCard.setCardNumber(234_5678_1234_1234L); // (setter)값 설정

        myCard.cardOwner = "홍길동";

        System.out.println("==========================");
        // System.out.println(myCard.cardNumber);
        System.out.println(myCard.getCardNumber()); // (getter)값 가져오기
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.balance);
        System.out.println(myCard.point);

        myCard.use(8000);
        myCard.use(12000);
        myCard.use(21000);
        myCard.payBill(30000);

        System.out.println("==========================");
        // System.out.println(myCard.cardNumber); 
        System.out.println(myCard.getCardNumber()); // (getter)값 가져오기
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.balance);
        System.out.println(myCard.point);
    }
}
