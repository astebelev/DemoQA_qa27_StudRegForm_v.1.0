package application;

import models.StudentForm;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperForm extends HelperBase {
    public HelperForm(WebDriver wd) {
        super(wd);
    }

    public void selectItemForms() {
        click(By.xpath("//div[@class='category-cards']/div[2]"));
        pause(500);
    }

    public void selectPracticeForm() {
        click(By.xpath("//span[.='Practice Form']"));
    }

    public void fillForm(StudentForm form) {
        type(By.id("firstName"), form.getFirstName());
        type(By.id("lastName"), form.getLastName());
        type(By.id("userEmail"), form.getEmail());
        selectGender(form.getGender());
        type(By.id("userNumber"), form.getPhone());
        typeBDay(form.getBirthday());
        selectHobbies(form.getHobbies());
        type(By.id("currentAddress"), form.getAddress());


    }
    public void submitForm(){
        click(By.xpath("//button[.='Submit']"));

    }

    private void selectHobbies(String hobbies) {
        if (hobbies.equals("Sports")){
            click(By.xpath("//label[@for='hobbies-checkbox-1']"));
        }else if (hobbies.equals("Reading")){
            click(By.xpath("//label[@for='hobbies-checkbox-2']"));
        }else {
            click(By.xpath("//label[@for='hobbies-checkbox-3']"));
        }
    }

    private void typeBDay(String birthday) {
        WebElement bday = wd.findElement(By.id("dateOfBirthInput"));
        bday.click();
        // click(By.id("dateOfBirthInput"));
        String os = System.getProperty("os.name");
        System.out.println(os);
        if (os.startsWith("Mac")) {
            bday.sendKeys(Keys.chord(Keys.COMMAND, "a"));

        } else {
            bday.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        }
        bday.sendKeys(birthday);
        bday.sendKeys(Keys.ENTER);
    }

    private void selectGender(String gender) {
        if (gender.equals("Male")) {
            click(By.xpath("//label[@for='gender-radio-1']"));
        } else if (gender.equals("Female")) {
            click(By.xpath("//label[@for='gender-radio-2']"));
        } else {
            click(By.xpath("//label[@for='gender-radio-3']"));
        }
    }
    public void selectPicture(String link){
        wd.findElement(By.id("uploadPicture")).sendKeys(link);

    }


}