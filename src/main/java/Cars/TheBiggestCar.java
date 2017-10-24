package Cars;

import org.springframework.stereotype.Service;

@Service(value = "theBiggestCar")
public class TheBiggestCar implements CarInterface {


    public void command() {
        System.out.println("Dużo pali. Dużo mieści");
    }
}
