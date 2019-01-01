package telran.vending.frontend.userservice;

import telran.vending.frontend.dto.OperationStatusEnum;
import telran.vending.frontend.dto.UserDto;

public interface IUsers {
	
	public OperationStatusEnum addUser(UserDto user);
	public UserDto getUser(int userId);
	public OperationStatusEnum updateUser(UserDto user);
	public OperationStatusEnum removeUser(int userId);
	
}
