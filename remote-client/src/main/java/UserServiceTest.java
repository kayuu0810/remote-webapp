import com.enci.IHelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class UserServiceTest {  
  
    public static void main(String[] args) {  
        @SuppressWarnings("resource")  
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        IHelloService userService = (IHelloService)context.getBean("userService");
        System.out.println(userService.sayHello());;
    }  
}  