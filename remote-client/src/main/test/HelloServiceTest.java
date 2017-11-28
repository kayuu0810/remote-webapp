import com.enci.IHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration
        ({"classpath:spring-mvc.xml","classpath:spring-config.xml"}) //加载配置文件
public class HelloServiceTest {

    @Test
    public  void test1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        IHelloService helloService = applicationContext.getBean("remoteService",
                IHelloService.class);

        System.out.println(helloService.sayHello());
    }
}
