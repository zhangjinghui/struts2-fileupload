package com.zjh.intercepter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyIntercepter extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("before invoke action method");

		String result = arg0.invoke();

		System.out.println("after invoke action method");
		return result;
	}

}
