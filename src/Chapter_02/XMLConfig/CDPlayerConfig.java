package Chapter_02.XMLConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration()
//@Import({CDPlayerConfig.class,SgtPeppers.class})
//@ImportResource("classpath:XML/PropertyValueTest-context.xml")
public class CDPlayerConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public CDPlayer cdPlayer() {
    return new CDPlayer(compactDisc());
  }

}
