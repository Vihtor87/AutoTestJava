package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.homeWorks.accuweather.weather.Weather;

import java.nio.channels.AcceptPendingException;

import static io.restassured.RestAssured.given;

public class For12HoursSaintPetersburgTest extends AccuweatherAbstractTest {

    @Test
    void for12HoursSaintPetersburg() {
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
