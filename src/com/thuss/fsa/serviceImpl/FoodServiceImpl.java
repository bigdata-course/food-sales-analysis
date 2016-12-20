package com.thuss.fsa.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thuss.fsa.dao.FoodDao;
import com.thuss.fsa.dao.HotelDao;
import com.thuss.fsa.item.FoodItem;
import com.thuss.fsa.item.HotFoodItem;
import com.thuss.fsa.item.SaleItem;
import com.thuss.fsa.item.SimiliarSaleList;
import com.thuss.fsa.model.Food;
import com.thuss.fsa.service.FoodService;
import com.thuss.fsa.util.Page;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private	FoodDao foodDao;
	@Autowired
	private	HotelDao hotelDao;

	@Override
	public void add(Food u) {
		foodDao.add(u);
	}
	@Override
	public void update(Food u) {
		foodDao.update(u);
	}

	@Override
	public void delete(Food u) {
		foodDao.delete(u);
	}
	
	@Override
	public List<Food> getAll() {
		return foodDao.getAll();
	}
	@Override
	public Food getById(long id) {
		return foodDao.getById(id);
	}
	
	
	@Override
	public Page searchForPage(String keyword, int currentPage, int pageSize) {
		
		Page page  = new Page();
		
		int allRow = foodDao.searchRowCount(keyword);
		
		int offset = page.countOffset(currentPage,pageSize);
		
		List<FoodItem> list = foodDao.searchForPage(keyword, offset, pageSize);
		  
		page.setPageNo(currentPage);
		page.setPageSize(pageSize);
		page.setTotalRecords(allRow);
		page.setList(list);
		page.setKeyword(keyword);
		
		return page;
	}
	
	
	public List<HotFoodItem> getHotFoods(){
		List<HotFoodItem> foodList = foodDao.getHotFoods();
		return foodList;
	}
	@Override
	public List<SaleItem> getSalesList(long foodId) {
		return foodDao.getSalesList(foodId);
	}
	@Override
	public List<SaleItem> getSSalesList(long foodId) {
		return foodDao.getSSalesList(foodId);
	}
	@Override
	public List<Food> getSimiliarFoods(Food f) {
		
		return foodDao.getSimiliarFoods(f);
	}
	@Override
	public List<SimiliarSaleList> getSimiliarSales(Food food,
			List<Food> similiarFoods) {
		List<SimiliarSaleList> sslists  = new ArrayList<SimiliarSaleList>();
		SimiliarSaleList sslist = new SimiliarSaleList();
		sslist.setFoodName(food.getFoodName());
		sslist.setHotelName(hotelDao.getById(food.getHotelId()).getHotelName());
		sslist.setSales(getSSalesList(food.getFoodId()));
		sslists.add(sslist);
		for(Food f:similiarFoods)
		{
			sslist = new SimiliarSaleList();
			sslist.setFoodName(f.getFoodName());
			sslist.setHotelName(hotelDao.getById(f.getHotelId()).getHotelName());
			sslist.setSales(getSSalesList(f.getFoodId()));
			sslists.add(sslist);
		}
		return sslists;
	}
	@Override
	public int getRecommendPrice(Food food) {
		
		List<Food> top10 = foodDao.getTop10(food);
		double total = 0;
		for(Food f:top10)
		{
			total+=f.getUnitMoney();
		}
		return (int)(total/top10.size());
	}
	@Override
	public List<Food> getGroupFoods(Food food) {
		
		return foodDao.getGroupFoods(food);
	}

}
