package com.yi.project.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.yi.project.model.ProjectSpms;
import com.yi.project.mvc.MySqlSessionFactory;

public class ProjectSpmsTest {
	@Test
	public void test01SelectAllList(){
		SqlSession session = null;
		
		try{
			session = MySqlSessionFactory.openSession();
			ProjectSpmsDao dao = session.getMapper(ProjectSpmsDao.class);
			List<ProjectSpms> list = dao.selectByAllList();
			System.out.println(list);
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
}
