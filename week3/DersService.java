package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DersService {
	
	@Autowired
	private DersRepository repo;
	
	public List<Ders> listAll(){
		return repo.findAll();
	}
	
	public void save(Ders ders) {
		repo.save(ders);
	}
	
	public Ders get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
}
