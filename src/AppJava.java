import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppJava {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Student st = new Student();
		st.setName("Yaseen");
		st.setId(101);
		st.setCity("mumbai");
		System.out.println(s);
		Transaction tx = s.beginTransaction();
		s.save(st);
		//s.persist(st);
		tx.commit();
		s.close(); 
		
	}

}
