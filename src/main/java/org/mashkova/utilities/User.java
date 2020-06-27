package org.mashkova.utilities;

import java.math.BigDecimal;

public class User {

    private BigDecimal id;
    private String username;
    private String email;

    public User(BigDecimal id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("User{ id= %d, username= '%s', email = '%s' }", id.intValue(), username, email);
    }
}
