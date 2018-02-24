package com.example.demo.dao;

import com.example.demo.model.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class ScreenDaoImpl implements ScreenDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Screen> getAllScreens() {
        String query = "SELECT * FROM screen";
        return jdbcTemplate.query(query, (rs, rowNum) -> {
            Screen screen = new Screen();
            screen.setId(Integer.parseInt(rs.getString("id")));
            screen.setScreenTitle(rs.getString("screenTitle"));
            screen.setScreenData(rs.getString("screenData"));
            return screen;
        });
    }

    @Override
    public Screen getScreenById(Integer id) {
        String query = "SELECT * FROM screen WHERE id="+id;
        return jdbcTemplate.query(query, rs -> {
            Screen screen = new Screen();
            if(rs.next()){
                screen.setId(Integer.parseInt(rs.getString("id")));
                screen.setScreenTitle(rs.getString("screenTitle"));
                screen.setScreenData(rs.getString("screenData"));
            }
            return screen;

        });
    }

    @Transactional
    @Override
    public Screen updateScreenById(Screen screen) {
        String query = "UPDATE screen SET id=?, screenTitle=?, screenData=? WHERE id=?";
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, Integer.toString(screen.getId()));
            ps.setString(2, screen.getScreenTitle());
            ps.setString(3, screen.getScreenData());
            ps.setString(4, Integer.toString(screen.getId()));
            return ps;
        });
        return getScreenById(screen.getId());
    }
}
