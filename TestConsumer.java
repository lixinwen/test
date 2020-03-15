package com.dingcloud.dubbo.example.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dingcloud.dubbo.example.common.User;
import com.dingcloud.dubbo.example.common.UserService;

/**
 * @author lixinwen
 * @createTime 2020年3月15日
 */
public class TestConsumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		UserService userService = (UserService) context.getBean("userService");
		List<User> list = new ArrayList<>();
		list.add(new User(1, "Helen"));
		list.add(new User(2, "Cindy"));
		userService.add(list);
		System.out.println("ok");
	}
}
