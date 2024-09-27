package JavaKeywords;
public class FinalVariable {
    public static void main(String[] args) {
        final int SPEED_OF_LIGHT = 299792458;
        System.out.println("Speed of light: " + SPEED_OF_LIGHT);
        
        // Uncomment the line below to see the error
        // SPEED_OF_LIGHT = 300000000;
    }
}

