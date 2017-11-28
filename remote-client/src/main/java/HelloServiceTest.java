import com.enci.IHelloService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p> Title: </p>
 * <p> Description: </p>
 *
 * @创建时间
 * @版本 1.00
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * ----------------------------------------
 * <p>
 * ----------------------------------------
 * </pre>
 */
public class HelloServiceTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-client-remote-service.xml");
        IHelloService helloService = applicationContext.getBean("userService",IHelloService.class);
        System.out.println(helloService.sayHello());
    }
}
