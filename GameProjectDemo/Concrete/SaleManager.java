
public class SaleManager  implements SaleService{

	@Override
	public void sale(User user, Game game, Campaign campaign) {
		 double discountPrice=game.getGamePrice() - (game.getGamePrice()*campaign.getDiscount()/100);
		 
		 
		 System.out.println(user.getFirstName()+" "+user.getLastName()+" adlý kullanýcý "+
					game.getGameName()+" oyununu "+campaign.getCampaingName()+" kampanyasý ile %" + 
							campaign.getDiscount()+" indirim oraný ile " + discountPrice+" TL'ye satýn aldý.");
				}
		
	}

