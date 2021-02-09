package com.tts.validatingforminput;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//Here we create a class that backs the form used to create a person
public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}

/* The PersonForm class has two attributes: name and age. It is flagged with a few standard valid annotations:
        @Size(min=2, max=30) :Allows names between 2 and 30 characters long
        @NotNull :Does not allow a null value, which is what Spring MVC generates if the entry is empyt
        @Min(18) :Does not allow the age to be less than 18
   There are also getters and setters for name and age and a convenient toString() method.
 */