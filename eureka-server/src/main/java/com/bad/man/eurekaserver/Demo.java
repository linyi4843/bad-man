package com.bad.man.eurekaserver;

import java.io.Serializable;

/**
 * Created with IDEA
 *
 * @author: linyi
 * @email: linyi4843@gmail.com
 */

public class Demo implements Serializable {

    private Integer id;

    private String name;

    private String address;

    public Demo() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Demo(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
