package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.homeWorks.accuweather.weather.Weather;

import static io.restassured.RestAssured.given;

public class ForOneDaySaintPetersburgTest extends AccuweatherAbstractTest {

    @Test
    void forOneDaySaintPetersburg() {
        Weather response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/295212")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .body().as(Weather.class);

        Assertions.assertEquals(1, response.getDailyForecasts().size());
    }
}
