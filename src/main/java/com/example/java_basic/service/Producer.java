package com.example.java_basic.service;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;


public class Producer {
        private static final String queueName = "test.Queue.A";
    private static final String exchangeName = "test.exchange";
    private static final String EXCHANGE_TYPE_TOPIC = "topic";
    private static final String EXCHANGE_TYPE_DIRECT = "direct";

    private static final String QUEUE_NAME = "hello"; // queue的名稱

    public static void main(String[] arges) throws Exception{
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("guest");
        factory.setPassword("guest");
        factory.setVirtualHost("/");
        factory.setPort(5672);
//        try (
                Connection connection = factory.newConnection();
//        ) {
            Channel channel = connection.createChannel();
//            channel.basicQos(1);
            String message = "Hello World!";
            channel.exchangeDeclare(exchangeName, EXCHANGE_TYPE_DIRECT);
//        channel.queueBind(queueName, exchangeName, "springboot.A.*");
            channel.queueDeclare(queueName, false, false, false, null);
            channel.basicPublish(exchangeName, "springboot.A.*", null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }

}
