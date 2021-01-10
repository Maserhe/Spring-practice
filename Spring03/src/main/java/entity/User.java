package entity;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-10 18:34
 */
public class User {
    private String name;
    private int pwd;

    public User(String name, int pwd) {
        this.name = name;
        this.pwd = pwd;
        System.out.println("这里是有参构造");
    }

    public User() {
        System.out.println("这里是无参构造！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
}
