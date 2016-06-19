package com.kutsAutomation.pages;

public class Pages {

	
	private static AdminLoginPage adminLoginPage = new AdminLoginPage();
	private static DashboardPage dashboardPage;
	
	public static AdminLoginPage getAdminLoginPage(){
		return adminLoginPage;
	}
	
	public static DashboardPage getDashboardPage(){
		return dashboardPage;
	}
	
}
