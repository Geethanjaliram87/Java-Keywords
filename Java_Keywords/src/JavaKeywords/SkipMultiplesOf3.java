package JavaKeywords;
public class SkipMultiplesOf3 {
    public static void main(String[] args) {
    	    System.out.println("Numbers between 1-20, excluding multiples of 3");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) continue;
          
            System.out.println(+i);
        }
    }
}
