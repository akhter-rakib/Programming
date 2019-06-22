package basic.dependency_Injection.dependentObj;

import basic.dependency_Injection.dependentObj.Service;

public class Customer {
    //dependent Obj
    Service service = new Service("Cool Service");

    public String getService() {
        System.out.println(service.getName());
        return service.getName();
    }

}
