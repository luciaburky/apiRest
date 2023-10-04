package com.ejapirest.apiRest.services;
import com.ejapirest.apiRest.entities.BaseEntity;
import com.ejapirest.apiRest.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public abstract class BaseServiceImpl<E extends BaseEntity, Id extends Serializable> implements BaseService<E, Id> {
    protected BaseRepository<E, Id> baseRepository;
    public BaseServiceImpl(BaseRepository<E, Id> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional // son transacciones con la BD
    public List<E> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findbyId(Id id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
            // obtiene una entidad si la encuentra, y sino larga excepcion
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(Id id, E entityConCambio) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityVieja = entityOptional.get();
            entityVieja = baseRepository.save(entityConCambio);
            return entityVieja;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Id id) throws Exception {
        try {
            if(baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
