package com.order.viewer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.order.dao.DishManageDao;
import com.order.pojo.ConsuInfo;
import com.order.pojo.Dish;


public class DishManageViewer {
	private static Logger logger = LoggerFactory.getLogger(Dish.class);
	
	private DishManageDao dishManageDao;

	public void setDishManageDao(DishManageDao dishManageDao) {
		this.dishManageDao = dishManageDao;
	}
	
	public Dish getDishByName(String name) {
		return dishManageDao.getDishByName(name);
	}
	
	public List<Dish> getDishList() {
		return dishManageDao.getDishList();
	}
	
	public int addUserConsuInfo(ConsuInfo conInfo) {
		return dishManageDao.addUserConsuInfo(conInfo);
	}
}
