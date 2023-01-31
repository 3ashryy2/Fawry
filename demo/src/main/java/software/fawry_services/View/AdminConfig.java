package software.fawry_services.View;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.fawry_services.AbstractUser.AbstractUser;
import software.fawry_services.Admin.Admin;
@Configuration
public class AdminConfig {

    @Bean
    public Admin config()
    {
        return new Admin("admin","admin","admin");
    }
}
