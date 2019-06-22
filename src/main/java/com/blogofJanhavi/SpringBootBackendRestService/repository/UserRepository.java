package com.blogofJanhavi.SpringBootBackendRestService.repository;

import com.blogofJanhavi.SpringBootBackendRestService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
