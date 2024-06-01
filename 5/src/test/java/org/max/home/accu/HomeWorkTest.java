package org.max.home.accu;

import io.restassured.http.Method;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static io.restassured.RestAssured.given;


public class HomeWorkTest extends  AbstractTest{

    private static final Logger logger
            = LoggerFactory.getLogger(HomeWorkTest.class);
    public static final String FORECASTS1day = "/forecasts/v1/daily/1day";
    public static final String FORECASTS10day = "/forecasts/v1/daily/10day";

    @Test
    void testAccuweatherForecastOneDay() {
        logger.info("testAccuweatherForecastOneDay запущен!");

        stubFor(get(urlPathEqualTo(FORECASTS1day)).withHeader("Content-Type", containing("JSON"))
                .withQueryParam("i", containing("string"))
                .willReturn(aResponse().withStatus(200).withBody("Проверка!!!")));

        String responseBody = given().queryParam("i", "string123")
                .header("Content-Type", "JSONChecking")
                .when().request(Method.GET, getBaseUrl() + FORECASTS1day)
                .then().statusCode(200).extract().body().asString();

        Assertions.assertEquals("Проверка!!!", responseBody);

        logger.info("testAccuweatherForecastOneDay завершён!");

    }

    @Test
    void testAccuweatherForecastTenDays() {
        logger.info("testAccuweatherForecastTenDays запущен!");

        stubFor(get(urlPathEqualTo(FORECASTS10day)).withQueryParam("i", equalTo("string"))
                .withHeader("Accept", equalTo("text/xml"))
                .willReturn(aResponse().withStatus(200).withBody("Ошибка!!!")));

        String responseBody = given().queryParam("i", "string")
                .header("Accept", "text/xml")
                .when().get(getBaseUrl() + FORECASTS10day)
                .then().statusCode(200).extract().body().asString();

        Assertions.assertEquals("Ошибка!!!", responseBody);
        logger.info("testAccuweatherForecastTenDays завершён!");
    }

}