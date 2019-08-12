package dev.sumana.cmappings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.ZoneId;
import java.util.TimeZone;

@EnableJpaAuditing
@EnableJpaRepositories
@SpringBootApplication
public class ComplexMappingsPocApplication {

    {
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("America/Bogota")));
    }

    public static void main(String[] args) {
        SpringApplication.run(ComplexMappingsPocApplication.class, args);
    }

}
