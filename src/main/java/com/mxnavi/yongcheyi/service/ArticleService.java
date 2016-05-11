package com.mxnavi.yongcheyi.service;

import java.util.List;

import com.mxnavi.yongcheyi.dto.ArticleDto;
import com.mxnavi.yongcheyi.model.SearchModel;
import com.mxnavi.yongcheyi.model.resp.Article;

public interface ArticleService {
	public void addArticle(Article article);
	public List<ArticleDto> getArticle(SearchModel searchModel);
}
