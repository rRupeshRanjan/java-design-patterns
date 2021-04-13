package creational;

import lombok.Data;

@Data
public class SingletonClass {
    private String name;
    private int id;

    private static SingletonClass singletonClass;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if(singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    @Override
    public SingletonClass clone() {
        return singletonClass;
    }
}
