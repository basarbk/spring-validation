package com.bafoly.validation.user;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

  Logger logger = LoggerFactory.getLogger(UniqueEmailValidator.class);

  @Autowired
  UserRepository userRepository;

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    logger.info("running isValid");
    return !userRepository.findByEmail(value).isPresent();
  }

}
