import models.StudentForm;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest extends TestBase {

    @BeforeMethod
    public void preconditions() {
        app.form().selectItemForms();
        app.form().selectPracticeForm();
        app.form().hideFooter();

    }

    @Test
    public void formTest() {
        StudentForm form = new StudentForm()
                .withfirstName("Kaya")
                .withlastName("Koen")
                .withemail("maya@gmail.com")
                .withgender("Female")
                .withphone("0501234567")
                .withbirthday("26 May 1983")
                .withsubject("Maths")
                .withhobbies("Sports")
                .withaddress("Tel Aviv, Herzl 21")
                .withstate("NCR")
                .withcity("Gurgaon");
        app.form().fillForm(form);
        app.form().selectPicture("C:/Users/Stebelev/Pictures/Subaru.jpg");
        app.form().savenewStudent();
        Assert.assertTrue(app.form().isDialogDispleyed());
        app.form().closeDialog();
        logger.info("Car was created");
    }
}