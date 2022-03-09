public class DeepCopy {
    public static void main(String[] args) {
        // 깊은 복사

        /*  int[] arr3 = {1,2,3,4};
            int[] arr4 = new int[arr3.length];
            
            for(int i = 0; i < arr3.length; i++){
                arr4[i] = arr3[i];
            } */

        int[] arr3 = new int[5];
        // 공간이 5개 있는 배열이 생성 됨.
        
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 25;
        arr3[3] = 30;
        arr3[4] = 45;

        int[] arr4 = new int[5]; // 칸이 5개인 배열을 만듦.

        for(int i = 0; i < arr3.length; i++){
            arr4[i] = arr3[i];
        } 
        // arr4에 arr3의 값을 하나하나 복사해서 넣음

        arr3[0] = -100;

        for(int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
        /* -100
            20  
            25
            30
            45 */

        System.out.println("------------------");

        for (int j = 0; j < arr4.length; j++){
            System.out.println(arr4[j]);
        } // 값을 직접 하나하나 복사 했기 때문에 바뀐 값은 반영 되지 않음
        /* 10
            20
            25
            30
            45 */
    }
}