package com.yi.project.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.project.model.ProjectSpms;
import com.yi.project.mvc.commandHandler;
import com.yi.project.service.projectSpmsService;

public class ProjectSpmsHandler implements commandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			projectSpmsService service = projectSpmsService.getInstance();
			List<ProjectSpms> list = service.SelectAllList();
			
			req.setAttribute("list", list);
			return "Main.jsp";
		}
		return null;
	}

}
