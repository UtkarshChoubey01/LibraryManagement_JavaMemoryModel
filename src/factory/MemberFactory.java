package factory;

import java.util.ArrayList;
import java.util.List;

import member.Member;

public class MemberFactory {

	public static List<Member> createMembers(){
	
		List<Member> members = new ArrayList<Member>();
		members.add(new Member("Utkarsh Choubey","MemIni0001"));
		members.add(new Member("Priyanka Ahirwar","MemIni0002"));
		members.add(new Member("Megha Ahirwar","MemIni0003"));
		members.add(new Member("Chandu Ahirwar","MemIni0004"));
		members.add(new Member("N.K. Choubey","MemIni0005"));
		members.add(new Member("Shikha Choubey","MemIni0006"));
		members.add(new Member("Pushpa Choubey","MemIni0007"));
		
	
		return members;	
	}
}
