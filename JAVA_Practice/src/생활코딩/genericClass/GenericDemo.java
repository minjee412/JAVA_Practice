package ��Ȱ�ڵ�.genericClass;

// ���׸� Ŭ���� : class �ȿ��� �ٷ� Ÿ�� ���� ���� �ʰ�, �ش� Ŭ������ ���� �� ���� �ϰڴ�.
class Person<T>{
    public T info;
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>(); // <String>�� <T>�� ��� ��
        Person<StringBuilder> p2 = new Person<StringBuilder>(); // <stringBuilder>�� <T>�� ��
    }
 
}