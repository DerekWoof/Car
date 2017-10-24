package Cars;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "Cars")
@PropertySource(value = "classpath:app.properties")
public class AppConfid {
}
