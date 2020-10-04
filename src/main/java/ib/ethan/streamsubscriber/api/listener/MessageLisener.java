package ib.ethan.streamsubscriber.api.listener;

import ib.ethan.streamsubscriber.api.listener.dto.MyMessage;
import ib.ethan.streamsubscriber.messagechannel.MySubscribeChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class MessageLisener {

    @StreamListener(target = MySubscribeChannel.input, condition = "")
    public void doExecute(MyMessage myMessage) {

    }
}
