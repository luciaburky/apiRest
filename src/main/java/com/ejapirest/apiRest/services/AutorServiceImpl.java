package com.ejapirest.apiRest.services;
import com.ejapirest.apiRest.entities.Autor;
import com.ejapirest.apiRest.repositories.AutorRepository;
import com.ejapirest.apiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}