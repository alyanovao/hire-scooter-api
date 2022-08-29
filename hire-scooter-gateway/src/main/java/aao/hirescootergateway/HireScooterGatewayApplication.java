package aao.hirescootergateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HireScooterGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HireScooterGatewayApplication.class, args);
    }

}
