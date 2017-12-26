package uk.co.aegon.aipdoc.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import uk.co.aegon.aipdoc.model.UserSettings;

@Repository
public class UserSettingsDaoImpl implements UserSettingsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String save(UserSettings userSettings) {
		sessionFactory.getCurrentSession().save(userSettings);
		return userSettings.getUserId();
	}

	@Override
	public UserSettings get(String userId) {
		return sessionFactory.getCurrentSession().get(UserSettings.class, userId);
	}

	@Override
	public List<UserSettings> list() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<UserSettings> cq = cb.createQuery(UserSettings.class);
		Root<UserSettings> root = cq.from(UserSettings.class);
		cq.select(root);
		Query<UserSettings> qry = session.createQuery(cq);
		return qry.getResultList();
	}

	@Override
	public void update(String userId, UserSettings userSettings) {
		Session session = sessionFactory.getCurrentSession();
		UserSettings userSettings2 = session.byId(UserSettings.class).load(userId);
		userSettings2.setCreationDate(userSettings.getCreationDate());
		userSettings2.setEmailPreference(userSettings.getEmailPreference());
		userSettings2.setLastEmailSentDate(userSettings.getLastEmailSentDate());
		session.flush();
	}

	@Override
	public void delete(String userId) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(session.byId(UserSettings.class).load(userId));
	}

}
