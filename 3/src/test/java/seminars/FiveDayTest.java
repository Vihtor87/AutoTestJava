package seminars;

import demo.lesson3.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.seminars.sem3.weather.Weather;

import static io.restassured.RestAssured.*;

public class FiveDayTest extends AccuweatherAbstractTest {

    @Test
    void checkFiveDayTest() {
        Weather weather = given()
                .queryParam("apikey", getApiKey())
                .pathParam("location", 178087)
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/5day/{location}")
                .then()
                .statusCode(200)
                .extract()
                .body().as(Weather.class);

        Assertions.assertEquals(5, weather.getDailyForecasts().size());
    }
}
