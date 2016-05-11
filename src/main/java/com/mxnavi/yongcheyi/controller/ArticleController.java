package com.mxnavi.yongcheyi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mxnavi.yongcheyi.model.SearchModel;
import com.mxnavi.yongcheyi.model.resp.Article;
import com.mxnavi.yongcheyi.dto.ArticleDto;
import com.mxnavi.yongcheyi.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@ResponseBody
	@RequestMapping(value = "/addArticle", method = RequestMethod.GET)
	public void add(Article article) {

		articleService.addArticle(article);

	}

	@ResponseBody
	@RequestMapping(value = "/searchArticle", method = RequestMethod.GET)
	public Map<String, Object> list(SearchModel searchModel) {

		List<ArticleDto> articleDtoList = articleService.getArticle(searchModel);
		Stream<ArticleDto> articleDtoStream = articleDtoList.stream();
		List<Article> articleList = articleDtoStream.map(this::articleDtoToModel).collect(Collectors.toList());

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("articleList", articleList);

		return buildReturnMap(resultMap);
	}

	public Map<String, Object> buildReturnMap(Object result) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("result", result);
		return returnMap;
	}

	public Article articleDtoToModel(ArticleDto articleDto) {

		Article articleModel = new Article();
		articleModel.setId(articleDto.getId());
		articleModel.setAuthor(articleDto.getAuthor());
		articleModel.setContent(articleDto.getContent());
		articleModel.setContentSourceUrl(articleDto.getContentSourceUrl());
		articleModel.setDigest(articleDto.getDigest());
		articleModel.setShowCoverPic(articleDto.getShowCoverPic());
		articleModel.setSoftDeleteFlag(articleDto.getSoftDeleteFlag());
		articleModel.setThumbMediaId(articleDto.getThumbMediaId());
		articleModel.setTitle(articleDto.getTitle());
		articleModel.setCreateTime(articleDto.getCreateTime());
		articleModel.setUpdateTime(articleDto.getUpdateTime());

		return articleModel;
	}
}
