package com.cbl.cibreport.usermanagement.repository;

import com.cbl.cibreport.usermanagement.models.SecUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
@Service
public class UserRepository implements IUserRepository{
    @Autowired
    @Qualifier("firstDataSource")
    private DataSource firstDataSource;
    @Override
    public SecUser CheckUserLogin(String username, String password) {
        SecUser userdata = new SecUser();
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(firstDataSource).withProcedureName("sec_get_web_user");
        SqlParameterSource in = new MapSqlParameterSource().addValue("p_username", username).addValue("p_username",password);

        Map<String, Object> out = jdbcCall.execute(in);
        if (out.isEmpty())
           return userdata;
        else {
            List<Object> record = (List<Object>) out.get("P_RECORDSET");
            // System.out.println(out.get("P_RECORDSET"));
            //System.out.println(record.get(0));
            for (Object data : record) {
                Map<String, Object> d = (Map<String, Object>) data;
                userdata.setUser((String) d.get("username"));
                userdata.setEmployeeID((String) d.get("employeeId"));
                System.out.println(d.get("username"));
                System.out.println(d.get("employeeId"));

            }
            return userdata;
        }
    }
}
