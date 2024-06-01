package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;

public class For72HoursDhakaTest extends AccuweatherAbstractTest {

    @Test
    void for72HoursDhakaNegative() {
        given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/hourly/72hour/28143")
                .then()
                .statusCode(401);
    }
}
