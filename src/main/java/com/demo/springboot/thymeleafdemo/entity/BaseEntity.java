package com.demo.springboot.thymeleafdemo.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "created_at",updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

}