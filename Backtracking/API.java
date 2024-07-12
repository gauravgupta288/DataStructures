package Backtracking;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class API{

    @Test(enabled = false)
    public  void GetRequest(){
        baseURI = "https://reqres.in/api/";

        String payload = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";
        Response response = given()
                            .body(payload)
                                .when()
                                .get("/register")
                                .then()
                                .statusCode(200)
//                                .body("page", equalTo(2))
//                                .body("total", greaterThan(0))
//                                .body("page", equalTo(2))
//                                 .body("data[1].id", equalTo(8))
                                .extract()
                                .response();

        System.out.println(response);

        List<Map<String, String>> map = response.path("data");

        System.out.println(map);
    }

    @Test(enabled = false)
    public void testBookingDotCom(){
        baseURI = "https://booking-com.p.rapidapi.com";

       Response res = given()
                .header("x-rapidapi-key", "2e4ea804a6msh876e8d7cbc02136p1ae322jsnce088a076e3c")
                .header("x-rapidapi-host", "booking-com.p.rapidapi.com")
               .queryParam("hotel_id", "1377072")
               .queryParam("locale", "en-gb")
                .when()
                .get("/v1/hotels/data")
                .then()
                .extract().response();

        System.out.println(res.asString());
    }

    @Test
    public void testJackson() throws JsonProcessingException {
        baseURI = "https://booking-com.p.rapidapi.com";

        Response res = given()
                .header("x-rapidapi-key", "2e4ea804a6msh876e8d7cbc02136p1ae322jsnce088a076e3c")
                .header("x-rapidapi-host", "booking-com.p.rapidapi.com")
                .queryParam("hotel_id", "1377072")
                .queryParam("locale", "en-gb")
                .when()
                .get("/v1/hotels/data")
                .then()
                .extract().response();

        Response res1 = given()
                .header("x-rapidapi-key", "2e4ea804a6msh876e8d7cbc02136p1ae322jsnce088a076e3c")
                .header("x-rapidapi-host", "booking-com.p.rapidapi.com")
                .queryParam("hotel_id", "1377073")
                .queryParam("locale", "en-gb")
                .when()
                .get("/v1/hotels/data")
                .then()
                .extract().response();

        System.out.println(res.asString());
        System.out.println(res1.asString());

        ObjectMapper mapper = new ObjectMapper();

        JsonNode json = mapper.readTree(res.asString());
        JsonNode json1 = mapper.readTree(res1.asString());

        System.out.println(json.equals(json1));

    }

    @Test
    public void findEven(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> ans =list
                            .stream()
                            .filter(e -> e % 2 == 0)
                .skip(1)
                .limit(1)
                            .collect(Collectors.toList());

        System.out.println(ans);
    }

    @Test
    public void findSecondLargest(){
        List<Integer> list = Arrays.asList(1,2,3,5,4,5);

        list
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
    }

    @Test
    public void compare(){

        List<String> list = Arrays.asList("dog", "cat", "cow", "rat");


       boolean l = list
                .stream()
                .anyMatch(ani -> ani.equals("cat"));

        System.out.println(l);
    }

    @Test
    public void findAny(){

        List<String> list = Arrays.asList("dog", "cat", "cow", "rat", "cc", "cdf");


        Optional<String> s = list
                .stream()
                .filter(k -> k.startsWith("c"))
                .findAny();

        System.out.println(s.get());

        Function<Integer, Integer> sq = (num) -> num * num;

        System.out.println(sq.apply(10));

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(10, 20));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

        System.out.println(comparator.compare(200, 20));

        Predicate<Integer> predicate = (a) -> a % 2 == 0;

        System.out.println(predicate.test(10));

        Comparator<Integer> comp = Comparator.naturalOrder();

        List<Integer> list1 = Arrays.asList(1,3,2,5,4);

        Collections.sort( list1, comp);

        System.out.println(list1);
    }

    @Test
    public void test(){
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s4 == s3);
    }


}
