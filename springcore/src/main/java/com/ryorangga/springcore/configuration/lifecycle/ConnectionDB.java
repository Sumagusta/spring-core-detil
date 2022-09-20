package com.ryorangga.springcore.configuration.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConnectionDB implements InitializingBean, DisposableBean {
	@Override
	public void destroy() throws Exception {
		log.info("Connection Closed!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		log.info("Connection ready to used!");
	}
	
	// jika pemanggilannya menggunakan annotation & value
	void startBean() {
		log.info("Connection ready | using lifecycle annotation");
	}
	
	void closeBean() {
		log.info("Connection closed | using lifecycle annotation");
	}
	
	@PostConstruct
	void startConnectionConstruct() {
		log.info("Connection Start | Using @PostContruct");
	}
	
	@PreDestroy
	void endConnectionConstruct() {
		log.info("Connection End | Using @PreDestroy");
	}

}
