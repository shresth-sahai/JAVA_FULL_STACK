package looseVStightCoupling.Primary_annotation;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource {
    @Override
    public  String[] getEmails(){
        String[] emails={"abc","xyz"};
        return  emails;
    }

}
