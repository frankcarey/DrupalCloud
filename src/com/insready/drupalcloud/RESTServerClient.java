package com.insready.drupalcloud;

public class RESTServerClient implements Client {

	@Override
	public int commentSave(String comment) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String commentLoadNodeComments(int nid, int count, int start) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String commentLoad(int cid) throws ServiceNotAvailableException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean flagFlag(String flagName, int contentId, int uid,
			boolean action, boolean skipPermissionCheck) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean flagIsFlagged(String flagName, int contentId, int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String nodeGet(int nid, String fields) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String userLogout(String sessionID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewsGet(String view_name, String display_id, String args,
			int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
