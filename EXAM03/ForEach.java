public class ForEach {
    public static void main(String[] args) {
        String[] str = {"홍길동","이순신","세종대왕"};

        // 보통의 for문
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }

        // foreach 문 (안에 있는 값을 하나씩 뽑아와서 쓰겠다.)
        for(String s : str){
            System.out.println(s);
        }
    }
}
