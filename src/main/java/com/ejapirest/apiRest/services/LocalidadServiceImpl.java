package com.ejapirest.apiRest.services;
import com.ejapirest.apiRest.entities.Localidad;
import com.ejapirest.apiRest.repositories.BaseRepository;
import com.ejapirest.apiRest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
