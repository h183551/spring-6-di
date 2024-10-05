package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Class GreetingServicePrimary
 * <p>
 * Description: [Add class description here]
 * <p>
 * Created by hasan on 10/6/2024.
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From Primary Service";
    }
}
