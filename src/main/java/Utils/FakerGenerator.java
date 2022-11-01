package Utils;

import com.github.javafaker.Faker;
import com.github.javafaker.File;

import java.util.Locale;

public class FakerGenerator {

    private String job;
    private String firstName;


    private final Faker faker;

    public FakerGenerator() {
        faker = new Faker(new Locale("pt-BR"));
    }

    public String getName(){

        String name = faker.name().firstName();
        FileOperation.setProperties("UserData" , "name" , name);
        return name;
    }

    public String getJob(){

        String job = faker.job().title();
        FileOperation.setProperties("UserData" , "job" ,job);
        return job;
    }

    public int getNumberAvatar(){
        int numberAvatar = faker.random().nextInt(1,12);
        return numberAvatar;
    }
}
