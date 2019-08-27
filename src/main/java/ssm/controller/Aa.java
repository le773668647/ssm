package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.service.Man;

/**
 * @author zzzz
 * @create 2019-08-27 下午11:53
 */
@Controller
@RequestMapping("/ssm")
public class Aa {
    @Autowired
    private Man man;
    @RequestMapping("/test")
    public String aa(){
        System.out.println("mvc 测试成功");
//        ApplicationContext atx=new ClassPathXmlApplicationContext("applicationcontext.xml");
//        Man man=(Man) atx.getBean("man");
        man.run();

        return "success";
    }
}
