/*
 * @(#)Main.java $version 2015. 1. 3.
 *
 * Copyright 2015 NHN Ent. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.study.main;

import com.study.service.Calculator;

/**
 * @author Kanghoon Choi
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(new Calculator().add(5, 10));
	}
}
