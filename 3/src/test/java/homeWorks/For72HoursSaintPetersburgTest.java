package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class For72HoursSaintPetersburgTest extends AccuweatherAbstractTest {

    @Test
    void for72HoursSaintPetersburgNegative() {
        given()
                .queryParam("apikey", getApiKey())
                .pathParam("local", 295212)
                .when()
                .get(getBaseUrl() + "/forecasts/v1/hourly/72hour/{local}")
                .then()
                .statusCode(401);
    }
}
