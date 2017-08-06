package org.tracking.money.dao.impl.mock;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import org.tracking.money.dao.StockDao;
import org.tracking.money.mockdb.Database;
import org.tracking.money.mockdb.InMemoryDatabase;
import org.tracking.money.model.Stock;
import org.tracking.money.util.KeyPair;

public class StockDaoImpl implements StockDao {

	InMemoryDatabase db = InMemoryDatabase.getInstance();
	
	@Override
	public Collection<Stock> listOfStock() {
		List<Stock> resultList = new LinkedList<>();
		db.stockDB.forEach((k,v) -> resultList.add(v));
		
		return resultList;
	}

	@Override
	public Stock getStock(String tickerName, String exchange) {
		Stock stock = db.stockDB.get(new KeyPair(tickerName, exchange));
		
		if (stock == null) throw new NotFoundException();
		
		return stock;
	}

	@Override
	public Stock addStock(Stock stock) {
		db.stockDB.put(new KeyPair(stock.getName(), stock.getExchange()), stock);
		
		return stock;
	}

	@Override
	public Stock updateStock(Stock stock) {
		db.stockDB.put(new KeyPair(stock.getName(), stock.getExchange()), stock);
		
		return stock;
	}

	@Override
	public boolean deleteStock(String tickerName) {
		if (db.stockDB.remove(tickerName) == null) {
			return false;
		}
		
		return true;
	}

	
}
