package com.bafoly.validation.error;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ApiError {

  int status;

  String message;

  long timestamp;

  String path;

  Map<String, String> validationErrors;

  public ApiError(int status, String message, String path) {
    super();
    this.timestamp = new Date().getTime();
    this.status = status;
    this.message = message;
    this.path = path;
  }
}
