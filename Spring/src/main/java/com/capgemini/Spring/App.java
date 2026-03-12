package com.capgemini.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean-config.xml");
        Student bean1 = (Student) context.getBean("student");
        
        System.out.println(bean1);
        
        Employee bean2 = (Employee) context.getBean("employee");
        
        System.out.println(bean2);
    }
}
