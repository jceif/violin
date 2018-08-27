package com.violin.service.news;

import com.violin.common.page.PageUtil;
import com.violin.model.news.News;

import java.util.List;
import java.util.Map;

public interface NewsService {

	public void insertNews(News news);

	public void deleteNewsById(String newsId);

	public int deleteNewsAll();

	public void updateNews(News news);

	public News findNewsById(String newsId);

	public List<News> findNewsList();

	public int deleteNewsListByIds(String[] Ids);

	public int deleteNewsList(List<News> newss);

	public void insertNewsList(List<News> newss);

	public void updateNewsList(List<News> newss);

	public List<News> findNewsQuery(Map map);

	public PageUtil<News> findNewsQueryPage(Map map, String pageNo, String pageSize);

	public int findCountNewsQuery(Map map);

}
