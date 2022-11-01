package ApiReqres.Post;

import Models.CreateContatoModel;
import TestBases.TestBase;
import Utils.FileOperation;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostCreateUser extends TestBase {

    private static final CreateContatoModel createContatoModel = new CreateContatoModel();

    @Test
    public void createUser(){

        Response response = given()
                                    .spec(requestSpec)
                                    .basePath(PATH_USERS)
                                    .body(createContatoModel)
                            .when()
                                    .post()
                            .then()
                                    .spec(responseSpec)
                                    .statusCode(201)
                                    .log().all()
                                    .extract().response();

        Assertions.assertEquals(FileOperation.getProperties("UserData").getProperty("name") , response.then().extract().path("name"));
        Assertions.assertEquals(FileOperation.getProperties("UserData").getProperty("job") , response.then().extract().path("job"));

    }
}
