package Utils;

public class EndPoints {

    protected static final String BASE_URI = FileOperation.getProperties("Environment").getProperty("baseUri");
    protected static final String PATH_USERS = FileOperation.getProperties("Environment").getProperty("users");
}
