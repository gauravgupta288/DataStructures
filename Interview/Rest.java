package Interview;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class Rest {
    public static void main(String[] args) {
        getRequest();
    }
    static RequestSpecification requestSpecification;
    static ResponseSpecification responseSpecification;

    @BeforeClass
    public void setup(){
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("https://reqres.in/api/");
        builder.setContentType(ContentType.JSON);
        requestSpecification = builder.build();

        ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
        resBuilder.expectContentType("application/json");
        resBuilder.expectStatusCode(200);
        responseSpecification = resBuilder.build();
    }

    @Test
    static void getRequest(){
        baseURI = "";
        given()
                .spec(requestSpecification)
                .header("authorization", "")
                .contentType("Application/json")
                .when()
                .get("users?page=2")
                .then()
                .statusCode(200)
                .assertThat()
                .spec(responseSpecification)
                .body("page", equalTo(2))
                .header("Content-Type", "application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK")
                .log()
                .all();
    }

    @Test
    static void postRequest(){
        baseURI = "https://reqres.in/api/";

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        node.put("email" , "eve.holt@reqres.in");
        node.put("password" , "leader");

        HashMap<String, String> map = new HashMap<>();
        map.put("email" , "eve.holt@reqres.in");
        map.put("password" , "leader");

        String userId = given()
                .contentType("Application/json")
                .body(map)
                .when()
                .post("register")
                .then()
                .statusCode(200)
                .assertThat()
                .body("page", equalTo(null))
                .header("Content-Type", "application/json; charset=utf-8")
                //.statusLine("HTTP/1.1 201 Created")
                .log()
                .all()
                .extract()
                .path("token");

        System.out.println( "User created with user id : " + userId);
    }

    @Test
    static void getRequestExtractReponse() throws JsonProcessingException {
        baseURI = "https://reqres.in/api/";

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();

        node.put("email" , "eve.holt@reqres.in");
        node.put("password" , "leader");

        HashMap<String, String> map = new HashMap<>();
        map.put("email" , "eve.holt@reqres.in");
        map.put("password" , "leader");

        Response response = given()
                .contentType("Application/json")
                .body(map)
                .when()
                .get("users?page=2")
                .then()
                .statusCode(200)
                .assertThat()
                .body("page", equalTo(2))
                .header("Content-Type", "application/json; charset=utf-8")
                //.statusLine("HTTP/1.1 201 Created")
                .extract()
                .response();

        List<String> list = response.jsonPath().getList("data.id");

        System.out.println(list);
    }

    @Test
    static void verifyMulitpleValues() throws JsonProcessingException {
        baseURI = "https://reqres.in/api/";

        HashMap map = new HashMap<>();
        map.put("email" , "eve.holt@reqres.in");
        map.put("password" , "leader");
        map.put(32 , 2);

        given()
                .contentType("Application/json")
                .body(map)
                .when()
                .get("users?page=2")
                .then()
                .statusCode(200)
                .assertThat()
                .body("page", equalTo(2))
                .body("data.id", hasItems(8, 7))
                .header("Content-Type", "application/json; charset=utf-8")
                //.statusLine("HTTP/1.1 201 Created")
                .log()
                .all();

    }
}
