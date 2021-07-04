package com.shafiq.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "reports")
public class Reports extends AuditModel{


    @NotNull
    @Lob
    private String text;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "post_id",nullable = false)
    private Post post;
}
