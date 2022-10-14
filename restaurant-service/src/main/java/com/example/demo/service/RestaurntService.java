package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Restaurant;
import com.example.demo.ifaces.RestaurantRepository;

import lombok.AllArgsConstructor;
import net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional;

@Service
@AllArgsConstructor
public class RestaurntService {
	private RestaurantRepository repo;
	public  Restaurant add(Restaurant entity) {
		return this.repo.save(entity);
	}
	public List<Restaurant> findAll(){
		return this.repo.findAll();
	}
	public Restaurant findById(int id) {
		String message="Element With"+id+"Not Found";
		return this.repo.findById(id).orElseThrow(()->new RuntimeException(message));
	}
	public List<Restaurant> findByName(String name) {
		//String message="Element With"+id+"Not Found";
		return this.repo.findByRestaurantName(name);
	}
	public List<Restaurant> fetchUsingLocation(String location) {
		return this.repo.fetchUsingLocation(location);
	}
	public List<Restaurant> fetchUsingRating(double rating) {
		return this.repo.fetchUsingRating(rating);
	}
	public Restaurant update(Restaurant entity) {
		return this.repo.save(entity);
		
	}
public int updateRating(int i, double d) {
        
        return this.repo.updateRating(i, d);
    }



//   public List<Restaurant> fetchUsingRating(double dou) {
//        // TODO Auto-generated method stub
//        return this.repo.fetchUsingRating(dou);
//    }
	
	public Restaurant remove(int id) {
//		boolean isPresent=this.repo.existsById(id);
		Restaurant obj=findById(id);
		this.repo.deleteById(id);
		return obj;
	}
}     
