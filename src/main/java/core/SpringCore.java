package core;

import base.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring core 学习
 *
 * @author chensg
 */
public class SpringCore {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.send();
        System.out.println(bean.getStudent());
        context.close();
    }

}
