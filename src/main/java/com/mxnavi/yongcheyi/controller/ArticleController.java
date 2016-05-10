package com.mxnavi.yongcheyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mxnavi.yongcheyi.model.resp.Article;
import com.mxnavi.yongcheyi.service.ArticleService;

@Controller
@RequestMapping("/addArticle")
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public void add(Article article) {
		articleService.addArticle(article);
	}

	public void select() {
		Article article = new Article();
		articleService.getArticle(1);
		System.out.println(article.getTitle());
		System.out.println(article.getDescription());
		System.out.println(article.getPicUrl());
		System.out.println(article.getUrl());
	}
}
