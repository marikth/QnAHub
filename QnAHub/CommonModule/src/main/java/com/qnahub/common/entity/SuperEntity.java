package com.qnahub.common.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by markth on 4/13/2016.
 */
@MappedSuperclass
public class SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "UPDATE_VERSION")
    private int updateVersion;

    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

    @Column(name = "UPDATE_USER")
    private Long updateUser;

    public Long getId() {
        return id;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public int getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(int updateVersion) {
        this.updateVersion = updateVersion;
    }
}
