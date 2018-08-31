package com.violin.dao.mapping.producttype;


import com.violin.model.producttype.ProductType;

import java.util.List;
import java.util.Map;

public interface ProductTypeMapper {

	void insertProductType(ProductType productType);

	void deleteProductTypeById(String productTypeId);

	int deleteProductTypeAll();

	void updateProductType(ProductType productType);

	ProductType findProductTypeById(String productTypeId);

	List<ProductType> findProductTypeList();

	int deleteProductTypeList(List<ProductType> productTypes);

	int deleteProductTypeListByIds(String[] Ids);

	int insertProductTypeList(List<ProductType> productTypes);

	void updateProductTypeList(List<ProductType> productTypes);

	List<ProductType> findProductTypeQuery(Map map);

	List<ProductType> findProductTypeQueryPage(Map map);

	int findCountProductTypeQuery(Map map);

}
