package com.violin.impl.producttype;

import com.violin.common.page.PageUtil;
import com.violin.dao.mapping.producttype.ProductTypeMapper;
import com.violin.model.producttype.ProductType;
import com.violin.service.producttype.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {

	@Autowired
	private ProductTypeMapper productTypeMapper;

	@Override
	public void insertProductType(ProductType productType)	{
		this.productTypeMapper.insertProductType(productType);
	}

	@Override
	public void deleteProductTypeById(String productTypeId)	{
		this.productTypeMapper.deleteProductTypeById(productTypeId);
	}

	@Override
	public int deleteProductTypeAll()	{
		return this.productTypeMapper.deleteProductTypeAll();
	}

	@Override
	public void updateProductType(ProductType productType)	{
		this.productTypeMapper.updateProductType(productType);
	}

	@Override
	public ProductType findProductTypeById(String productTypeId)	{
		return this.productTypeMapper.findProductTypeById(productTypeId);
	}

	@Override
	public List<ProductType> findProductTypeList()	{
		return this.productTypeMapper.findProductTypeList();
	}

	@Override
	public int deleteProductTypeListByIds(String[] Ids)	{
		return this.productTypeMapper.deleteProductTypeListByIds(Ids);
	}

	@Override
	public int deleteProductTypeList(List<ProductType> productTypes)	{
		return this.productTypeMapper.deleteProductTypeList(productTypes);
	}

	@Override
	public void insertProductTypeList(List<ProductType> productTypes)	{
		 this.productTypeMapper.insertProductTypeList(productTypes);
	}

	@Override
	public void updateProductTypeList(List<ProductType> productTypes)	{
		 this.productTypeMapper.updateProductTypeList(productTypes);
	}

	@Override
	public List<ProductType> findProductTypeQuery(Map map)	{
		return this.productTypeMapper.findProductTypeQuery(map);
	}

	@Override
	public PageUtil<ProductType> findProductTypeQueryPage(Map map,String pageNo,String pageSize)	{
		int totalCount = productTypeMapper.findCountProductTypeQuery(map);
		PageUtil pageUtil = new PageUtil(pageNo, totalCount, pageSize);
		if (totalCount != 0) {
				map.put("startIndex",pageUtil.getStartRecord());
				map.put("limit",pageUtil.getPageSize());
				List<ProductType>productTypeList = this.productTypeMapper.findProductTypeQueryPage(map);
				pageUtil.setRecords(productTypeList);
		}
		return pageUtil;
	}

	@Override
	public int findCountProductTypeQuery(Map map)	{
		return this.productTypeMapper.findCountProductTypeQuery(map);
	}

}
