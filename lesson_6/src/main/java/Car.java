import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String brand;
    public static String model;
    private TataEngine engine;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TataEngine {
        private double capacity;
    }
}
