package com.yi.project.handler;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yi.project.model.ProjectSpms;
import com.yi.project.mvc.commandHandler;
import com.yi.project.service.projectSpmsService;

public class ProjectInsertHandler implements commandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("get")){
			return "AddProject.jsp";
		}else if(req.getMethod().equalsIgnoreCase("post")){
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String pro_start = req.getParameter("pro_start");
			String pro_end = req.getParameter("pro_end");
			String pro_state = req.getParameter("pro_state");
			
			
			
			ProjectSpms projectSpms = new ProjectSpms();
			projectSpms.setTitle(title);
			projectSpms.setPro_content(content);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date sDate = sdf.parse(pro_start);
			projectSpms.setPro_start(sDate);
			Date eDate = sdf.parse(pro_end);
			projectSpms.setPro_end(eDate);
			projectSpms.setPro_state(pro_state);
			
			projectSpmsService service = projectSpmsService.getInstance();
			service.insertProject(projectSpms);
			
			return "insertSuccess.jsp";
			
			}
		return null;
	}

}
