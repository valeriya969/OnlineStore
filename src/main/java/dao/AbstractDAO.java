package dao;

import java.util.List;

public abstract class AbstractDAO<T,K> implements DAOStore{
    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object findEntityById(Object id) {
        return null;
    }

    @Override
    public boolean deleteFromId(Object id) {
        return false;
    }

    @Override
    public boolean deleteFromEntity(Object entity) {
        return false;
    }

    @Override
    public boolean create(Object entity) {
        return false;
    }

    @Override
    public Object update(Object entity) {
        return null;
    }
}
