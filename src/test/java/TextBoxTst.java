import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTst {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
}
     @Test
       void FillFormTest(){
         open("https://demoqa.com/automation-practice-form");
          $("#firstName").setValue("Sem");
          $("#lastName").setValue("Dow");
          $("#userEmail").setValue("dow@wu.rt");
          $("#genterWrapper").$(byText("Male")).click();
          $("#userNumber").setValue("8002002020");
          $("#dateOfBirthInput").click();
          $(".react-datepicker__month-select").click();
          $(".react-datepicker__month-select").$(byText("March")).click();
          $(".react-datepicker__year-select").click();
          $(".react-datepicker__year-select").$(byText("2000")).click();
          $(".react-datepicker__day--022").click();
          $("#subjectsContainer").find("input").setValue("Arts").pressEnter();
          $("#hobbiesWrapper").$(byText("Music")).click();
          File file = new File("src\\test\\resources\\p002.jpg");
          $("#uploadPicture").uploadFile(file);
          $("#currentAddress").setValue("Street34");
          $("#state").click();
          $("#state").$(byText("NCR")).click();
          $("#city").click();
          $("#city").$(byText("Delhi")).click();
          $("#submit").click();















     }
}