package com.redis;

import redis.clients.jedis.Jedis;

public class RedisJava {

	 public static void main(String[] args) {
	      //连接本地的 Redis 服务
	      //Jedis jedis = new Jedis("localhost");
	      Jedis jedis = new Jedis("127.0.0.1");
	      System.out.println("Connection to server sucessfully");
	      //查看服务是否运行
	      System.out.println("Server is running: "+jedis.ping());
	 }
}
