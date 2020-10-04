package ib.ethan.streamsubscriber.config;

import ib.ethan.streamsubscriber.messagechannel.MySubscribeChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@EnableBinding(MySubscribeChannel.class)
@Configuration
public class RabbitConfiguration {


}
