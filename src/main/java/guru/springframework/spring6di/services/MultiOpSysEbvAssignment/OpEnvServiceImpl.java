package guru.springframework.spring6di.services.MultiOpSysEbvAssignment;

import org.springframework.stereotype.Service;

@Service
public class OpEnvServiceImpl implements OpEnvService {
    @Override
    public String sayOpSysName() {
        return "Undefined Operating System!!!";
    }
}
