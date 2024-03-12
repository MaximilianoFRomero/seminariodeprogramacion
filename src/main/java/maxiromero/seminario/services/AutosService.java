package maxiromero.seminario.services;

import maxiromero.seminario.models.Autos;
import maxiromero.seminario.repositories.IAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutosService {
    private IAutosRepository autoRepo;

    @Autowired
    public AutosService(IAutosRepository autoRepo) {
        this.autoRepo = autoRepo;
    }

    public void crearAuto(Autos autos){
        autoRepo.save(autos);
    }
    public List<Autos> listarAutos(){
        return autoRepo.findAll();
    }
    public Optional<Autos> buscarPorId(Long id){
        return autoRepo.findById(id);
    }

    public void actualizarAuto(Autos auto){
        autoRepo.save(auto);
    }

    public void eliminarAutoPorId(Long id){
        autoRepo.deleteById(id);
    }

    public List<Autos> buscarPorMarca(String marca){
        return autoRepo.findByMarca(marca);
    }
    public List<Autos> buscarPorModelo(String modelo){
        return autoRepo.findByModelo(modelo);
    }
    public List<Autos> buscarPorColor(String color){
        return autoRepo.findByColor(color);
    }
    public List<Autos> buscarPorAnio(Long anio){
        return autoRepo.findByAnio(anio);
    }
}
