import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		User user1=new User(1,"kader","Tekin", new Date(1999,6,24),"1126011260");
		
		Game game1=new Game(1,"kad", 60);
		Campaign campaign1=new Campaign(1,"Sezon indirimi ",20);
		
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		
		GameManager gameManager=new GameManager();
		
		CampaignManager campaignManager=new CampaignManager();
		
		SaleManager saleManager=new SaleManager();
		
		userManager.add(user1);
		gameManager.add(game1);
		campaignManager.add(campaign1);
		saleManager.sale(user1, game1, campaign1);
	}

}
