package com.santechture.api;

import com.santechture.api.configuration.JwtTokenUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
class AdminTestApiApplicationTests {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Test
    public void testGenerateToken() {
        User user = new User("admin","password",new ArrayList<>());
        String token = jwtTokenUtil.generateToken(user);
        assertNotNull(token);
    }

}
