package uk.co.aegon.aipdoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.aegon.aipdoc.dao.UserSettingsDaoImpl;
import uk.co.aegon.aipdoc.model.UserSettings;

@Service
public class UserSettingsServiceImpl implements UserSettingsService {

	@Autowired 
	UserSettingsDaoImpl userSettingsDaoImpl;
	
	@Override
	public String save(UserSettings userSettings) {
		return userSettingsDaoImpl.save(userSettings);
	}

	@Override
	public UserSettings get(String userId) {
		return userSettingsDaoImpl.get(userId);
	}

	@Override
	public List<UserSettings> list() {
		return userSettingsDaoImpl.list();
	}

	@Override
	public void update(String userId, UserSettings userSettings) {
		userSettingsDaoImpl.update(userId, userSettings);
	}

	@Override
	public void delete(String userId) {
		userSettingsDaoImpl.delete(userId);
	}

}
