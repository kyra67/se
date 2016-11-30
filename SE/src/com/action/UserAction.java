package com.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	public String login() throws Exception {
		ActionContext context = ActionContext.getContext();
		HttpServletRequest request = ServletActionContext.getRequest();
		String no = request.getParameter("no");
		String pwd = request.getParameter("pwd");
		
		if(no.isEmpty() || pwd.isEmpty()) {
			return ERROR;
		} else {
			User user = UserDao.isLogin(no, pwd);
			if(user == null) {
				return ERROR;
			} else {
				return SUCCESS;
			}
		}
	}

}
