package com.example.recipe.calculator.operation;

import org.springframework.stereotype.Component;

import com.example.recipe.calculator.Operation;

@Component
public class Addition implements Operation {
	
	@Override
	public int apply(int lhs, int rhs) {
		return lhs + rhs;
	}
	
	@Override
	public boolean handles(char op) {
		return '+' == op;
	}
}
