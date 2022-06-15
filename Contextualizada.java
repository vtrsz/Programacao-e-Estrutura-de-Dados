import java.util.HashSet;

public class Contextualizada {
    public static void main(String[] args){
        HashSet<String> elements = new HashSet<String>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            String str = Integer.toString(i);
            elements.add(str);
        }
        for (int i = 5000; i > 0; i--) {
            String str = Integer.toString(i);
            elements.remove(str);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Tempo total da duração: " + totalTime + "ms");
    }
}