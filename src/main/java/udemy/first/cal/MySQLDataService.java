package udemy.first.cal;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4,5};
    }
}
