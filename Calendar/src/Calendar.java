public class Calendar {
    public final int LAST_MONTH = 12;
    /* ๐ซ ์์ฑ์๋ฅผ public์ผ๋ก ์ธ ๊ฒฝ์ฐ, 
        calendar.lastMonth = 13; ๋ก ํ์๋ ๊ฐ์ด ๋ฐ๋๊ธฐ ๋๋ฌธ์ final์ ์ฌ์ฉํด์ ๊ฐ์ด ๋ฐ๋์ง ์๊ฒ ์ ์ฉ ํ๋ค. ๐ซ */

    public static final int MONTH = 12;
     /* ๐ก ์์ฑ์์ static์ด ํฌํจ ๋์ด ์์ ๊ฒฝ์ฐ, 
            ๊ฐ์ฒด(Calendar calendar = new Calendar();)๋ฅผ ๋ฐ๋ก ๋ง๋ค์ง ์๊ณ  ๋ฐ๋ก ์ฌ์ฉ ํ๋ค. */

    /* final์ ๋ค๋ฅธ ๋ฐฉ๋ฒ */
    public final int FIRST_MONTH;
    public Calendar(int month){
        FIRST_MONTH = month;
    }
    /* final์ 1ํ ์ด๊ธฐํ๋ ๊ฐ๋ฅ ํ๋ค. ์ดํ์ ๋ค์ ๊ฐ์ ํ ๋น ํ๋๊ฑด ๋ถ๊ฐ๋ฅ ํ๋ค.*/

}
