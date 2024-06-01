package seminars;

import demo.lesson3.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.seminars.sem3.location.Location;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAutoLocationTest extends AccuweatherAbstractTest {

    @Test
    void checkAutoLocationTest() {
        List<Location> res = given()
                .queryParam("apikey", getApiKey())
                .queryParam("q", "St. Petersburg")
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/autocomplete")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", Location.class);
        Assertions.assertEquals(2, res.size());
    }
}
