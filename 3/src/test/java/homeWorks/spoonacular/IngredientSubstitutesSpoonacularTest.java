package homeWorks.spoonacular;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.homeWorks.spoonacular.IngredientSubstitutesDto;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class IngredientSubstitutesSpoonacularTest extends SpoonacularAbstractTest {

    @Test
    void getIngredientSubstitutes_whenValid_shouldReturn() {
        IngredientSubstitutesDto response = given()
                .queryParam("apiKey", getApiKey())
                .queryParam("ingredientName", "butter")
                .when()
                .get(getBaseUrl()+"food/ingredients/substitutes")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1900l))
                .extract()
                .response()
                .body()
                .as(IngredientSubstitutesDto.class);

        Assertions.assertEquals(response.getSubstitutes().size(),4);
        assertThat(response.getMessage(), containsString("Found 4 substitutes"));
        Assertions.assertEquals(response.getStatus(),"success");
        Assertions.assertEquals(response.getIngredient(),"butter");
    }
}
