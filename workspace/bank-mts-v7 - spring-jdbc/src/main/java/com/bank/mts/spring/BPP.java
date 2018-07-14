package com.bank.mts.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BPP implements BeanPostProcessor {

	private static Logger logger = Logger.getLogger("mts");

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		logger.info("BPP before init():" + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		logger.info("BPP after init():" + beanName);
		return bean;
	}

}
