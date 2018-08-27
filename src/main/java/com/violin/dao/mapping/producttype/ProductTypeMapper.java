package com.violin.dao.mapping.producttype;

import com.violin.model.producttype.ProductType;

import java.util.List;
import java.util.Map;

public interface ProductTypeMapper {

	public void insertProductType(ProductType productType);

	public void deleteProductTypeById(String productTypeId);

	public int deleteProductTypeAll();

	public void updateProductType(ProductType productType);

	public ProductType findProductTypeById(String productTypeId);

	public List<ProductType> findProductTypeList();

	public int deleteProductTypeList(List<ProductType> productTypes);

	public int deleteProductTypeListByIds(String[] Ids);

	public int insertProductTypeList(List<ProductType> productTypes);

	public void updateProductTypeList(List<ProductType> productTypes);

	public List<ProductType> findProductTypeQuery(Map map);

	public List<ProductType> findProductTypeQueryPage(Map map);

	public int findCountProductTypeQuery(Map map);

}
