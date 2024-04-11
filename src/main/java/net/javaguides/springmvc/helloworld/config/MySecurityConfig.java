package net.javaguides.springmvc.helloworld.config;

import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import sun.security.util.Password;

@Configuration
@EnableWebSecurity(debug = true)//@EnableWebSecurity this annotation create spring security filter chain
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    //this class is going to help you to create spring security filter chain (GUN Man)


    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //admin
        auth.inMemoryAuthentication()
                .withUser("ram")
                .password("{bcrypt}$2a$12$GkLDP8PZQMJT05I.L5NcsuP.Tj7TeRgJm3vywSGQG9FiD3qpO9vmG")
                .roles("admin");
        //normal user
         auth.inMemoryAuthentication().
                 withUser("vishnu").
                 password("{bcrypt}$2a$12$GkLDP8PZQMJT05I.L5NcsuP.Tj7TeRgJm3vywSGQG9FiD3qpO9vmG").
                 roles("user");
    }



    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/step1").hasRole("admin")
                .antMatchers("/step2").hasRole("admin")
                .antMatchers("/hello").hasRole("user")
                .antMatchers("/helloworld").permitAll()
                .antMatchers("/template").permitAll()
                //.antMatchers("/mycustomlogin").permitAll()
                .and().formLogin().loginPage("/mycustomlogin").loginProcessingUrl("/process-login")
                .and().httpBasic()
                .and().logout();

        //disable the csrf token
        //http.csrf().disable();
    }
    }

