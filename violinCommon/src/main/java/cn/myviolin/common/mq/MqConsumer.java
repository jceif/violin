package cn.myviolin.common.mq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jc on 2018/3/2 15:59
 * description Mq消费者
 */
public class MqConsumer {
    static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public  static  void consume(String exchangeName,String queueName){
        Connection connection = null;
        Channel channel = null;
        try
        {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("10.20.0.38");
            factory.setPort(5672);
            factory.setUsername("feijiuchun");
            factory.setPassword("feijiuchun");
            connection = factory.newConnection();
            channel = connection.createChannel();
            //声明路由名字和类型
            channel.exchangeDeclare(exchangeName, "direct", true, false, null);
            //声明队列
            channel.queueDeclare(queueName, true, false, false, null);
            //绑定路由和队列
            channel.queueBind(queueName, exchangeName, "routingkey2", null);
            channel.queueBind(queueName, exchangeName, "routingkey1", null);
            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                        throws IOException {
                    String message = new String(body, "UTF-8");
                    System.out.println(" Consumer have received " + message +"_____"+simpleDateFormat.format(Calendar.getInstance().getTime()));
                }
            };
            //指定消费队列
            channel.basicConsume(queueName, true, consumer);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args){
        consume("EXCHANGE_NAME3","QUEUE_NAME1");
       // consume("EXCHANGE_NAME2","QUEUE_NAME2");
    }
}
