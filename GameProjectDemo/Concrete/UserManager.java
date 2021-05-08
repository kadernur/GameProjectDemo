
public class UserManager implements UserService {

	private UserCheckService UserCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		
		UserCheckService = userCheckService;
	}
	
	

	@Override
	public void add(User user) {
	
		boolean result=UserCheckService.CheckIfRealPerson(user);
		
		if(!result)
		{
			System.out.println("Do�rulama ba�ar�s�z. ");
		}
		
		System.out.println("Kullan�c� eklendi :" +user.getFirstName() + " " + user.getLastName());
		
	}

	
	
	
	@Override
	public void update(User user) {
		
		boolean result=UserCheckService.CheckIfRealPerson(user);
		
		if(!result)
		{
			System.out.println("Do�rulama ba�ar�s�z");
		}
		
		System.out.println("Kullan�c� G�ncellendi. "+ user.getFirstName() + " " + user.getLastName());
		
		
	}

	
	
	
	
	@Override
	public void delete(User user) {
	
		System.out.println("Kullan�c� silindi :" + user.getFirstName()+" "+user.getLastName());	
	}

}
