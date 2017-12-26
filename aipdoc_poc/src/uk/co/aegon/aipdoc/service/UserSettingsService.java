package uk.co.aegon.aipdoc.service;

import java.util.List;

import uk.co.aegon.aipdoc.model.UserSettings;

public interface UserSettingsService {
	String save(UserSettings userSettings);

	UserSettings get(String userId);

	List<UserSettings> list();

	void update(String userId, UserSettings userSettings);

	void delete(String userId);
}
