package com.uu.a_proxy.cglib_proxy;

/**
 * @author liupenghao 切面类
 */
public class MyAspect {
	public void before() {
		System.out.println("鸡头");
	}

	public void after() {
		System.out.println("凤尾");
	}
}