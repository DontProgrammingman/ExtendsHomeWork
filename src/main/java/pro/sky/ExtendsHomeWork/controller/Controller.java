package pro.sky.ExtendsHomeWork.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.ExtendsHomeWork.Interface.LoginService;
import pro.sky.ExtendsHomeWork.exception.WrongLoginException;
import pro.sky.ExtendsHomeWork.exception.WrongPasswordException;


@RestController
@RequestMapping()
public class Controller {
    private final LoginService loginService;

    public Controller(LoginService loginService){
        this.loginService = loginService;
    }
    @GetMapping
    public String autorization(@RequestParam String login, @RequestParam String password, @RequestParam String confirmPassword){
        try{
            return loginService.login(login) + " " + loginService.password(password, confirmPassword);
        }catch (WrongLoginException w){
            return "Слишком длинный логин";
        }catch (WrongPasswordException w){
            return "Не совпадают пароли";
        }
    }
}
