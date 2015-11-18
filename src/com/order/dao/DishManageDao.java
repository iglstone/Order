package com.order.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.order.pojo.ConsuInfo;
import com.order.pojo.Dish;

public class DishManageDao extends HibernateDaoSupport {
	public Dish getDishByName(String name) {
		String hql = "from Dish d where d.name='" + name + "'";
		Session session = this.getSession(true);
		Dish dish = null;
		try {
			Query query = session.createQuery(hql);
			List<Dish> list = query.list();
			Iterator<Dish> iter=list.iterator();
			
			if (iter.hasNext()) {
				dish = iter.next();
			}
		} finally {
			session.close();
		}
		
		return dish;
	}
	
	public List<Dish> getDishList() {
		String hql = "from Dish d where (d.mapURL != null and d.name != null)";
		Session session = this.getSession(true);
		List<Dish> list = null;
		Query query = session.createQuery(hql);
		list = query.list();
		
		session.close();
		
		return list;
	}
	
	public int addUserConsuInfo(ConsuInfo conInfo) {
		
		
		
		if (conInfo.getUserMenu() == null || conInfo.getTotalPrice() == 0.00F) {
			return 0;
		}
		
		HibernateTemplate template = this.getHibernateTemplate();

		template.save(conInfo);
		conInfo = (ConsuInfo) template.findByExample(conInfo).get(0);  //获取新增记录便于返回userID
		return conInfo.getUserID();
	}
}
