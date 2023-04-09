package com.knoldus;

public class Person{

 private String name;
 private Integer age;
 public Person() {
 }

 public Person(String name, Integer age) {
  this.name = name;
  this.age = age;
 }

 public void setName(String name) {
  this.name = name;
 }
 public void setAge(Integer age) {
  this.age = age;
 }

 public String getName() {
  return name;
 }

 public Integer getAge() {
  return age;
 }

 //Adding  a new method to the Person class that returns a boolean indicating whether
 //the person is an adult (age >= 18).


 //fixing a bug in the Person class,that is, renaming isAdult method to is Adult or not .
 public Boolean isAdultOrNot() {
  if (this.age >= 18) return true;
  else return false;
 }

}
