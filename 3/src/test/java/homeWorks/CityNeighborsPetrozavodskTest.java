package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CityNeighborsPetrozavodskTest extends AccuweatherAbstractTest {

    @Test
    void cityNeighborsPetrozavodsk() {
        given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/293141")
                .then()
                .statusCode(200);
    }
}
