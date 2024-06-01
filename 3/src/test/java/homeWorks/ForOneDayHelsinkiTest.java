package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.homeWorks.accuweather.weather.Weather;

import static io.restassured.RestAssured.given;

public class ForOneDayHelsinkiTest extends AccuweatherAbstractTest {

    @Test
    void forOneDayHelsinki() {
        Weather response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/133328")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .body().as(Weather.class);

        Assertions.assertEquals(1, response.getDailyForecasts().size());
    }
}
