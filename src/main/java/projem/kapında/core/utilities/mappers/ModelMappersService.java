package projem.kapında.core.utilities.mappers;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public interface ModelMappersService {
    ModelMapper forResponse();
    ModelMapper forRequest();

}
