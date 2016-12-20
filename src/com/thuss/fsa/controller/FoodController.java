package com.thuss.fsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thuss.fsa.item.SaleItem;
import com.thuss.fsa.item.SimiliarSaleList;
import com.thuss.fsa.model.Food;
import com.thuss.fsa.model.Hotel;
import com.thuss.fsa.service.FoodService;
import com.thuss.fsa.service.HotelService;

@Controller
public class FoodController {

	@Autowired
	private FoodService foodService;
	@Autowired
	private HotelService hotelService;
	
    @RequestMapping(value = "/foodInfo", method = RequestMethod.GET)
    public String foodInfo(ModelMap model,@RequestParam long foodId) {
    	//餐厅信息
    	Food food = foodService.getById(foodId);
    	model.addAttribute("food",food);
    	Hotel hotel = hotelService.getById(food.getHotelId());
    	model.addAttribute("hotel",hotel);
    	//历史销量和预测销量
    	List<SaleItem> salesList = foodService.getSalesList(foodId);
    	StringBuffer foodName = new StringBuffer();
    	StringBuffer dateList = new StringBuffer();
    	StringBuffer salesNum = new StringBuffer();
    	foodName.append("'").append(food.getFoodName()).append("'");
    	dateList.append("[");
    	salesNum.append("[");
    	for(int i = 0; i < 14; i++){
    		dateList.append("'").append(salesList.get(i).getDate()).append("'");
    		salesNum.append(salesList.get(i).getSoldNum());
    		
    		if(i < 13){
    			dateList.append(",");
    			salesNum.append(",");
            }
    	}
    	dateList.append("]");
    	salesNum.append("]");
    	model.addAttribute("salesList",salesList);
    	model.addAttribute("foodName",foodName);
    	model.addAttribute("dateList",dateList);
    	model.addAttribute("salesNum",salesNum);
    	
    	//热销同类菜品
    	List<Food> similiarFoods = foodService.getSimiliarFoods(food);
    	model.addAttribute("similiarFoods",similiarFoods);
    	//热销同类菜品销量对比
    	List<SimiliarSaleList> similiarSales = foodService.getSimiliarSales(food,similiarFoods);
    	StringBuffer hotelName = new StringBuffer();
    	StringBuffer hotelName1 = new StringBuffer();
    	StringBuffer hotelName2 = new StringBuffer();
    	StringBuffer hotelName3 = new StringBuffer();
    	//StringBuffer dateListCmp = new StringBuffer();
    	//StringBuffer salesNumCmp = new StringBuffer();
    	StringBuffer salesNum1 = new StringBuffer();
    	StringBuffer salesNum2 = new StringBuffer();
    	StringBuffer salesNum3 = new StringBuffer();
    	hotelName.append("'").append(hotel.getHotelName()).append("'");
    	hotelName1.append("'").append(similiarSales.get(0).getHotelName()).append("'");
    	hotelName2.append("'").append(similiarSales.get(1).getHotelName()).append("'");
    	hotelName3.append("'").append(similiarSales.get(2).getHotelName()).append("'");
    	//dateListCmp.append("[");
    	salesNum1.append("[");
    	salesNum2.append("[");
    	salesNum3.append("[");
    	for(int i = 0; i < 14; i++){
    		//dateListCmp.append("'").append(similiarSales.get(0).getSales().get(i).getDate()).append("'");
    		salesNum1.append(similiarSales.get(0).getSales().get(i).getSoldNum());
    		salesNum2.append(similiarSales.get(1).getSales().get(i).getSoldNum());
    		salesNum3.append(similiarSales.get(2).getSales().get(i).getSoldNum());
    		
    		if(i < 13){
    			salesNum1.append(",");
    			salesNum2.append(",");
    			salesNum3.append(",");
            }
    	}
    	//dateListCmp.append("]");
    	//salesNumCmp.append("]");
    	salesNum1.append("]");
    	salesNum2.append("]");
    	salesNum3.append("]");
    	model.addAttribute("similiarSales", similiarSales);
    	model.addAttribute("hotelName",hotelName);
    	model.addAttribute("hotelName1",hotelName1);
    	model.addAttribute("hotelName2",hotelName2);
    	model.addAttribute("hotelName3",hotelName3);
    	//model.addAttribute("dateListCmp",dateListCmp);
    	//model.addAttribute("salesNumCmp",salesNumCmp);
    	model.addAttribute("salesNum1",salesNum1);
    	model.addAttribute("salesNum2",salesNum2);
    	model.addAttribute("salesNum3",salesNum3);
    	
    	//推荐定价
    	int recommendPrice = foodService.getRecommendPrice(food);
    	model.addAttribute("recommendPrice", recommendPrice);
    	//搭配菜品推荐
    	List<Food> groupFoods = foodService.getGroupFoods(food);
    	model.addAttribute("groupFoods", groupFoods);
        return "foodInfo";
    }	
}
