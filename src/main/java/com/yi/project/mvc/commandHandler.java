package com.yi.project.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface commandHandler {
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception;
	
}
