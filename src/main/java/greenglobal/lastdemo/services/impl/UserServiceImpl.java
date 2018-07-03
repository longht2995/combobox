package greenglobal.lastdemo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import greenglobal.lastdemo.services.UserService;

@Service("userService")
@Scope(value = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao ud;
	public boolean checkUsername(String username) {
		return ud.checkUsername(username);
	}
	
}
