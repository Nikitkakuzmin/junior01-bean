package kz.nikitka.course.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testspring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

        testbean testBean = context.getBean("testbean", testbean.class);

        testBean = new testbean("aaa");

        System.out.println(testBean.getName());

        context.close();
    }
}
