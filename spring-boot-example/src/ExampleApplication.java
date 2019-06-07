import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import javax.servlet.ServletContext;

/**
 * Created by matthewtruebe on 5/28/19.
 *
*/

@SpringBootApplication
@PropertySource(value = {"classpath:application.properties"}, ignoreResourceNotFound = true)
@ComponentScan(basePackages = {
        "service.v1.controller",
        "service.v1.webservice"})
public class ExampleApplication extends SpringBootServletInitializer {

    @Autowired
    private ServletContext context;

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(
            final SpringApplicationBuilder application) {
        return application.sources(ExampleApplication.class);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }


}
