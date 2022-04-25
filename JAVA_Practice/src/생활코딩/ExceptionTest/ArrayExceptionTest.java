package 생활코딩.ExceptionTest;

class ArrayTest{
	private int[] arr = new int[3];
	
	ArrayTest() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	public void compute(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
//        	Exception이 다른 예외(ArrayIndexOutOfBoundsException, ArithmeticException)보다 위에 올라가면 에러 발생
//        	이유? Exception이 다른 예외들을 모두 포함한 포괄적인 예외이기 때문에.
            System.out.println("Exception");
        } finally {
//        	예외여부와 관계없이 실행되는 로직
//        	👩‍💻사용 예) 처리 속도를 위해 애플리케이션 과 DB의 연결을 끊는 로직을 많이 사용 한다. (정상 / 예외 접근 상관 없음)
            System.out.println("finally");
        }
	}

}


public class ArrayExceptionTest {

	public static void main(String[] args) {
		ArrayTest a = new ArrayTest();
		a.compute(10,0); // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
		a.compute(1, 0); // java.lang.ArithmeticException: / by zero
        a.compute(2, 1);
	}

}
