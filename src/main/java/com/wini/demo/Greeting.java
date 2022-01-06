package com.wini.demo;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
//@Getter
@Data
public class Greeting {
    private final long id;
    private final String content;
}
