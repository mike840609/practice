package com.practice.webapp.controller;

import java.util.ArrayList;
import java.util.List;


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.practice.webapp.dao.ArticleCategoryDAO;
//import com.practice.webapp.dao.ArticleDAO;
import com.practice.webapp.dao.ProductDAO;
//import com.practice.webapp.entity.Article;
//import com.practice.webapp.entity.ArticleCategory;
import com.practice.webapp.entity.Product;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProductController {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-module.xml");
	
	//private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView getProductList(){
	
		ModelAndView model = new ModelAndView("product");
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		List<Product> productList = new ArrayList<Product>();
		productList = productDAO.getList();
		model.addObject("productList", productList);
		
		return model;
	}
	
	@RequestMapping(value = "/insertProduct", method = RequestMethod.GET)
	public ModelAndView insertProductPage(){
		ModelAndView model = new ModelAndView("insertProduct");
		
		return model;
	}
	
	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
	public ModelAndView insertProduct(@ModelAttribute Product product){
		ModelAndView model = new ModelAndView("redirect:/product");
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		productDAO.insert(product);
		
		return model;
	}

	@RequestMapping(value = "/updateProduct", method = RequestMethod.GET)
	public ModelAndView updateProductPage(@ModelAttribute Product product){
		
		ModelAndView model = new ModelAndView("updateProduct");
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		product = productDAO.get(product);
		model.addObject("product", product);
		return model;
	}
	
	@RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
	public ModelAndView updateProduct(@ModelAttribute Product product){
		
		ModelAndView model = new ModelAndView("redirect:/product");
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		productDAO.update(product);	
		return model;
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
	public ModelAndView deleteProduct(@ModelAttribute Product product){
		
		ModelAndView model = new ModelAndView("redirect:/product");
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		productDAO.delete(product);
		return model;
	}

//	@RequestMapping(value = "/reorderProduct", method = RequestMethod.GET)
//	public ModelAndView listReorderProduct(){
//		
//		ModelAndView model = new ModelAndView("reorderProduct");
//		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
//		List<Product> productList = new ArrayList<Product>();
//		productList = productDAO.getReorderList();
//		model.addObject("productList", productList);
//		
//		return model;
//	}

//	@RequestMapping(value = "/reorderProduct", method = RequestMethod.POST)
//	public ModelAndView reorderProduct(@ModelAttribute Product product){
//		
//		ModelAndView model = new ModelAndView("redirect:/reorderProduct");
//		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
//		productDAO.delete(product);
//		return model;
//	}

	@RequestMapping(value = "/availableProduct", method = RequestMethod.GET)
	public ModelAndView listAvailableProduct(){
		
		ModelAndView model = new ModelAndView("availableProduct");
		ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		List<Product> productList = new ArrayList<Product>();
		productList = productDAO.getAvailableList();
		model.addObject("productList", productList);
		
		return model;
	}

}
