import model.Shape;
import model.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springTest.xml");
		Shape shape = (Triangle) context.getBean("triangle");
		shape.draw();
	}
}
