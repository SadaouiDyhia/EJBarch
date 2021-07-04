package services;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Service
 */
@Stateless
public class Service implements ServiceRemote {

    /**
     * Default constructor. 
     */
    public Service() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String hellowrld() {
		// TODO Auto-generated method stub
		return "hello World !" ; 
	}

}
