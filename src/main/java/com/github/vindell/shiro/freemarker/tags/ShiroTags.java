package com.github.vindell.shiro.freemarker.tags;

import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleHash;

/**
 * Shortcut for injecting the tags into Freemarker
 *
 * <p>
 * Usage: cfg.setSharedVeriable("shiro", new ShiroTags());
 * </p>
 */
@SuppressWarnings("serial")
public class ShiroTags extends SimpleHash {
	
	@SuppressWarnings("deprecation")
	public ShiroTags(ObjectWrapper wrapper) {
		put("authenticated", new AuthenticatedTag());
		put("guest", new GuestTag());
		put("hasAnyPermissions", new HasAnyPermissionsTag());
		put("hasAnyRoles", new HasAnyRolesTag());
		put("hasPermission", new HasPermissionTag());
		put("hasRole", new HasRoleTag());
		put("lacksPermission", new LacksPermissionTag());
		put("lacksRole", new LacksRoleTag());
		put("notAuthenticated", new NotAuthenticatedTag());
		put("principal", new PrincipalTag());
		put("user", new UserTag());
	}
	
}