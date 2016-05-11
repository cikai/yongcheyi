package com.mxnavi.yongcheyi.dao;

import java.util.List;

import com.mxnavi.yongcheyi.dto.ArticleDto;
import com.mxnavi.yongcheyi.model.SearchModel;
import com.mxnavi.yongcheyi.model.resp.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    public List<ArticleDto> selectByCondition(SearchModel searchModel);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}