package Models;

import Utils.FakerGenerator;

public class CreateContatoModel {

    private String name;
    private String job;
    private FakerGenerator faker = new FakerGenerator();

    public  CreateContatoModel(){

        this.name = faker.getName();
        this.job = faker.getJob();
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

}