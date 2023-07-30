package spring.di.nish;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.di.nish.service.GreetingService;
import spring.di.nish.service.SomeService;
import spring.di.nish.service.ThirdService;

@Controller
public class MyController {

    public MyController(GreetingService greetingService,
                        @Qualifier("boo")SomeService someService,
                        ThirdService thirdService) {
        this.greetingService = greetingService;
        this.someService = someService;
        this.thirdService = thirdService;
    }

    private final GreetingService greetingService;

    private final ThirdService thirdService;

    private final SomeService someService;


    public String sayHello() {
        System.out.println(someService.aloha());
        System.out.println(this.thirdService.i18n());
        return greetingService.hi();
    }
}
