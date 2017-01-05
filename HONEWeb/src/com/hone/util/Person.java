package com.hone.util;

public class Person {
	  private String program;
	  private String function;
	  public Person() {
	    super();
	  }
	  public Person(String program, String function) {
	    super();
	    this.program = program;
	    this.function = function;
	  }
	  public String getProgram() {
	    return program;
	  }
	  public void setProgram(String program) {
	    this.program = program;
	  }
	  public String getFunction() {
	    return function;
	  }
	  public void setFunction(String function) {
	    this.function = function;
	  }
	}