package com.example.blog.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
				title = "Blog Application API's",
				description = "CRUD Operations",
				contact = @Contact(
						name = "Himanshu",
						email = "himanshusoe@gmail.com"
						),
				version = "v1"
				
				),
		servers = @Server(
				url = "http://localhost:8083",
				description = "Blog appliaction API's {POST,REGISTER,LOGIN,COMMENT}"
				
				),
		security = @SecurityRequirement(
				name = "auth"
				)
		)

@SecurityScheme(
		name = "auth",
		in = SecuritySchemeIn.HEADER,
		type = SecuritySchemeType.HTTP,
		bearerFormat = "JWT",
		scheme = "Bearer",
		description = "Security Desc"
		)


public class OpenApiConfig {
	public static final String AUTHORIZATION_HEADER = "Authorization";
   
	
}
