package pro.sky.ExtendsHomeWork.service;

import org.springframework.stereotype.Service;
import pro.sky.ExtendsHomeWork.Interface.LoginService;
import pro.sky.ExtendsHomeWork.exception.WrongLoginException;
import pro.sky.ExtendsHomeWork.exception.WrongPasswordException;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(String login) throws WrongLoginException {
        if (login.length() >= 20){
            throw new WrongLoginException("Логин Слишком длинный");
        }
        return login;
    }
    @Override
    public String password(String password, String confirmPassword) throws WrongPasswordException{
        if(!password.equals(confirmPassword))
            throw new WrongPasswordException("Пароль не совпадает");
        else
            return password;
    }
}
