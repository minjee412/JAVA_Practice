public class ShallowCopy {
    //얕은 복사 (원본에서 값을 바꾸면 복사본에서 값도 바뀐다.)
    public static void main(String[] args) {
        int[] arr1 = new int[5]; // 공간이 5개 있는 배열을 만듦
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        int[] arr2 = arr1;

        arr1[0] = -100;

        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr1[i]);
        }

        /* -100
            20
            30
            40
            50  */ 
        System.out.println("--------------------------");

        for(int j = 0; j < arr2.length; j++){
            System.out.println(arr2[j]);
        }
        /* -100
            20
            30
            40
            50 */
    }

}
