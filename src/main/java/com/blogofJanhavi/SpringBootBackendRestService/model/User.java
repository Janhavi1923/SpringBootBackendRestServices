package com.blogofJanhavi.SpringBootBackendRestService.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Getter@Setter
    private Long id;
    @Getter@Setter
    private String firstName, lastName;

    public static void main(String[] args) {
        User u=new User(1L,"JAnhavi","Srivastava");
        u.setFirstName("Saumya");
        System.out.println(u);
    }
}
