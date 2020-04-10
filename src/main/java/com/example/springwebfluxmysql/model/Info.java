package com.example.springwebfluxmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("info")
@Data
public class Info {

    @Id
    private int id;
    private String name;
    private  String age;
}
