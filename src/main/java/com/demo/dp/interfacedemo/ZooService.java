package com.demo.dp.interfacedemo;

import com.aerospike.mapper.tools.AeroMapper;

public class ZooService {

	private static AeroMapper aeroMapper;
	
	static {
		aeroMapper = ClientMapper.getAeroMapper();
	}

	public static void addAnimalsToZoo(Zoo zoo) {
		aeroMapper.save(zoo);
	}

	public static Zoo getAnimalFromZoo(String zooId) {

		return aeroMapper.read(Zoo.class, zooId);
	}

}
