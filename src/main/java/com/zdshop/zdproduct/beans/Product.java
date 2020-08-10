package com.zdshop.zdproduct.beans;

import lombok.*;

@Builder
@Getter
public class Product {
    private String name;
    private String id;
    private String description;
}
