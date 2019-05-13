package com.szft.hsq.tea.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.szft.hsq.tea.dao.sysLogin.LoginDao;
import com.szft.hsq.tea.model.UserModel;
import com.szft.hsq.tea.service.sysLogin.LoginService;
@Service("LoginService")
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginDao loginDao;
	@Override
	public void addUser(UserModel userModel) {
		try {
			if(userModel != null) {
				System.out.println("userName:" + userModel.getUserName());
				int num = loginDao.addUser(userModel);
				System.out.println("成功插入了：" + num);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
