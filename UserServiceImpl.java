package com.dingcloud.dubbo.example.provider;

import java.util.List;

import com.dingcloud.dubbo.example.common.User;
import com.dingcloud.dubbo.example.common.UserService;

/**
 * @author lixinwen
 * @createTime 2020年3月15日
 */
public class UserServiceImpl implements UserService {

	@Override
	public void add(List<User> list) throws Exception {
		list.forEach((Object user) -> {
			System.out.println(user);
			// fastjson's JSONObject, Not User type
			System.out.println(user.getClass());
		});
	}

}
