package com.example.demo.entity;



import java.time.LocalDate;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data



@Entity
@Table(name="restaurant_sep_2022")
    



//class names are noun and singular
public class Restaurant {
@Id
@Column(name="restaurant_id",length=5)
int restaurantId;



@Column(name="restaurant_name",length=40)
String restaurantName;



@Column(name="location",length=40)
String location;



@Column(name="rating",precision=2,scale=2)
double rating;



@Column(name="opening_date")
LocalDate openingDate;




}