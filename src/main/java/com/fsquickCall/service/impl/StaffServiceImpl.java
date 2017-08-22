package com.fsquickCall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsquickCall.dao.StaffDao;
import com.fsquickCall.model.Staff;
import com.fsquickCall.service.Staffservice;


@Service("Staffservice")
public class StaffServiceImpl implements Staffservice{

	@Autowired
	private StaffDao staffDao;
	
	public Staff login(Staff staff) {
		return staffDao.login(staff);
	}

}
