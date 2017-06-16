package com.example.Sezer;

import org.junit.Test;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import java.util.List;

/**
 * Created by SEZER on 30.05.2017.
 */
public class UserServiceTest {
    @Test
    public void shouldFindUserByName() throws Exception {

        final UserService userService = new UserService();

        final List<User> response = userService.findUsersByName("mustafa");

        assertThat(response.size(), Matchers.equalTo(1));
        assertThat(response.get(0).getName(), Matchers.equalTo("mustafa"));

    }

    @Test
    public void shouldAddUser() throws Exception {

        final UserService userService = new UserService();

        final String newUserName = "randomName";
        final String newUserSurname = "randomSurname";
        userService.addUser(newUserName, newUserSurname);

        final List<User> response = userService.findUsersByName(newUserName);

        assertThat(response.size(), Matchers.equalTo(1));
        assertThat(response.get(0).getName(), Matchers.equalTo(newUserName));
        assertThat(response.get(0).getSurname(), Matchers.equalTo(newUserSurname));

    }
}
