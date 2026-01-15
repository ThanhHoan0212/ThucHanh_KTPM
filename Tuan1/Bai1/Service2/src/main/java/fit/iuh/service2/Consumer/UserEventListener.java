package fit.iuh.service2.Consumer;

import fit.iuh.service2.Config.RabbitMQConfig;
import fit.iuh.service2.event.UserCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void handleUserCreated(UserCreatedEvent event) {
        System.out.println("Received event: " + event);

        System.out.println("Sending email to: " + event.getEmail());
    }
}
