package kodlama.io.rentACar.entities.concretes;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
	private int id;
	private String name;
	
	
	
	
	
}
