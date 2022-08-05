package com.yansb.rh.service.promote;

import com.yansb.rh.ValidationException;
import com.yansb.rh.model.Employee;
import com.yansb.rh.model.Role;

public class PromoteService {

  public void promote(Employee employee, boolean goalAchieved) {
    if(employee.getRole() == Role.MANAGER){
      throw new ValidationException("Managers cant be promoted");
    }

    if(goalAchieved){
      Role newRole = employee.getRole().getNextRole();
      employee.promote(newRole);
    }else{
      throw new ValidationException("Goal not achieved");
    }

  }
}
