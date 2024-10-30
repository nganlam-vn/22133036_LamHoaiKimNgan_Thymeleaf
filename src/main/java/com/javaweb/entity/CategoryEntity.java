package com.javaweb.entity;



import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="category")
public class CategoryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CategoryId")
	private Long id;

	@Column(name="categoryname", length = 50)
	@NotEmpty(message = "Khong duoc bo trong")
	private String name;

	@Column(name="images", length = 500)
	private String images;

	private int status;

	public Integer getCategoryId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCategoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		
	}


	
}
