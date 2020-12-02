import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userservice = context.getBean("userservice", UserService.class);
        userservice.add();
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("method2.xml");
        UserService userservice = context.getBean("userservice", UserService.class);
        userservice.add();
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("method3.xml");
        UserService userservice = context.getBean("userservice", UserService.class);
        userservice.add();
    }
}
