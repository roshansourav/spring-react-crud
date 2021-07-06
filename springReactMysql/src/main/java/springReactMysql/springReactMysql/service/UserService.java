package springReactMysql.springReactMysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springReactMysql.springReactMysql.entity.User;
import springReactMysql.springReactMysql.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }//for post single user

    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }//for post multiple users

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    } //to get a single user by id

    public List<User> getUsers(){
        return repository.findAll();
    }//to get all users

    public User getUserByStudentId(String studentId){
        return repository.findByStudentId(studentId);
    }//to get user by student ID

    public String deleteUser(int id){
        repository.deleteById(id);
        return "User Deleted Successfully !!" + id;
    }//to delete user by id

    public User updateUser(User user){
        User existingUser=repository.findById(user.getId()).orElse(null);
        existingUser.setStudentId(user.getStudentId());
        existingUser.setHostel(user.getHostel());
        existingUser.setRoomNumber(user.getRoomNumber());
        existingUser.setVehicleNumber(user.getVehicleNumber());
        existingUser.setOutTime(user.getOutTime());
        existingUser.setInTime(user.getInTime());
        return repository.save(existingUser);
    }



}
