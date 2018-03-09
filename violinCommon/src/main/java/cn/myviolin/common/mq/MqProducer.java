package cn.myviolin.common.mq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.sun.org.apache.bcel.internal.generic.CALOAD;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeoutException;

/**
 * Created by jc on 2018/3/2 15:58
 * description mq
 */
public class MqProducer {
    static  SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void publish(String exchangeName){
        Connection connection = null;
        Channel channel = null;
        try
        {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("10.20.0.38");
            factory.setPort(5672);
            factory.setUsername("feijiuchun");
            factory.setPassword("feijiuchun");
            //创建与RabbitMQ服务器的TCP连接
            connection  = factory.newConnection();
            channel = connection.createChannel();
            //声明路由名字和类型
            //channel.exchangeDeclare(exchangeName,"fanout",true,false,null);
            channel.exchangeDeclare(exchangeName,"direct",true,false,null);

            channel.queueDeclare(exchangeName, true, false, false, null);
            String message = exchangeName+"___"+simpleDateFormat.format(Calendar.getInstance().getTime());
            //routingkey1
            channel.basicPublish(exchangeName,"routingkey2" , null, message.getBytes());
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

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            publish("EXCHANGE_NAME3");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //publish("EXCHANGE_NAME2");
        }

    }
}
