package com.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.spring.beans.Account;

public class AccountPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		Account acc = (Account) bean;
		if(acc.getAccType()==null) {
			acc.setAccType("Savings");
		}
		return acc;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		Account acc =(Account) bean;
		String email = acc.getAccHolderEmail();
		if(!email.contains("@")) {
			acc.setAccHolderEmail(email+"@gmail.com");
		}
		String phoneNo = acc.getAccHolderMobileNumber()	;
		if(!phoneNo.contains("91-")) {
			acc.setAccHolderMobileNumber("91-"+phoneNo);
		}
		return acc;
	}

}
