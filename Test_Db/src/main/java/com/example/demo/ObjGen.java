package com.example.demo;

import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Component;

import com.gen.Generate;

@Component
public class ObjGen {
	@Bean
	public Generate getObj() {
		return (new Generate());
	}
}
