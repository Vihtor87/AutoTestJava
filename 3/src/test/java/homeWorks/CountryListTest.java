package homeWorks;

import homeWorks.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.homeWorks.accuweather.location.AdministrativeArea;
import org.max.homeWorks.accuweather.location.Local;


import java.util.List;

import static io.restassured.RestAssured.given;

public class CountryListTest extends AccuweatherAbstractTest {

    @Test
    void countryList() {
        List<Local> response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/locations/v1/countries/")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", Local.class);

        Assertions.assertEquals(250, response.size());
    }
}
