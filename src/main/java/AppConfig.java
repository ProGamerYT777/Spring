import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Car getCarBean() {
        return new Car("Nissan");
    }

    @Bean
    public Bus getBusBean() {
        return new Bus("PAZ");
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup("RAM");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Ivan");
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Anton");
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Andrey");
    }
}
