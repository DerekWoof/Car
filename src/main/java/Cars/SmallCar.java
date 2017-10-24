package Cars;

import org.springframework.stereotype.Service;

@Service(value = "smallCar")
public class SmallCar implements CarInterface {


    public void command() {
        System.out.println("Mało pali, mało mieści.");
    }
}
