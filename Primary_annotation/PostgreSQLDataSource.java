package looseVStightCoupling.Primary_annotation;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource{
    @Override

    public  String[] getEmails(){
        String[] emails={"abc1","xyz1"};
        return  emails;
    }
}
