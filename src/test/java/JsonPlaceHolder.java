import com.student.model.Student;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class JsonPlaceHolder {

    @Test
    public void getUsers_Should_Filter_Users(){
        Response response = given()
                .baseUri("https://jsonplaceholder.typicode.com/")
                .basePath("posts")
                .queryParam("userId", 2)
                .when()
                .get( );

        System.out.println(response.body().asString());
        //System.out.println(response.body().prettyPrint());
        //System.out.println(response.prettyPrint()) ;
    }

    @Test
    public void verify_getUsers_returns_status_Ok(){
        given()
            .baseUri("https://jsonplaceholder.typicode.com/")
            .basePath("posts")
            .queryParam("userId", 2)
        .when()
            .get( )
        .then()
        .statusCode(200);
    }
}
