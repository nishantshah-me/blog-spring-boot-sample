package com.nishant.blog.data.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nishant.blog.domain.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(exclude = "postData")
public class AuthorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String avatar;
    private boolean gender;
    private boolean active;
    private boolean isDeleted;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @OneToMany(mappedBy = "authorData", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnoreProperties("authorData")
    private List<PostData> postData = new ArrayList<>();

}
