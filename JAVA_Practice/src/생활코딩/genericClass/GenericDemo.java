package 생활코딩.genericClass;

// 제네릭 클래스 : class 안에서 바로 타입 지정 하지 않고, 해당 클래스가 사용될 때 지정 하겠다.
class Person<T>{
    public T info;
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>(); // <String>이 <T>에 들어 감
        Person<StringBuilder> p2 = new Person<StringBuilder>(); // <stringBuilder>가 <T>에 들어감
    }
 
}