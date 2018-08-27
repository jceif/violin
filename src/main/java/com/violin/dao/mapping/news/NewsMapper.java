package com.violin.dao.mapping.news;

import com.violin.model.news.News;

import java.util.List;
import java.util.Map;

public interface NewsMapper {

	public void insertNews(News news);

	public void deleteNewsById(String newsId);

	public int deleteNewsAll();

	public void updateNews(News news);

	public News findNewsById(String newsId);

	public List<News> findNewsList();

	public int deleteNewsList(List<News> newss);

	public int deleteNewsListByIds(String[] Ids);

	public int insertNewsList(List<News> newss);

	public void updateNewsList(List<News> newss);

	public List<News> findNewsQuery(Map map);

	public List<News> findNewsQueryPage(Map map);

	public int findCountNewsQuery(Map map);

}
