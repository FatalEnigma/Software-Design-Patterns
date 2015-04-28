package lab12_mediator;

import lab12_mediator.BtnEdit;

class Mediator {
	private BtnEdit btnEdit;
	private BtnBrowse btnBrowse;
	private BtnSearch btnSearch;
	private ChkLock chkLock;
	private LblDisplay lblDisplay;
	
	
//---------------------------------------------------------------------------------------------------------------------
   // 2. register methods to set references to each concrete object to be mediated i.e. instantiate all of above
    public void registerEditButton(BtnEdit btnEdit) {
        this.btnEdit = btnEdit;
    }
 
    public void registerBrowseButton(BtnBrowse btnBrowse) {
    	this.btnBrowse = btnBrowse;
    }
    
    public void registerSearchButton(BtnSearch btnSearch) {
    	this.btnSearch = btnSearch;
    }
    
    public void registerLockCheckBox(ChkLock chkLock) {
    	this.chkLock = chkLock;
    }
    
    public void registerDisplayLabel(LblDisplay lblDisplay) {
    	this.lblDisplay = lblDisplay;
    }
    
 
    
    //---------------------------------------------------------------------------------------------------------------------
 //3. actions to take i.e. the mediation bit
    public void browseClicked() {
        btnBrowse.setEnabled(false);
        btnSearch.setEnabled(true);
        lblDisplay.setText("You are now browsing.");
        btnEdit.setEnabled(!chkLock.isSelected());
    }

	public void editClicked() {
		btnEdit.setEnabled(false);
		btnSearch.setEnabled(true);
		btnBrowse.setEnabled(true);
		lblDisplay.setText("You are now editing.");
	}

	public void searchClicked() {
		btnSearch.setEnabled(false);
		btnBrowse.setEnabled(true);
		lblDisplay.setText("You are now searching.");
		btnEdit.setEnabled(!chkLock.isSelected());
	}

	public void lockSelected() {
		btnEdit.setEnabled(false);
	}

	public void unlockUnselected() {
		btnEdit.setEnabled(true);
	}
    
    
}
