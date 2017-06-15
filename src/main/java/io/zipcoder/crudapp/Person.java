package io.zipcoder.crudapp;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by justinhaas on 6/15/17.
 */
 @Entity
 public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public Person(Integer id, String name){
        this.id = id;
        this.name = name;
    }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
}

