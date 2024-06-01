package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CitySearchLosAngelesTest extends AccuweatherAbstractTest {

    @Test
    void citySearchLosAngeles() {
        given()
                .queryParam("apikey", getApiKey())
                .queryParam("q", "Los Angeles")
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/search")
                .then()
                .statusCode(503);
    }
}
