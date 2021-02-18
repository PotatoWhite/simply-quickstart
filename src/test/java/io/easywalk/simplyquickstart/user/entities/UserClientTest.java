package io.easywalk.simplyquickstart.user.entities;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
class UserClientTest {

    @Autowired
    UserClient client;

    @Test
    public void create() throws Throwable {
        User 유닛테스터 = client.create(new User("유닛테스터", "unit@example.com"));
        log.info("유닛테스터 {} ", 유닛테스터);
        assertEquals(유닛테스터.getId() != null, true);
    }
}