package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;

public class CityNeighborsDhakaTest extends AccuweatherAbstractTest {

    @Test
    void cityNeighborsDhaka() {
                given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/133328")
                .then()
                .statusCode(200);
    }
}
