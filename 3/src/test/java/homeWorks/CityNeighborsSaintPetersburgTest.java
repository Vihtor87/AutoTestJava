package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CityNeighborsSaintPetersburgTest extends AccuweatherAbstractTest {

    @Test
    void cityNeighborsSaintPetersburg() {
        given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/forecasts/v1/daily/1day/295212")
                .then()
                .statusCode(200);
    }
}
