package com.practice.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.webapp.dao.ArticleCategoryDAO;
import com.practice.webapp.dao.ArticleDAO;
import com.practice.webapp.entity.Article;
import com.practice.webapp.entity.ArticleCategory;
//導入其他類別 及介面 實作

@Controller
public class ArticleController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
    //這定黨到context

	//value 指定請求的jsp  method請求的method類型
	@RequestMapping(value = "/insertArticle", method = RequestMethod.GET)      
	public ModelAndView insertArticlePage()   //ModelAndView當中包括了 view 以及 model 資料
	{
		ModelAndView model = new ModelAndView("insertArticle");
		ArticleCategoryDAO articleCategoryDAO = (ArticleCategoryDAO) context.getBean("articleCategoryDAO");
		List<ArticleCategory> articleCategoryList = new ArrayList<ArticleCategory>();
		articleCategoryList = articleCategoryDAO.getList();
		model.addObject("articleCategoryList", articleCategoryList);
		return model;

	}
    //如果希望在function中添加模型，可以在function的參數中加入@ModelAttribute，SpringMVC會將request的param對應到你指定的Object中
	@RequestMapping(value = "/insertArticle", method = RequestMethod.POST)
	public ModelAndView insertArticle(@ModelAttribute Article article) 
	{
		ModelAndView model = new ModelAndView("redirect:/article");
		ArticleDAO articleDAO = (ArticleDAO) context.getBean("articleDAO");
		articleDAO.insert(article);

		return model;
	}

	@RequestMapping(value = "/article", method = RequestMethod.GET)
	public ModelAndView getArticleList()
	{
		ModelAndView model = new ModelAndView("article");
		ArticleDAO articleDAO = (ArticleDAO) context.getBean("articleDAO");
		List<Article> articleList = new ArrayList<Article>();
		articleList = articleDAO.getList();
		model.addObject("articleList", articleList);
		return model;
	}

	@RequestMapping(value = "/updateArticle", method = RequestMethod.GET)
	public ModelAndView updateArticlePage(@ModelAttribute Article article)
	{
		ModelAndView model = new ModelAndView("updateArticle");
		ArticleCategoryDAO articleCategoryDAO = (ArticleCategoryDAO) context.getBean("articleCategoryDAO");
		ArticleDAO articleDAO = (ArticleDAO) context.getBean("articleDAO");
		List<ArticleCategory> articleCategoryList = new ArrayList<ArticleCategory>();
		articleCategoryList = articleCategoryDAO.getList();
		article = articleDAO.get(article);
		model.addObject("articleCategoryList", articleCategoryList);
		model.addObject("article", article);
		return model;
	}

	@RequestMapping(value = "/updateArticle", method = RequestMethod.POST)
	public ModelAndView updateArticle(@ModelAttribute Article article)
	{
		ModelAndView model = new ModelAndView("redirect:/article");
		ArticleDAO articleDAO = (ArticleDAO) context.getBean("articleDAO");
		articleDAO.update(article);
		return model;
	}

	@RequestMapping(value = "/deleteArticle", method = RequestMethod.POST)
	public ModelAndView deleteArticle(@ModelAttribute Article article)
	{
		ModelAndView model = new ModelAndView("redirect:/article");
		ArticleDAO articleDAO = (ArticleDAO) context.getBean("articleDAO");
		articleDAO.delete(article);
		return model;
	}
}
