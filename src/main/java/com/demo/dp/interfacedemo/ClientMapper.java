package com.demo.dp.interfacedemo;

import com.aerospike.client.AerospikeClient;
import com.aerospike.mapper.tools.AeroMapper;

public class ClientMapper {
	private static String host;
	private static int port;
	private static AerospikeClient aerospikeClient;
	private static AeroMapper aeroMapper;

	static {
		host = "13.251.26.223";
		port = 3000;

		aerospikeClient = new AerospikeClient(host, port);
		aeroMapper = new AeroMapper.Builder(aerospikeClient)
				.preLoadClass(Cat.class)
				.preLoadClass(Dog.class)
				.build();
	}

	public static AerospikeClient getAerospikeClient() {
		return aerospikeClient;
	}

	public static AeroMapper getAeroMapper() {
		return aeroMapper;
	}
}
