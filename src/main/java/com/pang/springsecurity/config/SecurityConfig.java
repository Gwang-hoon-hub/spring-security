package com.pang.springsecurity.config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity(debug = true) // 통과하고 있는 필터체인을 보여준다.
@EnableGlobalMethodSecurity (prePostEnabled = true)    //
public class SecurityConfig extends WebSecurityConfigurerAdapter {
}
