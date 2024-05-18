package com.devprobpptcamp.websiteapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Program {
    private String title;
    private String duration;
    private String image;
}
