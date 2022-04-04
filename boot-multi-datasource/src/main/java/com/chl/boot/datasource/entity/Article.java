package com.chl.boot.datasource.entity;


import com.chl.boot.orm.listener.DataBaseAuditListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/4/1 22:31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners({DataBaseAuditListener.class})
public class Article implements Serializable {
    @Serial
    private static final long serialVersionUID = -3317203987154803161L;

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    private String title;

    private String thumbnail;

    private String content;

    @Column(name = "create_time", updatable = false)
    private Date createTime;

    private Date updateTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
