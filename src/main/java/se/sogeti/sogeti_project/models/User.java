package se.sogeti.sogeti_project.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String title;
    private int userLevel;
    private String userName;
    private String password;

    public User(int id, String firstName, String lastName, String email, String title, int userLevel, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.userLevel = userLevel;
        this.userName = userName;
        this.password = password;
    }

    public User(String firstName, String lastName, String email, String title, int userLevel, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.userLevel = userLevel;
        this.userName = userName;
        this.password = password;
    }

    public User() {


    }

    //@OneToMany(cascade = {CascadeType.ALL})
    //private List<Role> roles;



 /*   public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getUserLevel() == user.getUserLevel() && Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getTitle(), user.getTitle()) && Objects.equals(getUserName(), user.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getEmail(), getTitle(), getUserLevel(), getUserName());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", userLevel=" + userLevel +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
