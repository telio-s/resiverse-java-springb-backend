package senior.proj.resiverse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import senior.proj.resiverse.Repository.ResidenceRepository;
import senior.proj.resiverse.controller.ResidenceController;
import senior.proj.resiverse.model.Address;
import senior.proj.resiverse.model.Facility;
import senior.proj.resiverse.model.Residence;
import senior.proj.resiverse.model.ResidenceType;

import java.util.*;

@SpringBootApplication
public class ResiverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResiverseApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(ResidenceController controller){
//		return args -> {
//			Address address = new Address(
//					"TongTao",
//					"Ratburana",
//					"Ratburana",
//					"Bangkok",
//					"10140"
//			);
//			Facility facility = new Facility(
//					"Pet friendly",
//					"Lantao is Happy");
//
//			List<Facility> facilities = new ArrayList<>();
//			facilities.add(facility);
//
//			Residence residence = new Residence(
//					 "TongTan",
//					"0900000",
//					address,ResidenceType.APT,"1",facilities
//			);
//
//			controller.addResidence(residence);
//		};
//	}
}
