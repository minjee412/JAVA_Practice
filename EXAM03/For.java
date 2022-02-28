public class For {
    
    public static void main(String[] args){

        for (int i = 1; i <=9; i++ ){

            // ❗️ break , continue
            if(i == 4){
                // break;  // 4 밑으로는 출력 되지 않음
                continue; // 4만 건너 뜀
            }
            System.out.println("2 * " + i +" = " + (2*i));
        }
    }
}
