package com.dingcloud.dubbo.example.common;

import java.util.List;

/**
 * @author lixinwen
 * @createTime 2020年3月15日
 */
public interface UserService {

	void add(List<User> list) throws Exception;
}
