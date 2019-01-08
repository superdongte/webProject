package com.yi.project.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.project.mvc.commandHandler;
import com.yi.project.service.projectSpmsService;

public class ProjectDeleteHandler implements commandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			String no = req.getParameter("no");
			System.out.println(no);
			int pno = Integer.parseInt(no);
			
			projectSpmsService service = new projectSpmsService();
			boolean delete = service.deleteProject(pno);
			return "list.do";
		}
		return null;
	}

}
