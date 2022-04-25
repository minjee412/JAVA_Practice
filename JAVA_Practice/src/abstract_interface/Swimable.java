package abstract_interface;

// 수영을 할 수 있는 사람도 있고, 못하는 사람도 있기 때문에 interface로 구현하여 수영을 할 수 있는 클래서에 구현받아 만들어주면
// 가독성과 유지보수 측면에서 뛰어나다.
public interface Swimable {
	void swimDown(int yDistance);
}
