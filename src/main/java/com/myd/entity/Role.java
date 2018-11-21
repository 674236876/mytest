package com.myd.entity;

import java.util.List;

/**
 * $DESCIRPTION
 *
 * @author zgp
 * @create 2018 - 11 - 20 16:59
 */
public class Role extends BaseEntity{
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "users=" + users +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
