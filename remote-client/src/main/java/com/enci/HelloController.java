package com.enci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

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
@Controller
public class HelloController {




    @RequestMapping(value = "/hello")
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        IHelloService helloService = applicationContext.getBean("remoteService",
                IHelloService.class);
        System.out.println(helloService.sayHello());
    }
}
