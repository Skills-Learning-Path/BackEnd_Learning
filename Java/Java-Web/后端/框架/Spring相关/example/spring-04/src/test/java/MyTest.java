import com.pojo.Student;
import com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user.toString());
    }
}
