package cn.myviolin.common.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by jc on 2018/3/2 15:58
 * description mq
 */
public class MqProducer {
    public static void publish(){
        Connection connection = null;
        Channel channel = null;
        try
        {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("http://10.20.0.38");
            factory.setPort(15672);
            factory.setUsername("feijiuchun");
            factory.setPassword("feijiuchun");
            //factory.setVirtualHost("test_vhosts");

            //创建与RabbitMQ服务器的TCP连接
            connection  = factory.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare("firstQueue", true, false, false, null);
            String message = "First Message";
            channel.basicPublish("", "firstQueue", null, message.getBytes());
            System.out.println("Send Message is:'" + message + "'");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            if(channel != null)
            {
                try {
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null)
            {
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
