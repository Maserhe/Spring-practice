package entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 1:26
 */
@Component
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    @Value("Maserhe")
    public void setName(String name) {
        this.name = name;
    }
}
