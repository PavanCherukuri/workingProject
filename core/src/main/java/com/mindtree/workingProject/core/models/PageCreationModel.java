package com.mindtree.workingProject.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.mindtree.workingProject.core.services.PageCreation;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PageCreationModel {
	
	@Inject
	String path;
	
	@OSGiService
	private PageCreation service;
    
	private String message;
	
	@PostConstruct
	protected void init()
	{
		message="from page creation model";
		service.getPath(path);
	}

	public String getMessage() {
		return message;
	}	
}