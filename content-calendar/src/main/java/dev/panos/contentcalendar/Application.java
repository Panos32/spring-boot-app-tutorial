package dev.panos.contentcalendar;


import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import dev.panos.contentcalendar.config.ContentCalendarProperties;
import dev.panos.contentcalendar.model.Content;
import dev.panos.contentcalendar.model.Status;
import dev.panos.contentcalendar.model.Type;
import dev.panos.contentcalendar.repository.ContentRepository;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
		Content content = new Content(
		null,
        "Hello Chat GPT",
        "All about Chat GPT",
        Status.IDEA,
        Type.VIDEO,
        LocalDateTime.now(),
        null,
        "");
		
		repository.save(content);
	};
	
	}

}

