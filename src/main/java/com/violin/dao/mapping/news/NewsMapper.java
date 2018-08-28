package com.violin.dao.mapping.news;

import com.violin.model.news.News;

import java.util.List;
import java.util.Map;

public interface NewsMapper {

	void insertNews(News news);

	void deleteNewsById(String newsId);

	int deleteNewsAll();

	void updateNews(News news);

	News findNewsById(String newsId);

	List<News> findNewsList();

	int deleteNewsList(List<News> newss);

	int deleteNewsListByIds(String[] Ids);

	int insertNewsList(List<News> newss);

	void updateNewsList(List<News> newss);

	List<News> findNewsQuery(Map map);

	List<News> findNewsQueryPage(Map map);

	int findCountNewsQuery(Map map);

}
