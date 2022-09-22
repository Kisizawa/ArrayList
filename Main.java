package Mondai;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Hero h1,h2;
		h1=new Hero("斎藤");
		h2=new Hero("鈴木");
		h1.setKnockoutEnemy(3);
		h2.setKnockoutEnemy(7);
		//h2=h1;
		//h2.setName("斎藤");
		ArrayList<Hero> names=new ArrayList<Hero>();
		names.add(h1);
		names.add(h2);
		for(int i=0;i<names.size();i++) {
			System.out.println((i+1)+"人目の勇者:"+names.get(i));
			}
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i)+"が倒した敵の数="+names.get(i).getKnockoutEnemy());
		}
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i).hashCode());
		}
		if(h1.equals(h2)) {
			System.out.println("同じ勇者だ");
		}else {
			System.out.println("違う勇者だ");
		}
	}

}
