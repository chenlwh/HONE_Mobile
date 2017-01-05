package com.hone.util;

public class Person {
	  private String arg1;
	  private String arg2;
	  public Person() {
	    super();
	  }
	  public Person(String program, String function) {
	    super();
	    this.arg1 = program;
	    this.arg2 = function;
	  }
	  public String getProgram() {
	    return arg1;
	  }
	  public void setProgram(String program) {
	    this.arg1 = program;
	  }
	  public String getFunction() {
	    return arg2;
	  }
	  public void setFunction(String function) {
	    this.arg2 = function;
	  }
	}