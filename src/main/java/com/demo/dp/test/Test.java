package com.demo.dp.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import com.demo.dp.interfacedemo.Animal;
import com.demo.dp.interfacedemo.Cat;
import com.demo.dp.interfacedemo.Dog;
import com.demo.dp.interfacedemo.Zoo;
import com.demo.dp.interfacedemo.ZooService;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Test {

	public static void main(String[] args) {
		
		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(new Cat("C4101", "Persian", "30"));
		listOfAnimals.add(new Cat("C4102", "Indian", "21"));
		listOfAnimals.add(new Dog("D4101", "Lab"));
		listOfAnimals.add(new Cat("C4103", "Korean", "15"));
		listOfAnimals.add(new Dog("D4102", "Desi"));
		
		Zoo zoo = new Zoo("Z105", listOfAnimals);
		ZooService.addAnimalsToZoo(zoo);

		System.out.println("... Animals added to the Zoo, please check database");

		System.out.println(ZooService.getAnimalFromZoo("Z105"));
	
	}

}
