package com.violin.impl.news;


import com.violin.common.page.PageUtil;
import com.violin.dao.mapping.news.NewsMapper;
import com.violin.model.news.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.violin.service.news.NewsService;

import java.util.List;
import java.util.Map;
@Service("newsService")
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsMapper newsMapper;

	@Override
	public void insertNews(News news)	{
		this.newsMapper.insertNews(news);
	}

	@Override
	public void deleteNewsById(String newsId)	{
		this.newsMapper.deleteNewsById(newsId);
	}

	@Override
	public int deleteNewsAll()	{
		return this.newsMapper.deleteNewsAll();
	}

	@Override
	public void updateNews(News news)	{
		this.newsMapper.updateNews(news);
	}

	@Override
	public News findNewsById(String newsId)	{
		return this.newsMapper.findNewsById(newsId);
	}

	@Override
	public List<News> findNewsList()	{
		return this.newsMapper.findNewsList();
	}

	@Override
	public int deleteNewsListByIds(String[] Ids)	{
		return this.newsMapper.deleteNewsListByIds(Ids);
	}

	@Override
	public int deleteNewsList(List<News> newss)	{
		return this.newsMapper.deleteNewsList(newss);
	}

	@Override
	public void insertNewsList(List<News> newss)	{
		 this.newsMapper.insertNewsList(newss);
	}

	@Override
	public void updateNewsList(List<News> newss)	{
		 this.newsMapper.updateNewsList(newss);
	}

	@Override
	public List<News> findNewsQuery(Map map)	{
		return this.newsMapper.findNewsQuery(map);
	}

	@Override
	public PageUtil<News> findNewsQueryPage(Map map,String pageNo,String pageSize)	{
		int totalCount = newsMapper.findCountNewsQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<News>newsList = this.newsMapper.findNewsQueryPage(map);
				pageUtil.setRecords(newsList);
		}
		return pageUtil;
	}

	@Override
	public int findCountNewsQuery(Map map)	{
		return this.newsMapper.findCountNewsQuery(map);
	}

}
