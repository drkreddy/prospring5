package com.radi.spring.springJPA;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "singer")
@NamedQueries(value = {
        @NamedQuery(name = Singer.FIND_ALL, query = "select s  from Singer  s"),
        @NamedQuery(name = Singer.FIND_BY_NAME, query = "select s  from Singer  s where s.firstName =:name")
})
@SqlResultSetMapping(
        name="singerResult",
        entities=@EntityResult(entityClass=Singer.class)
)
public class Singer implements Serializable {

    public static final String FIND_ALL = "Singer.findAll";
    public static final String FIND_BY_NAME = "Singer.findByName";


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    private Long id;

    public String getFirstName() {
        return firstName;
    }

    @Column
    private String firstName;
    @Column
    private String lastName;

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
