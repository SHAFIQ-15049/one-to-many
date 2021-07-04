package com.shafiq.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/*
Unidirectional one to many relationship
 */

@Data
@Entity
@Table(name = "post")
public class Post extends AuditModel{

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String title;

    @NotNull
    @Size(max = 200)
    private String description;

    @NotNull
    @Lob
    private String content;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "post")
    private Set<Reports> reports = new HashSet<>();
}
