
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
			System.out.println("Doðrulama baþarýsýz. ");
		}
		
		System.out.println("Kullanýcý eklendi :" +user.getFirstName() + " " + user.getLastName());
		
	}

	
	
	
	@Override
	public void update(User user) {
		
		boolean result=UserCheckService.CheckIfRealPerson(user);
		
		if(!result)
		{
			System.out.println("Doðrulama baþarýsýz");
		}
		
		System.out.println("Kullanýcý Güncellendi. "+ user.getFirstName() + " " + user.getLastName());
		
		
	}

	
	
	
	
	@Override
	public void delete(User user) {
	
		System.out.println("Kullanýcý silindi :" + user.getFirstName()+" "+user.getLastName());	
	}

}
