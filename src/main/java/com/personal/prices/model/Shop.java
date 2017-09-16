package com.personal.prices.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document
@Data
@NoArgsConstructor
public class Shop {

    private String id;

    @NotNull
    private String name;

}
