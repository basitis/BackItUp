package com.bhavin.backitmap;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupManager;
import android.app.backup.FileBackupHelper;

public class TheBackupAgent extends BackupAgentHelper {

	static final String HIGH_SCORES_FILENAME = "scores";

	// A key to uniquely identify the set of backup data
	static final String FILES_BACKUP_KEY = "myfiles";

	@Override
	public void onCreate() {
		FileBackupHelper helper = new FileBackupHelper(this,
				"assets/test.txt");
		addHelper(FILES_BACKUP_KEY, helper);
	}

	public void requestBackup()
	{
		BackupManager bm = new BackupManager(this);
		bm.dataChanged();
	}
}
