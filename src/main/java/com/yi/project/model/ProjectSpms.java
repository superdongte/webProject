package com.yi.project.model;

import java.util.Date;

public class ProjectSpms {
	private int project_no;
	private String title;
	private String pro_content;
	private Date pro_start;
	private Date pro_end;
	private String pro_state;
	
	public ProjectSpms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProject_no() {
		return project_no;
	}

	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPro_content() {
		return pro_content;
	}

	public void setPro_content(String pro_content) {
		this.pro_content = pro_content;
	}

	/*public String getPro_start() {
		return String.format("%tF", pro_start);
	}*/
	
	public Date getPro_start() {
		return pro_start;
	}
	
	public void setPro_start(Date pro_start) {
		this.pro_start = pro_start;
	}
	/*public String getPro_end() {
		return String.format("%tF", pro_end);
	}*/
	public Date getPro_end() {
		return pro_end;
	}

	public void setPro_end(Date pro_end) {
		this.pro_end = pro_end;
	}

	public String getPro_state() {
		return pro_state;
	}

	public void setPro_state(String pro_state) {
		this.pro_state = pro_state;
	}

	public ProjectSpms(int project_no, String title, String pro_content, Date pro_start, Date pro_end,
			String pro_state) {
		super();
		this.project_no = project_no;
		this.title = title;
		this.pro_content = pro_content;
		this.pro_start = pro_start;
		this.pro_end = pro_end;
		this.pro_state = pro_state;
	}

	@Override
	public String toString() {
		return "ProjectSpms [project_no=" + project_no + ", title=" + title + ", pro_content=" + pro_content
				+ ", pro_start=" + pro_start + ", pro_end=" + pro_end + ", pro_state=" + pro_state + "]";
	}
	
	
	
}
