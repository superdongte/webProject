package com.yi.project.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSessionException;

import com.yi.project.model.ProjectSpms;

public interface ProjectSpmsDao {
	public List<ProjectSpms> selectByAllList() throws SQLException;
	
	public int selectLastNo() throws SQLException;
	
	public ProjectSpms selectByProject(int no) throws SQLException;
	
	public void insertProject(ProjectSpms projectSpms) throws SQLException; 
	
	public void updateProject(ProjectSpms projectSpms) throws SQLException;
	
	public int deleteProject(int no) throws SQLException;
}
