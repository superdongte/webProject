package com.yi.project.service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.yi.project.dao.ProjectSpmsDao;
import com.yi.project.model.ProjectSpms;
import com.yi.project.mvc.MySqlSessionFactory;

public class projectSpmsService {
	private static projectSpmsService service = new projectSpmsService();
	
	public static projectSpmsService getInstance(){
		return service;
	}
	private static final String namespace = "com.yi.project.dao.ProjectSpmsDao";
	
	public List<ProjectSpms> SelectAllList(){
		SqlSession session = null;
		try{
			session = MySqlSessionFactory.openSession();
			ProjectSpmsDao dao = session.getMapper(ProjectSpmsDao.class);
			List<ProjectSpms> list = dao.selectByAllList();
			return list;
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	public void insertProject(ProjectSpms pro){
		SqlSession session = null;
		
		try{
			session = MySqlSessionFactory.openSession();
			
			ProjectSpmsDao dao = session.getMapper(ProjectSpmsDao.class);
			ProjectSpms projectSpms = new ProjectSpms();
			
			projectSpms.setProject_no(0);
			projectSpms.setTitle(pro.getTitle());
			projectSpms.setPro_content(pro.getPro_content());
			projectSpms.setPro_start(pro.getPro_start());
			projectSpms.setPro_end(pro.getPro_end());
			projectSpms.setPro_state(pro.getPro_state());
			
			dao.insertProject(projectSpms);
			dao.selectLastNo();
			session.commit();
		}catch(Exception e){
			session.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}		
	}
	public ProjectSpms selectByProject(int no){
		SqlSession session= null;
		
		try{
			session = MySqlSessionFactory.openSession();
			ProjectSpmsDao dao = session.getMapper(ProjectSpmsDao.class);
			
			ProjectSpms project = dao.selectByProject(no);
			ProjectSpms projectSpms = new ProjectSpms();
			
			projectSpms.setProject_no(project.getProject_no());
			projectSpms.setTitle(project.getTitle());
			projectSpms.setPro_content(project.getPro_content());
			projectSpms.setPro_start(project.getPro_start());
			projectSpms.setPro_end(project.getPro_end());
			projectSpms.setPro_state(project.getPro_state());
			return project;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}
	public void updateProject(ProjectSpms projectSpms){		
		try (SqlSession sqlSession = MySqlSessionFactory.openSession();) {
			sqlSession.update(namespace + ".updateProject", projectSpms);
			sqlSession.commit();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	public boolean deleteProject(int no){
		SqlSession session = null;
		try{
			session = MySqlSessionFactory.openSession();
			
			ProjectSpmsDao dao = session.getMapper(ProjectSpmsDao.class);
			dao.deleteProject(no);
			session.commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return false;
	}

}
