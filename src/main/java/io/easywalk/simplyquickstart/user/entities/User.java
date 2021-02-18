package io.easywalk.simplyquickstart.user.entities;

import io.easywalk.simply.specification.serviceable.annotations.SimplyEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
public class User implements SimplyEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id;
    @NonNull
    private String name;

    @NonNull
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
