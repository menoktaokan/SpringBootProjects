package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("user").password("a").roles("USER")
		.and()
		.withUser("admin").password("b").roles("ADMIN");
		
	}
		
	@Bean
	public PasswordEncoder passwordEncoder () {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasRole("USER")
		.and()
		.formLogin();
		
		http.logout().permitAll();
		
		http
		.authorizeRequests()
		.antMatchers("/").permitAll()
		.anyRequest()
		.authenticated(); //gelen bütün istekleri kontrol et (hepsini ele al)
		
		http.formLogin()
		.loginPage("/loginForm")
		.loginProcessingUrl("/authenticateTheUser") //işi springe yaptırmak istediğimizi söyledik
		.permitAll();
		
		http.exceptionHandling()
		.accessDeniedPage("/accessDenied");
		
	}

	
}
