package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class For72HoursPetrozavodskTest extends AccuweatherAbstractTest {

    @Test
    void for72HoursPetrozavodskNegative() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("local", 293141)
                .when()
                .get(getBaseUrl() + "/forecasts/v1/hourly/72hour/{local}")
                .then()
                .statusCode(401);
    }
}
