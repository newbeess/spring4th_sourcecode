package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 首先：
 * 使用 @Configuration 启用组件扫描
 *
 * spring会扫描该包，以及子包查找bean
 *
 * 其次：@Configration 声明这事一个配置类
 * 描述了spring上下文如何创建bean的细节
 *
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {

}
