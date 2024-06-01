package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CitySearchOsloTest extends AccuweatherAbstractTest {
    @Test
    void citySearchOslo() {
        given()
                .queryParam("apikey", getApiKey())
                .queryParam("q", "Oslo")
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/search")
                .then()
                .statusCode(503);
    }
}
