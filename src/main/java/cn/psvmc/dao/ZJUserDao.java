package cn.psvmc.dao;

import cn.psvmc.model.ZJUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.List;

/**
 * Created by zhangjian on 2016/12/20.
 */

@Transactional
public interface ZJUserDao extends CrudRepository<ZJUser, Integer> {
    public List<ZJUser> findAll();
    public List<ZJUser> findByName(String name);
}
