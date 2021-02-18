package io.easywalk.simplyquickstart.user;

import io.easywalk.simply.controllable.AbstractControllable;
import io.easywalk.simply.controllable.SimplyControllableResponse;
import io.easywalk.simply.controllable.SimplyWebLogging;
import io.easywalk.simplyquickstart.user.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@SimplyControllableResponse
@RequestMapping("users")
public class UserController extends AbstractControllable<User, Long> {
    private final UserService service;

    public UserController(UserService service) {
        super(service);
        this.service = service;
    }

    @SimplyWebLogging
    @GetMapping("/withHello")
    public List<String> withHello() {
        return service.getAll().stream().map(user -> "Hello" + user.getName())
                      .collect(Collectors.toList());
    }
}
