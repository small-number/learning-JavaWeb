package cn.itcast.instance;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

    //使用SpringIOC模拟一个简单的数据库保存
    private ApplicationContext ac=new ClassPathXmlApplicationContext("cn/itcast/instance/bean.xml");
    
    @Test
    public void test()
    {
        UserAction userAction=(UserAction) ac.getBean("userAction");
        userAction.execute();
    }
}
