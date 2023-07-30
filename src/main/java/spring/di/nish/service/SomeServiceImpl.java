package spring.di.nish.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class SomeServiceImpl implements SomeService {
    @Override
    public String aloha() {
        return "test";
    }
}
