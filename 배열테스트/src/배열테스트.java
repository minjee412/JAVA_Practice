public class 배열테스트 {
    public static void main(String[] args) {
        // --------- 선언만 한것 --------- //
        // int[] arr1;
        // int arr2[];
        // 둘다 동일하다.
        // ------------------------//

        // String[] str1;
        // String str2[];
        // 둘다 동일하다.

        int[] arr1 = new int[10]; // 10개 짜리 배열을 만듦.
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 25;
        arr1[3] = 30;
        arr1[4] = 45;


        int[] arr2 = {10, 20, 25, 30, 45};

        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);
        // System.out.println(arr1[2]);
        // System.out.println(arr1[3]);
        // System.out.println(arr1[4]);

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("=======================");

        for (int j = 0; j < arr2.length; j++){
            System.out.println(arr2[j]);
        }


    }
}
