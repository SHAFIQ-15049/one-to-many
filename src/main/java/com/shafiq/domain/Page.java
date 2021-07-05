package com.shafiq.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "pages")
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;
    private String content;
    private String chapter;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "book_id",nullable = false)
    private Book book;

}
