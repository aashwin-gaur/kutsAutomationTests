package com.kutsAutomation.pages;

public class Pages {

	
	private static AdminLoginPage adminLoginPage = new AdminLoginPage();
	private static DashboardPage dashboardPage = new DashboardPage();
	private static ProductsPage productsPage = new ProductsPage();
	private static AddProductsPage addProductsPage = new AddProductsPage();
	
	public static AdminLoginPage getAdminLoginPage(){
		return adminLoginPage;
	}
	
	public static DashboardPage getDashboardPage(){
		return dashboardPage;
	}
	
	public static ProductsPage getProductsPage(){
		return productsPage;
	}
	
	public static AddProductsPage getAddProductsPage(){
		return addProductsPage;
	}
}
