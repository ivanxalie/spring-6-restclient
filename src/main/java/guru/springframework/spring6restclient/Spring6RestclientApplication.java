package guru.springframework.spring6restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class Spring6RestclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring6RestclientApplication.class, args);
    }

}
