package com.hjx.pojo;

import java.io.Serializable;
import java.util.Objects;

public class Good implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Good() {
        super();
    }

    public Good(int id,String userid){
        super();
        this.id=id;
        this.userid=userid;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Good)) return false;
        Good good = (Good) o;
        return getId() == good.getId() &&
                Objects.equals(getUserid(), good.getUserid());
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int result=1;
        result=prime*result+id;
        result=prime*result+((userid==null)?0:userid.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


}
