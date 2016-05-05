package com.qnahub.data_module.auth.entity;

import com.qnahub.common.entity.SuperEntity;

import javax.persistence.*;

/**
 * Created by markth on 4/13/2016.
 */
@Entity
@Table(name = "USER")
public class User extends SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
