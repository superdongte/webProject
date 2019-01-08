package com.yi.project.handler;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.project.model.ProjectSpms;
import com.yi.project.mvc.commandHandler;
import com.yi.project.service.projectSpmsService;

public class ProjectSelectHandler implements commandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			projectSpmsService service = projectSpmsService.getInstance();
			String no = req.getParameter("no");
			int pro = Integer.parseInt(no);
			ProjectSpms proj = service.selectByProject(pro);
			req.setAttribute("proj", proj);
			return "ReadProject.jsp";
		}
		return null;
	}

}
