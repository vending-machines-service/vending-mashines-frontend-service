package telran.vending.frontend.dto;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString 
public class CurrentRecordDto{
	
	public String id;
	public LocalDate date;
	public int value;
	public int userId;

	public CurrentRecordDto(String id, LocalDate date, int value, int userId) {
		super();
		this.id = id;
		this.date = date;
		this.value = value;
		this.userId = userId;
	}
	
}
