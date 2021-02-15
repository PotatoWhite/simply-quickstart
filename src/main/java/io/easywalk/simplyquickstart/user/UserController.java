package io.easywalk.simplyquickstart.user;

import io.easywalk.simply.controllable.AbstractControllable;
import io.easywalk.simply.controllable.SimplyControllableResponse;
import io.easywalk.simplyquickstart.user.entities.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SimplyControllableResponse
@RequestMapping("users")
public class UserController extends AbstractControllable<User, Long> {
    public UserController(UserService service) {
        super(service);
    }
}
