package ib.ethan.streamsubscriber.messagechannel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySubscribeChannel {
    String input = "input";

    @Input(MySubscribeChannel.input)
    SubscribableChannel mySubscribeChannel();
}
