package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("title", "welcome to Home Page");
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value ="/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value ="/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/* 
	 * Method to load all the products and based on category
	 */
	@RequestMapping(value ="/show/all/products")
	public ModelAndView showAllproducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		//passing list of category
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value ="/show/category/{id}/products")
	public ModelAndView showCategoryproducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		//categoryDAO to fetch single category
		Category category=categoryDAO.get(id);
		mv.addObject("title", category.getName());
		
		//passing list of categories
		mv.addObject("categories",categoryDAO.list());
		
		//passing the single category
		mv.addObject("category",category);
		
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
	

}
