package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

/**
 * Class GreetingServicePropertyInjected
 * <p>
 * Description: [Add class description here]
 * <p>
 * Created by hasan on 10/6/2024.
 */
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!";
    }
}
