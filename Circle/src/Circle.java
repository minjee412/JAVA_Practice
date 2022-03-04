public class Circle {

    double radius; // 반지름
    static double pi = 3.14; // 파이
    // 📕 static을 붙여 주면 해당 class 안에서만 유효한 값이 된다.
    // 다른 페이지에서 해당 값을 불러올때는 '공유' 개념으로 사용 되기 때문에
    // 용량이 소비 되지 않는다. 📕

    public Circle (double radius){
        this.radius = radius;
    }

    // 원 넓이: 파이r제곱, 둘레: 2파이r
    // 원의 넓이 구하는 식
    public double getArea(){
        return pi * radius * radius;
    }

    // 원의 둘레 구하는 식
    public double getPerimeter(){
        return 2 * pi * radius;
    }

}
