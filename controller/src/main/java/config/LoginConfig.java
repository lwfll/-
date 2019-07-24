package config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author lwf
 * @Description //TODO
 */
public class LoginConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
       httpSecurity.formLogin()
               .and()           //  定义当需要用户登录时候，转到的登录页面
               .authorizeRequests()       //定义哪些url需要被保护 哪些不需要
               .anyRequest()      // 任何请求,登录后可以访问
               .authenticated()
               .and()
               .csrf().disable();
    }
}
