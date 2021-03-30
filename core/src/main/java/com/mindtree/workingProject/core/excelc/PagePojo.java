package com.mindtree.workingProject.core.excelc;

public class PagePojo {
	
	private String pageName;
	private String pagePath;
	private String templatePath;
	private String pageTitle;
	private String name;
	private String gender;
	
	
	
	public PagePojo() {
		super();
	}



	public PagePojo(String pageName, String pagePath, String templatePath, String pageTitle, String name,
			String gender) {
		super();
		this.pageName = pageName;
		this.pagePath = pagePath;
		this.templatePath = templatePath;
		this.pageTitle = pageTitle;
		this.name = name;
		this.gender = gender;
	}



	public String getPageName() {
		return pageName;
	}



	public void setPageName(String pageName) {
		this.pageName = pageName;
	}



	public String getPagePath() {
		return pagePath;
	}



	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}



	public String getTemplatePath() {
		return templatePath;
	}



	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}



	public String getPageTitle() {
		return pageTitle;
	}



	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
