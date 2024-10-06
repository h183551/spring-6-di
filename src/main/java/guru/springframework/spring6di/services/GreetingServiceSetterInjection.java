package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

/**
 * Class GreetingServiceSetterInjection
 * <p>
 * Description: [Add class description here]
 * <p>
 * Created by hasan on 10/6/2024.
 */
@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hej I'm Setting a Greeting!!";
    }
}
