package spring.di.nish.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("EN")
public class ThirdServiceImplTwo implements ThirdService {
    @Override
    public String i18n() {
        return "second";
    }
}
