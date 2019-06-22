package com.blogofJanhavi.SpringBootBackendRestService.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
public class User {

    @Getter@Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter@Setter
    private String firstName, lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*public static void main(String[] args) {
        User u=new User(1L,"JAnhavi","Srivastava");
        u.setFirstName("Saumya");
        System.out.println(u);
    }*/
}
