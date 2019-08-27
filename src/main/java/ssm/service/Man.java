package ssm.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author zzzz
 * @create 2019-08-27 下午10:51
 */
@Service
public class Man implements Person {
    @Override
    public void run() {
        System.out.println("man 跑步");
    }

    @Override
    public void sleep() {
        System.out.println("man 睡觉");
    }
    @Test
    public void test(){
        ApplicationContext atx=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Man man=(Man) atx.getBean("man");
        man.run();
    }
}