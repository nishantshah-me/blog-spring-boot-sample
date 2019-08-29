package com.nishant.blog.domain;

import lombok.Value;

import java.time.Instant;

@Value
public class Post {

    private final Identity id;
    private final Status status;
    private String name;
    private String email;

    private boolean active;
    private boolean isDeleted;
    private final Instant createdAt;
    private final Instant updatedAt;
}
