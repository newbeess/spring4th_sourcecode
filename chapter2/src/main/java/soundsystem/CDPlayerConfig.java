package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 使用 @Configuration 启用组件扫描
 *
 * spring会扫描该包，以及子包查找bean
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
