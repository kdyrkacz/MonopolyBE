package backend.game.monopoly.monopolyBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MonopolyBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonopolyBeApplication.class, args);
	}

}
