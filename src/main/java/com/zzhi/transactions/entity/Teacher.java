package com.zzhi.transactions.entity;

public class Teacher {
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 班级表主键
     */
    private String Id;

    /**
     * 班级名称
     */
    private String name;
}