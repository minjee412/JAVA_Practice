public class Operater {
    
    public static void main(String[] args) {
        
        //  🟡삼항연산자
        int result = (3 > 4) ? 10 : 20;

        System.out.println(result);     // 20

        //  🟡boolean연산자
        int i1 = 20;
        int i2 = 10;

        int j1 = 20;
        int j2 = 30;

        boolean result2 = i1 > i2;

        System.out.println(result2);    // true

        System.out.println("-----------------------");
        //  🟡비교연산자
        System.out.println((i1 < i2) ^ (j1 < j2));      // true
            // (^ => 조건이 서로 결과가 다르지 않니 ?) 조건이 서로 같으면 false, 다르면 true.


    }
}
