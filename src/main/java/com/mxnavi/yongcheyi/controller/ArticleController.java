package com.mxnavi.yongcheyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mxnavi.yongcheyi.model.resp.Article;
import com.mxnavi.yongcheyi.service.ArticleService;

@Controller
@RequestMapping("/articleAdd")
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping(method = RequestMethod.GET)
	public void add() {
		Article article = new Article();
		article.setId(0);
		article.setDescription("test");
		article.setPicUrl("www.google.com");
		article.setUrl("www.cikai.me");
		article.setTitle("title");
		articleService.addArticle(article);
	}
	
	@ResponseBody
	public void get() {
		articleService.getArticle(1);
	}
}
