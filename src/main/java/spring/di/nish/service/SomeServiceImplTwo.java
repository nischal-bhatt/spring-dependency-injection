package spring.di.nish.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("boo")

public class SomeServiceImplTwo implements SomeService {
    @Override
    public String aloha() {
        return "2";
    }
}
