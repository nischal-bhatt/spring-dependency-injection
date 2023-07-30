package spring.di.nish.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"ES","default"})
public class ThirdServiceImpl implements ThirdService {
    @Override
    public String i18n() {
        return "first";
    }
}
