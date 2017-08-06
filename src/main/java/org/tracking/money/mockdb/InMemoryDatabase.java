package org.tracking.money.mockdb;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.tracking.money.model.Stock;
import org.tracking.money.util.KeyPair;

public class InMemoryDatabase implements Database {

	private static InMemoryDatabase instance = new InMemoryDatabase();
	
	public static final Map<KeyPair, Stock> stockDB = new HashMap<>();
	public static final Map<String, Stock> messageDB = new HashMap<>();
	
	
	
	private InMemoryDatabase() {
		;
	}
	
	public static InMemoryDatabase getInstance() {
		return instance;
	}
	
	
	// Database utilities
	
	public static <T> List<T> searchByField(List<T> list, Predicate<T> condition) {
		List<T> results = new LinkedList<>();
		
		for (T e : list) {
			results.add(e);
		}

		return results;
	}
}
