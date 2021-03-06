package simple.project.giis.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import simple.project.giis.model.entity.Permission;

/**
 * @author Simple
 * @date on 2019/1/3 15:40
 */
public interface PermissionDao extends JpaRepository<Permission, Integer> {

}
