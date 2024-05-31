package com.ecommerce.core.usecase.user;

import com.ecommerce.core.entity.User;
import com.ecommerce.core.entity.exception.UserAlreadyExistException;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class UserCreateUseCaseTest {
    @InjectMocks
    UserCreateUseCase useCase;
    @Mock
    UserRepository userRepository;

    @Test
    public void SameEmailException() {
        // create fake input
        UserCreateUseCase.InputData input = new UserCreateUseCase.InputData("email@gmail.com","taras","qwertyui");

        // create mock for a method of UserRepository
        // method call simulation
        doReturn(true)
                .when(userRepository)
                .existUser(input.getEmail());

        //handle an exception
        Exception exception = assertThrows(UserAlreadyExistException.class,()-> {
            useCase.execute(input);
        });
        // equal exceptions and massages of exceptions
        assertEquals(UserAlreadyExistException.class,exception.getClass());
        assertEquals("email is already in use",exception.getMessage());
    }
    @Test
    public void successfulCreationOfUser() {
        // create test user and fake input
        User expected = new User("email@gmail.com","qwertyui","taras");
        UserCreateUseCase.InputData input = new UserCreateUseCase.InputData(
                                                        expected.getEmail(),
                                                        expected.getName(),
                                                        expected.getPassword());
        // create mock for a method of UserRepository
        // method call simulation
        doReturn(expected)
                .when(userRepository)
                .create(any(User.class));

        // call execute method to get a User
        User actual = useCase.execute(input).getUser();

        // Equal different fields of the User
        assertEquals(expected.getName(),actual.getName());
        assertEquals(expected.getEmail(),actual.getEmail());
        assertEquals(expected.getPassword(),actual.getPassword());
    }

}