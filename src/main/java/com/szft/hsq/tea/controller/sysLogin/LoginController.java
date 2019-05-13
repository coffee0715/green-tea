package com.szft.hsq.tea.controller.sysLogin;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.szft.hsq.tea.model.UserModel;
import com.szft.hsq.tea.service.sysLogin.LoginService;

import net.sf.json.JSONObject;

@RestController
public class LoginController {
	/**
	 * 日志
	 */
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Resource
	private LoginService loginService;
	/**
	 * 新增用户
	 * 
	 * @author zhongjiahui  
	 * @date 2018年10月15日
	 */
	@RequestMapping(value="/login/addUser.do",method = RequestMethod.POST)
	public JSONObject addUserInfo(UserModel userModel) {
		JSONObject obj = new JSONObject();
		try {
			logger.info("收到请求！");
			loginService.addUser(userModel);
			obj.put("success", "true");
			obj.put("message", "插入成功！");
		} catch (Exception e) {
			logger.error("插入失败，信息为：",e);
			obj.put("success", "false");
			obj.put("message", "插入失败！");
		}
		return obj;
	}
	/**
	 * 登录
	 * 
	 * @author zhongjiahui  
	 * @date 2018年10月16日
	 */
	@RequestMapping(value="sysManage/login.do",method = RequestMethod.POST)
	public JSONObject loginUser(UserModel userModel) {
		JSONObject obj = new JSONObject();
		try {
			logger.info("收到请求！");
			if(userModel != null) {
				logger.info("userName:" + userModel.getUserName());
				logger.info("password:" + userModel.getPassword());
			}
			obj.put("success", "true");
			obj.put("message", "登录成功！");
		} catch (Exception e) {
			logger.error("登录失败，信息为：",e);
			obj.put("success", "false");
			obj.put("message", "登录失败！");
		}
		return obj;
	}
}
