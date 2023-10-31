public class addamid {
    public String generateResponse(String name, int id) {
        if ("ram".equalsIgnoreCase(name) && id == 3025) {
            return "Correct Response";
        } else {
            return "Incorrect Response";
        }
    }
}