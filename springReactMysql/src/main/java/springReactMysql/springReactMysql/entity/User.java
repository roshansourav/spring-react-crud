package springReactMysql.springReactMysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS_TABLE")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String studentId;
    private String hostel;
    private int roomNumber;
    private String vehicleNumber;
    private String outTime;
    private String inTime;

}
