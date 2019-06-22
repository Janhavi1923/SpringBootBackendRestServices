package com.blogofJanhavi.SpringBootBackendRestService.service;

import com.blogofJanhavi.SpringBootBackendRestService.model.User;
import com.blogofJanhavi.SpringBootBackendRestService.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j  // to solve login labels

public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> findAllUsers(){
        List<User> user=userRepository.findAll();
        return user;
        //return null;
    }

    public User getUserById(Long id){
        Optional<User> userOptional =userRepository.findById(id); //optional is an abstract that tells whether the id is really present or not

                //log.debug("User with id : {} is {}"+ id,userOptional.get());
                //return userOptional.get();
            if(userOptional.isPresent()) {
                log.debug("User with id{} is {}", id, userOptional.get());
            }else{
                throw new IllegalIdentifierException("id :"+ id);
            }
            return userOptional.get();
        /*if(userRepository.existsById(id))
            return userRepository.getOne(id);
        return null;*/
    }
    public User createUser(User user){
        userRepository.save(user);
        return user;
        //return null;
    }
    public User updateUser(User user){
        userRepository.save(user);
        return user;

        /*if(userRepository.existsById(user.getId())){
            userRepository.save(user);
        }
        return null;
*/    }
    public User deleteUser(Long id){
        User user = getUserById(id);
        userRepository.deleteById(id);
        return user;
        /*if(userRepository.existsById(id)){

         User user = getUserById(id);
        userRepository.deleteById(id);
        return user;
        }
        return null;*/
    }
}
