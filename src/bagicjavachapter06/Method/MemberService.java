package bagicjavachapter06.Method;

public class MemberService {
	String id;
	String password;

	public void logout(String id) {
		this.id = id;
		System.out.println("로그아웃 되었습니다.");
	}

	public boolean login(String id, String password) {
		this.id = id;
		this.password = password;

		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}

	}
}
