public class Calendar {
    public final int LAST_MONTH = 12;
    /* 😫 생성자를 public으로 쓸 경우, 
        calendar.lastMonth = 13; 로 했을때 값이 바뀌기 때문에 final을 사용해서 값이 바뀌지 않게 적용 한다. 😫 */

    public static final int MONTH = 12;
     /* 🟡 생성자에 static이 포함 되어 있을 경우, 
            객체(Calendar calendar = new Calendar();)를 따로 만들지 않고 바로 사용 한다. */

    /* final의 다른 방법 */
    public final int FIRST_MONTH;
    public Calendar(int month){
        FIRST_MONTH = month;
    }
    /* final은 1회 초기화는 가능 하다. 이후에 다시 값을 할당 하는건 불가능 하다.*/

}
