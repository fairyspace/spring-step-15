import io.github.fairyspace.context.support.ClassPathXmlApplicationContext;
import io.github.fairyspace.test.bean.IUserService;
import org.junit.Test;

public class ApiTest {


    @Test
    public void testScanPackage() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}



