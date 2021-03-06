package info.freeit.modifiers;

import info.freeit.usermodel.User;

public class ClassRoom {
	
	public User vasya;
	
	public static User petya;
	
	public final User katya;
	
	public static final User polina = new User();
	
	protected User roma;
	
	private static User alesya;
	
	private final User kirill;
	
	private static final User lusya = new User();

	public ClassRoom() {
		super();
		katya = new User();
		kirill = new User();
	}

	public User getVasya()
	{
		return vasya;
	}

	public void setVasya(User vasya)
	{
		this.vasya = vasya;
	}

	public static User getPetya()
	{
		return petya;
	}

	public static void setPetya(User petya)
	{
		ClassRoom.petya = petya;
	}

	public User getKatya()
	{
		return katya;
	}

	public static User getPolina()
	{
		return polina;
	}

	public User getRoma()
	{
		return roma;
	}

	public void setRoma(User roma)
	{
		this.roma = roma;
	}

	public static User getAlesya()
	{
		return alesya;
	}

	public static void setAlesya(User alesya)
	{
		ClassRoom.alesya = alesya;
	}

	public User getKirill()
	{
		return kirill;
	}

	public static User getLusya()
	{
		return lusya;
	}
}
