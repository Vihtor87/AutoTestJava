package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.max.homeWorks.accuweather.location.Local;



import java.util.List;

import static io.restassured.RestAssured.given;

public class TopCitiesList100Test extends AccuweatherAbstractTest {

    @Test
    @Disabled
    void topCitiesList100() {
        List<Local> response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/locations/v1/topcities/100")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", Local.class);

        Assertions.assertEquals(100, response.size());
    }
}
