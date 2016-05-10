package com.mxnavi.yongcheyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxnavi.yongcheyi.dao.ArticleMapper;
import com.mxnavi.yongcheyi.model.resp.Article;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;

	public ArticleMapper getArticleMapper() {
		return articleMapper;
	}

	public void setArticleMapper(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	@Override
	public void addArticle(Article article) {
		articleMapper.insert(article);
	}

	@Override
	public void getArticle(int id) {
		articleMapper.selectByPrimaryKey(id);
	}

}
