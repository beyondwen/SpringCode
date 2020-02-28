package org.wenhao.v1.enity;

public class UserEnity {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEnity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public UserEnity(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
