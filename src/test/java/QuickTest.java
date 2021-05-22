import org.testng.annotations.Test;

public class QuickTest extends TestBase{
    @Test(groups ={"my","pay"})
    public void quickTest(){
        logger.info("Passed quick");

    }
}
