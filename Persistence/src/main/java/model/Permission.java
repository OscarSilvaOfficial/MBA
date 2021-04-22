package model;

import javax.persistence.*;

@Entity
@Table(name="permission")
public class Permission {

    public Permission(String name) {
        this.name = name;
    }

    public Permission() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne(mappedBy = "permission")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
