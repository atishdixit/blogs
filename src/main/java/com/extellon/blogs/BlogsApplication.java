package com.extellon.blogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogsApplication.class, args);
	}
}


/**
 * Need to update repository with formatter, converter, paginations, SSL, Read blogs from sftp server, loggers, s3 for Images and backup
 */