package com.wini.demo;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Greeting {
    private final long id;
    private final String content;
}
