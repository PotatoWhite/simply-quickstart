package io.easywalk.simplyquickstart.user;

import io.easywalk.simplyquickstart.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
