package com.ltj.springboot.windows.redis;

import redis.clients.jedis.Jedis;

public class ConnectionDemo {

	public static void main(String[] args) {
//连接本地Redis服务，可以不设置port，但是不能是IP，必须是localhost
		Jedis jedis = new Jedis("localhost");
		// 如果设置了密码，必须使用密码登录
		jedis.auth("12345");
		System.out.println("连接成功");
		// 查看服务是否在运行
		System.out.println("服务正在运行：" + jedis.ping());
		jedis.set("test", "myTestValue");
		System.out.println("redis 存储：" + jedis.get("test"));
		System.out.println(jedis.get("mykey"));
	}

}
