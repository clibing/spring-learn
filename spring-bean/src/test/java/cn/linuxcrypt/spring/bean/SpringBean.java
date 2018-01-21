package cn.linuxcrypt.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @function: this
 * @author: clibing
 * @date: 2018/1/20 20:29
 * @version: 1.0
 * @remark: none
 */
public class SpringBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService.login("admin", "123456"));
    }
}
