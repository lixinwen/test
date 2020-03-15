package com.dingcloud.dubbo.example.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lixinwen
 * @createTime 2020年1月6日
 * @since 1.0
 */
public class TestProvider {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
		context.start();
		System.in.read(); // 按任意键退出
		context.close();
	}
}
