package io.github.blackture.ACMCE;

import ACMItems;

public class ACMCE extends JavaPlugin implements ACMCE {

		@Override
	public void onEnable() {
		// ...

	}

	

	@Override
	public void onDisable() {
		// Logic for disabling the plugin...

	}

	

	@Override

	public JavaPlugin getJavaPlugin() {
		// This is a method that links your SlimefunAddon to your Plugin.
		// Just return "this" in this case, so they are linked
		return this;

	}

	

	@Override
	public String getBugTrackerURL() {
		// Here you can return a link to your Bug Tracker.
		// This link will be displayed to Server Owners if there is an issue
		// with this Addon. Return null if you have no bug tracker.
		// Normally you can just use GitHub's Issues tab:
		// https://github.com/YOURNAME/YOURPROJECT/issues
		return null;
	}

}
