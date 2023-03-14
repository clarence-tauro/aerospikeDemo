package com.demo.dp.interfacedemo;

import com.aerospike.mapper.annotations.AerospikeRecord;

@AerospikeRecord(namespace = "cla_ns", set = "zoo")
public class Cat extends Animal {

	private String breed;
	private String lifeSpan;
	
	public Cat(String animalId, String breed, String lifeSpan) {
		super(animalId);
		this.breed = breed;
		this.lifeSpan = lifeSpan;
	}

	public String getBreed() {
		return breed;
	}

	public String getLifeSpan() {
		return lifeSpan;
	}
	
	@Override
	public String toString() {
		return "[Cat: " + getAnimalId() + " - " + breed + " - " + lifeSpan +" ]";
	}
}
