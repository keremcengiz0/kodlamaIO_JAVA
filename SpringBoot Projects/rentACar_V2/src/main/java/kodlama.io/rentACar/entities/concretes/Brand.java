package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")		
// @Data     					// değişkenlerin getter setter gibi metodlarını otomatik oluşturur. Ayrıca parametresiz constructor olusturur.
@Getter
@Setter							// @Data = @Getter + @Setter + @NoArgsConstructor
@AllArgsConstructor				// parametreli constructor olusturur. 
@NoArgsConstructor				// parametresiz constructor olusturur.
@Entity							// ctrl + shift + o ==> kullanılmayan importları kaldırır.
public class Brand {
	
	@Id 																// db'de primary key oldugunu belirtir.
	@GeneratedValue(strategy = GenerationType.IDENTITY)					// id'sini otomatik 1'er arttırır.
	@Column(name="id")  												// db'de id kolonuna karşılık gelecek.
	private int id;
	
	@Column(name="name")												// db'de name kolonuna karşılık gelecek.
	private String name;	
	
	
	
	
}
