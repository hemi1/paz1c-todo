
package sk.upjs.ics.todo;
import org.springframework.jdbc.*;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class MySQLUlohaDao implements UlohaDao{

    public MySQLUlohaDao() {
    MysqlDateSource dateSource = new MysqlDateSource();
    dataSource.setUrl("jdbc:mysql://localhost/todo");
    dataSource.setUser("root");
    dataSource.setPassword("****");
    jdbcTemplate = new JdbcTemplate(dataSource);
    }

    
    @Override
    public void pridat(Uloha uloha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Uloha> dajVsetky() {
    String sql="SELECT * FROM uloha";
    BeanPropertyRowMapper<Uloha> mapper= BeanPropertyRowMapper.newInstance(Uloha.class);
    jdbcTemplate.query(sql,mapper);}
    
}
