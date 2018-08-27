package com.violin.service.producttype;


import com.violin.common.page.PageUtil;
import com.violin.model.producttype.ProductType;

import java.util.List;
import java.util.Map;

public interface ProductTypeService {

	 void insertProductType(ProductType productType);

	 void deleteProductTypeById(String productTypeId);

	 int deleteProductTypeAll();

	 void updateProductType(ProductType productType);

	 ProductType findProductTypeById(String productTypeId);

	 List<ProductType> findProductTypeList();

	 int deleteProductTypeListByIds(String[] Ids);

	 int deleteProductTypeList(List<ProductType> productTypes);

	 void insertProductTypeList(List<ProductType> productTypes);

	 void updateProductTypeList(List<ProductType> productTypes);

	 List<ProductType> findProductTypeQuery(Map map);

	 PageUtil<ProductType> findProductTypeQueryPage(Map map, String pageNo, String pageSize);

	 int findCountProductTypeQuery(Map map);

}
