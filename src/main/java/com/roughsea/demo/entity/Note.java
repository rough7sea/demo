package com.roughsea.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Note {
    private final Long id;
    private String title;
    private String content;
}
