package com.myd.entity;

import java.util.List;

/**
 * $DESCIRPTION
 *
 * @author zgp
 * @create 2018 - 11 - 20 16:59
 */
public class User extends BaseEntity{
    private String age;
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age='" + age + '\'' +
                ", roles=" + roles +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
