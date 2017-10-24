package Cars;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component(value = "car")
@Scope(value = "prototype")
public class Car {

    @Value("${database.address}")
    private String dataBaseAddress;

    private Map<String, CarInterface> command;

    @Autowired
    public Car (Map<String,CarInterface> command){
        this.command = command;
    }
    public void buy() {
        CarInterface buyCar = command.get("Kupuj");
        buyCar.command();
    }
    public void buySecond() {
        CarInterface buySecond = command.get("Kupuj wiyncyj");
        buySecond.command();
    }
}
