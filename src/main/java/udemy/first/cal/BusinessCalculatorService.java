package udemy.first.cal;


import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculatorService {

    private DataService dataService;

    public BusinessCalculatorService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findmax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
