package gr.helix.core.common.config;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidationConfiguration {

    @Bean(name = { "beanValidator", "defaultBeanValidator" })
    Validator validator() {
        try (LocalValidatorFactoryBean b = new LocalValidatorFactoryBean()) {
            b.afterPropertiesSet();
            return b.getValidator();
        }
    }

}