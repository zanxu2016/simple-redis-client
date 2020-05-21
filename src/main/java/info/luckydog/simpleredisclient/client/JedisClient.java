package info.luckydog.simpleredisclient.client;

import redis.clients.jedis.Jedis;

public class JedisClient {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6388);
        jedis.set("name", "mary");
        System.out.println(jedis.get("name"));

        jedis.close();
    }
}
