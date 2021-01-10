package entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-10 21:50
 */
public class People {

    @Autowired
    private Dog dog;

    @Autowired
    private Cat cat;


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
