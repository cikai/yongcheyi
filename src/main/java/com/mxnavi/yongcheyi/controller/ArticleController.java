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
}
