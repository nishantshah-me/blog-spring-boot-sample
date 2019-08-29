package com.nishant.blog.domain;

import lombok.Value;

import java.time.Instant;
import java.util.List;

@Value
public class Author {
    private final Identity id;
    private final Status status;
    private String name;
    private String email;
    private String avatar;
    private boolean gender;

    private List<Post> posts;

    private boolean active;
    private boolean isDeleted;
    private final Instant createdAt;
    private final Instant updatedAt;
}
