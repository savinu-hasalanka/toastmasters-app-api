package com.example.app.service.user;

import com.example.app.exception.AlreadyExistsException;
import com.example.app.model.AppUser;
import com.example.app.request.UserLoginRequest;
import com.example.app.request.UserRegisterRequest;

public interface IAppUserService {

    String login(UserLoginRequest user);
    AppUser register(UserRegisterRequest user) throws AlreadyExistsException;
}
