package uk.co.aegon.aipdoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import uk.co.aegon.aipdoc.model.UserSettings;
import uk.co.aegon.aipdoc.service.UserSettingsService;

@Controller
public class UserSettingsController {

	@Autowired
	UserSettingsService userSettingsService;

	/*---Add new book---*/
	@PostMapping("/usersettings")
	public ResponseEntity<?> save(@RequestBody UserSettings userSettings) {
		String id = userSettingsService.save(userSettings);
		return ResponseEntity.ok().body("New User Settings saved with user ID: " + id);
	}

	/*---Get a book by id---*/
	@GetMapping("/usersettings/{userId}")
	public ResponseEntity<UserSettings> get(@PathVariable("userId") String userId) {
		UserSettings userSettings = userSettingsService.get(userId);
		return ResponseEntity.ok().body(userSettings);
	}

	/*---get all books---*/
	@GetMapping("/usersettings")
	public ResponseEntity<List<UserSettings>> list() {
		List<UserSettings> userSettings = userSettingsService.list();
		return ResponseEntity.ok().body(userSettings);
	}

	/*---update a book by id---*/
	@PutMapping("/usersettings/{userId}")
	public ResponseEntity<?> update(@PathVariable("userId") String userId, @RequestBody UserSettings userSettings) {
		userSettingsService.update(userId, userSettings);
		return ResponseEntity.ok().body("User settings has been updated successfully");
	}

	/*----delete a book by id---*/
	@DeleteMapping("/usersettings/{userId}")
	public ResponseEntity<?> delete(@PathVariable("userId") String userId) {
		userSettingsService.delete(userId);
		return ResponseEntity.ok().body("User settings has been deleted successfully");
	}
}
