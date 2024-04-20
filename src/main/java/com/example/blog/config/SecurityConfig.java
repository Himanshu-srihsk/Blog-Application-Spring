package com.example.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;

import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.SpringSecurityJWT.config.JwtAuthFilter;
import com.example.blog.Security.JwtAuthenicationEntryPoint;
import com.example.blog.Security.JwtAuthenticationFilter;

import lombok.RequiredArgsConstructor;



@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
public class SecurityConfig{
//	@Autowired
//	private CustomUserDetailsService customUserDetailsService;
//	@Autowired
//	private JwtAuthenticationFilter filter;
	
	@Autowired
    private JwtAuthenicationEntryPoint point;
	
	private final AuthenticationProvider authenticationProvider;
    private final JwtAuthenticationFilter jwtAuthFilter;
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { 
		http.csrf(AbstractHttpConfigurer::disable)
        .authorizeHttpRequests(
        		auth -> 
//        		auth.requestMatchers("/home/**").authenticated()
        		auth
        		.requestMatchers("/auth/**").permitAll()
        		.requestMatchers(HttpMethod.GET).permitAll()
        		.anyRequest().authenticated()
        		)
        .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .authenticationProvider(authenticationProvider);
		http.addFilterBefore(this.jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
    }
}