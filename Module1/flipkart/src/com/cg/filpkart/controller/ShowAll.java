package com.cg.filpkart.controller;

import java.util.List;
import java.util.Scanner;

import com.cg.flipkart.bean.ProductBean;
import com.cg.flipkart.dao.ProductDAO;
import com.cg.flipkart.dao.*;
import com.cg.flipkart.factory.ProductFactory;
import com.cg.flipkart.service.*;

public class ShowAll {

	public static void main1() {
		ProductService services=ProductFactory.instanceOfProductServiceImpl();
		List<ProductBean> list=services.getAllProduct();
		if(list!=null) {
			for(ProductBean user:list) {
				System.out.println(user);
			
		}
		
	}

}
}
 