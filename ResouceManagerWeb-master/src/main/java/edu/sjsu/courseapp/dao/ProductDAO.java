package edu.sjsu.courseapp.dao;

import java.util.List;

import edu.sjsu.courseapp.domain.Product;
import edu.sjsu.courseapp.domain.ProductEbay;

public interface ProductDAO {

	public int getProductCount();
	public List getProductList(int suk);

	int findTotalOrdersByName(String prodName);

	public String findProdNameById(int id);

	public Product findProdByName(String prodName);

	public void insertProduct(List<Product> prod);
	public void insertProductEbay(List<ProductEbay> prod);

	public int updateTotalOrders(Product prod, int change);
	 
	public void deletePro(int suk);
	public List getProductallList() ;
	

}
