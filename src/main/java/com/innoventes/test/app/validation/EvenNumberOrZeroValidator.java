package com.innoventes.test.app.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EvenNumberOrZeroValidator implements ConstraintValidator<EvenNumberOrZero, Number> {
	@Override
	public void initialize(EvenNumberOrZero constraintAnnotation) {
		// No initialization needed
	}

	@Override
	public boolean isValid(Number value, ConstraintValidatorContext context) {
		// Check if the value is null or zero or an even number
		return value == null || value.intValue() == 0 || value.intValue() % 2 == 0;
	}
}
