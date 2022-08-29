package aao.hirescooterdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     
public class HireScooterDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HireScooterDiscoveryServerApplication.class, args);
    }

}
