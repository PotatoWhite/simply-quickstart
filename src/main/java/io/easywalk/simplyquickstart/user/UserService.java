package io.easywalk.simplyquickstart.user;

import io.easywalk.simply.serviceable.AbstractServiceable;
import io.easywalk.simplyquickstart.user.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractServiceable<User, Long> {
    protected UserService(UserRepository repository) {
        super(repository);
    }
}
