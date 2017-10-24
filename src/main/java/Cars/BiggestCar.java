package Cars;

import org.springframework.stereotype.Service;

@Service(value = "biggestCar")
public class BiggestCar implements CarInterface {


    public void command() {
        System.out.println("średnio pali, średnio mieści.");
    }
}