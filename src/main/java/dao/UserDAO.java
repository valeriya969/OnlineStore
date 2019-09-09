package dao;

import java.util.List;

public class UserDAO extends AbstractDAO {
    @Override
    public List findAll() {
        return super.findAll();
    }

    @Override
    public Object findEntityById(Object id) {
        return super.findEntityById(id);
    }

    @Override
    public boolean deleteFromId(Object id) {
        return super.deleteFromId(id);
    }

    @Override
    public boolean deleteFromEntity(Object entity) {
        return super.deleteFromEntity(entity);
    }

    @Override
    public boolean create(Object entity) {
        return super.create(entity);
    }

    @Override
    public Object update(Object entity) {
        return super.update(entity);
    }
}
