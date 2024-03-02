//package com.example.java_basic.listener;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.Exchange;
//import org.springframework.amqp.rabbit.annotation.Queue;
//import org.springframework.amqp.rabbit.annotation.QueueBinding;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//public class RabbitMQListener {
//    private static final String queueName = "test.Queue";
//    private static final String exchangeName = "test.exchange";
//    private static final String exchangeTypeA = "topicA";
//    private static final String exchangeTypeB = "topicB";
//
//    @RabbitListener(queues = queueName)
//    public void listenerWithoutExchangeA(Message message) {
//        log.info("listenerWithoutExchangeA Message:{}", new String(message.getBody()));
//    }
//
//    @RabbitListener(queues = queueName)
//    public void listenerWithoutExchangeB(Message message) {
//        log.info("listenerWithoutExchangeB Message:{}", new String(message.getBody()));
//    }
//
//    @RabbitListener(queues = queueName)
//    public void listenerWithoutExchangeC(Message message) {
//        log.info("listenerWithoutExchangeC Message:{}", new String(message.getBody()));
//    }
//
//    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueName, durable = "true"), exchange = @Exchange(value = exchangeName, durable = "true", type = exchangeTypeA, ignoreDeclarationExceptions = "false")
//            , key = "springboot.*"))
//    public void listenerA(Message message) {
//        log.info("A Message:{}", new String(message.getBody()));
//    }
//
////    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueName, durable = "true"), exchange = @Exchange(value = exchangeName, durable = "true", type = exchangeTypeA, ignoreDeclarationExceptions = "false")
////            , key = "springboot.*"))
////    public void listenerB(Message message) {
////        log.info("B Message:{}", new String(message.getBody()));
////    }
//
//    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueName, durable = "true"), exchange = @Exchange(value = exchangeName, durable = "true", type = exchangeTypeB, ignoreDeclarationExceptions = "false")
//            , key = "springboot.*"))
//    public void listenerC(Message message) {
//        log.info("C Message:{}", new String(message.getBody()));
//    }
//
////    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = queueName, durable = "true"), exchange = @Exchange(value = exchangeName, durable = "true", type = exchangeTypeB, ignoreDeclarationExceptions = "false")
////            , key = "springboot.*"))
////    public void listenerD(Message message) {
////        log.info("D Message:{}", new String(message.getBody()));
////    }
//}
