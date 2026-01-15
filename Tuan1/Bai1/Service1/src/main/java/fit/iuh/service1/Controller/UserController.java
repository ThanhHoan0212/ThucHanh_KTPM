package fit.iuh.service1.Controller;

import fit.iuh.service1.Service.UserEventPublisher;
import fit.iuh.service1.event.UserCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserEventPublisher publisher;

    @PostMapping
    public String createUser() {
        UserCreatedEvent event =
                new UserCreatedEvent(1L, "test@gmail.com");

        publisher.publishUserCreatedEvent(event);

        return "User created & event published";
    }
}

