public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);

        System.out.println("원의 넒이 : " + c1.getArea());
        System.out.println("원의 둘레 : " + c1.getPerimeter());
        
        
        Circle c2 = new Circle(100);

        System.out.println("원의 넒이 : " + c2.getArea());
        System.out.println("원의 둘레 : " + c2.getPerimeter());


    }
}
