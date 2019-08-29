package com.nishant.blog.domain;

import lombok.Value;

@Value
public class Identity {

    private final Long number;

    public static Identity nothing() {
        return new Identity(Long.MIN_VALUE);
    }
}
