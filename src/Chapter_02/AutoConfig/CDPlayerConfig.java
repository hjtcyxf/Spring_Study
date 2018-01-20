package Chapter_02.AutoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"Chapter_02"})
//@ComponentScan(basePackageClasses = {SgtPeppers.class})
public class CDPlayerConfig { 
}
