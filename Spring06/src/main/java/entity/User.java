package entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*等价于在 在xml中注册*/
@Component
public class User {

    @Value("Maserhe")
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

