package com.demo.dp.interfacedemo;

import java.util.List;

import com.aerospike.mapper.annotations.AerospikeEmbed;
import com.aerospike.mapper.annotations.AerospikeEmbed.EmbedType;
import com.aerospike.mapper.annotations.AerospikeKey;
import com.aerospike.mapper.annotations.AerospikeRecord;

@AerospikeRecord(namespace = "cla_ns", set = "zoo")
public class Zoo {


	@AerospikeKey
	private String zooId;

	@AerospikeEmbed(type = EmbedType.LIST, elementType = EmbedType.MAP)
	private List<Animal> animalsList;

	public Zoo(String zooId, List<Animal> animalsList) {
		this.zooId = zooId;
		this.animalsList = animalsList;
	}

	public Zoo() {

	}

	public List<Animal> getAnimalsList() {
		return animalsList;
	}

	public void setAnimalsList(List<Animal> animalsList) {
		this.animalsList = animalsList;
	}

	public void setZooId(String zooId) {
		this.zooId = zooId;
	}
	
	@Override
	public String toString() {
		return "Zoo Id: " + zooId + "\n" + "Animals: " + animalsList;

	}
}
