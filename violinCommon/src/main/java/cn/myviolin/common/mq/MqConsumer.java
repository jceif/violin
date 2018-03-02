package cn.myviolin.common.mq;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Created by jc on 2018/3/2 15:59
 * description Mq消费者
 */
public class MqConsumer {
    public  static  void consume(){
        Connection connection = null;
        Channel channel = null;
        try
        {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("http://10.20.0.38");
            factory.setPort(15672);
            factory.setUsername("feijiuchun");
            factory.setPassword("feijiuchun");
            connection = factory.newConnection();
            channel = connection.createChannel();

            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                        throws IOException {
                    String message = new String(body, "UTF-8");
                    System.out.println(" Consumer have received '" + message + "'");
                }
            };
            channel.basicConsume("firstQueue", true, consumer);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
