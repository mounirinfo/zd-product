package com.zdshop.zdproduct.model;

import lombok.*;

@Builder
@Getter
public class Product {
    private String name;
    private String id;
    private String description;
}
