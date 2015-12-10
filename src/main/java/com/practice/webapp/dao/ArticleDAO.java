package com.practice.webapp.dao;

import java.util.List;

import com.practice.webapp.entity.Article;


public interface ArticleDAO {	
	
	public void insert(Article article);
	public void delete(Article article);
	public void update(Article article);
	public List<Article> getList();
	public Article get(Article article);
	
//在此介面中聲明方法 但不去實作
//等到實作時在實現方法
}
