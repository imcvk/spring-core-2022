package spel.UseInSpringConfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String make;
    private int model;
    private Engine engine;
    private int horsePower;

}
