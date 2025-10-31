package web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false,
            length = 50)
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @Column(name = "surname", nullable = false,
            length = 50)
    @NotBlank
    @Size(min = 2, max = 50)
    private String surname;

    @Column(name = "age")
    @Min(value = 1)
    @Max(value = 120)
    private int age;

    @Column(name = "email", nullable = false,
            unique = true)
    @NotBlank
    @Size(min = 2, max = 50)
    private String email;

    public User() {
    }

    public User(String name, String surname,
                int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
