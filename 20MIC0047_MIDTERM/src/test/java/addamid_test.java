import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class addamid_test {
    @Test
    public void testGenerateResponseCorrectInput() {
        addamid_test service = new addamid_test();
        String response = service.generateResponse("ram", 3025);
        assertEquals("Correct Response", response);
    }
    
    private String generateResponse(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    public void testGenerateResponseIncorrectInput() {
        addamid_test service = new addamid_test();
        String response = service.generateResponse("john", 1234);
        assertEquals("Incorrect Response", response);
    }
}