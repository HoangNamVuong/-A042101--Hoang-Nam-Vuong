package furama.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    MyUserDetailService myUserDetailService;

    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
        }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/error");
        http
                .formLogin()
                .and()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/employee","/customer").hasAnyRole("ADMIN","USER")
                .antMatchers("/employee/create", "/employee/edit/**", "/employee/delete/**").hasRole("ADMIN")
                .anyRequest().authenticated();
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String pass = bCryptPasswordEncoder.encode("123");
        System.out.println(pass);
    }
}
