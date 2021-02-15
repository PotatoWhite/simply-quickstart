package io.easywalk.simplyquickstart.user.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id;
    private String name;

    @Column(unique = true)
    private String email;

    @ElementCollection
    @CollectionTable(
            name = "contacts",
            joinColumns = @JoinColumn(name = "user_id")
    )
    private List<Contact> contacts;

    private LocalDateTime createdDate;

    @PrePersist
    private void init() {
        createdDate = LocalDateTime.now();
    }
}
