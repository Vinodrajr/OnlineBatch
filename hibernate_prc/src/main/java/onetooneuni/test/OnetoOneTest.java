package onetooneuni.test;

import onetooneuni.dao.AadharDao;
import onetooneuni.dto.AadharCard;

public class OnetoOneTest {
	public static void main(String[] args) {
		AadharDao dao = new AadharDao();
		AadharCard aadharCard = dao.findAadharCard(173);
		System.out.println(aadharCard.getAid());
		System.out.println(aadharCard.getDob());
		System.out.println(aadharCard.getAddress());
		
	}

}
