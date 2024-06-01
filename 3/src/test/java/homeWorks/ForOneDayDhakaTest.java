package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.homeWorks.accuweather.weather.Weather;


import static io.restassured.RestAssured.given;

public class ForOneDayDhakaTest extends AccuweatherAbstractTest {

    @Test
    void forOneDayDhaka() {
        Weather response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/28143")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(2000l))
                .extract()
                .response()
                .body().as(Weather.class);

        Assertions.assertEquals(1, response.getDailyForecasts().size());
    }
}
