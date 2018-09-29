package ocm.yjg.springboot.config;

import ocm.yjg.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hzr
 * @create 2018-09-29 11:33
 *
 * @Configuration：指明当前类是一个配置类，就是来代替之前的 Spring 配置文件
 *
 */

@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的方法的 id 就是方法名

    @Bean
    public HelloService helloService(){
        System.out.println("配置类 @Bean 给容器添加组件了");
        return new HelloService();
    }
}
