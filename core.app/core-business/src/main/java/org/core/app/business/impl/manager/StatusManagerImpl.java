package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.StatusManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Status;
import org.core.app.model.exception.NotFoundException;

public class StatusManagerImpl extends AbstractManagerImpl implements StatusManager {

	@Override
	public List<Status> listStatus() throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getStatusDao().listStatus();
	}

	@Override
	public Status find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getStatusDao().find(id);
	}

	@Override
	public Status searchByPret(Pret pret) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getStatusDao().searchByPret(pret);
	}

	@Override
	public void addStatus(Status status) {
		// TODO Auto-generated method stub
		getDaoFactory().getStatusDao().addStatus(status);
		
	}

	@Override
	public void updateStatus(Status status) {
		// TODO Auto-generated method stub
		getDaoFactory().getStatusDao().updateStatus(status);
		
	}

	@Override
	public void deleteStatus(Status status) {
		// TODO Auto-generated method stub
		getDaoFactory().getStatusDao().deleteStatus(status);
		
	}

}
