package com.thuss.fsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thuss.fsa.item.HotFoodItem;
import com.thuss.fsa.item.IncomeItem;
import com.thuss.fsa.item.SimiliarIncomeList;
import com.thuss.fsa.model.Hotel;
import com.thuss.fsa.service.FoodService;
import com.thuss.fsa.service.HotelService;

@Controller
public class HotelController {

	@Autowired
	private FoodService foodService;
	
	@Autowired
	private HotelService hotelService;
	
    @RequestMapping(value = "/hotelInfo", method = RequestMethod.GET)
    public String hotelInfo(ModelMap model,@RequestParam long hotelId) {
    	//餐厅信息
    	Hotel hotel = hotelService.getById(hotelId);
    	model.addAttribute("hotel",hotel);
    	//历史营业额和预测营业额
    	List<IncomeItem> incomeList = hotelService.getIncomeList(hotelId);	
    	StringBuffer hotelName = new StringBuffer();
    	StringBuffer dateList = new StringBuffer();
    	StringBuffer incomeNum = new StringBuffer();
    	hotelName.append("'").append(hotel.getHotelName()).append("'");
    	dateList.append("[");
    	incomeNum.append("[");
    	for(int i = 0; i < 14; i++){
    		dateList.append("'").append(incomeList.get(i).getDate()).append("'");
    		incomeNum.append(incomeList.get(i).getIncome());
    		
    		if(i < 13){
    			dateList.append(",");
    			incomeNum.append(",");
    		}
    	}
    	dateList.append("]");
    	incomeNum.append("]");
    	//model.addAttribute("incomeList",incomeList);
    	model.addAttribute("hotelName",hotelName);
    	model.addAttribute("dateList",dateList);
    	model.addAttribute("incomeNum",incomeNum);
    	
    	
    	//相似店铺
    	List<Hotel> similiarHotels = hotelService.getSimiliarHotels(hotelId);
    	model.addAttribute("similiarHotels",similiarHotels);
    	//相似店铺营业额对比
    	List<SimiliarIncomeList> similiarIncomes = hotelService.getSimiliarIncomes(hotel,similiarHotels);
    	StringBuffer hotelName1 = new StringBuffer();
    	StringBuffer hotelName2 = new StringBuffer();
    	StringBuffer hotelName3 = new StringBuffer();
    	StringBuffer incomeNum1 = new StringBuffer();
    	StringBuffer incomeNum2 = new StringBuffer();
    	StringBuffer incomeNum3 = new StringBuffer();
    	hotelName1.append("'").append(similiarIncomes.get(1).getHotelName()).append("'");
    	hotelName2.append("'").append(similiarIncomes.get(2).getHotelName()).append("'");
    	hotelName3.append("'").append(similiarIncomes.get(3).getHotelName()).append("'");
    	//dateListCmp.append("[");
    	incomeNum1.append("[");
    	incomeNum2.append("[");
    	incomeNum3.append("[");
    	for(int i = 0; i < 14; i++){
    		//dateListCmp.append("'").append(similiarSales.get(0).getSales().get(i).getDate()).append("'");
    		incomeNum1.append(similiarIncomes.get(1).getIncomes().get(i).getIncome());
    		incomeNum2.append(similiarIncomes.get(2).getIncomes().get(i).getIncome());
    		incomeNum3.append(similiarIncomes.get(3).getIncomes().get(i).getIncome());
    		
    		if(i < 13){
    			incomeNum1.append(",");
    			incomeNum2.append(",");
    			incomeNum3.append(",");
            }
    	}
    	//dateListCmp.append("]");
    	//salesNumCmp.append("]");
    	incomeNum1.append("]");
    	incomeNum2.append("]");
    	incomeNum3.append("]");
    	//model.addAttribute("similiarIncomes", similiarIncomes);
    	model.addAttribute("hotelName1",hotelName1);
    	model.addAttribute("hotelName2",hotelName2);
    	model.addAttribute("hotelName3",hotelName3);
    	model.addAttribute("incomeNum1",incomeNum1);
    	model.addAttribute("incomeNum2",incomeNum2);
    	model.addAttribute("incomeNum3",incomeNum3);
    	
    	//热销菜品
    	List<HotFoodItem> hotFoods = hotelService.getHotFoods(hotelId);
    	model.addAttribute("hotFoods", hotFoods);
    	//滞销菜品
    	List<HotFoodItem> poorFoods = hotelService.getPoorFoods(hotelId);
    	model.addAttribute("poorFoods", poorFoods);
        return "hotelInfo";
    }	
}
