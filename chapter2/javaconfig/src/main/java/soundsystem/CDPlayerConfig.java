package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @configration 声明这事一个配置类 描述了spring上下文如何创建bean的细节
 */
@Configuration
public class CDPlayerConfig {

  /**
   * 注解@bean，告诉spring，产生一个类型为CD，ID为compactDisc的bean 无论过程怎么样，只要该方法最终返回正确类型的对象即可
   */
  @Bean
  public CompactDisc compactDisc() {
    int choice = (int) (Math.random()*10);
    System.out.println("choice===="+choice);
    if (choice < 5) {
      return new SgtPeppers();
    } else {
      return new CDImpl();
    }
  }

  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);

  }

}
