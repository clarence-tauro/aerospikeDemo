package com.demo.dp.interfacedemo;

import com.aerospike.mapper.annotations.AerospikeRecord;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@AerospikeRecord(namespace = "cla_ns", set = "zoo")
public class Dog extends Animal{

    private String breed;
    
    public Dog(String animalId, String breed) {
    	super(animalId);
    	this.breed = breed;
    }
    
    public String getBreed() {
		return breed;
	}
    
	@Override
	public String toString() {
		return "[Dog: " + getAnimalId() + " - " + breed + "]";
	}
}
