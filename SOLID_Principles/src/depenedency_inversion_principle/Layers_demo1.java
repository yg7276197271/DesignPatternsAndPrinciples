package depenedency_inversion_principle;

public class Layers_demo1 {
//Notice from the above code the BLL is directly dependent on the low level Data Access Layer and 
	//it’s hard to perform any unit tests on this code as both are coupled.
	//In order to achieve that we introduce interface that acts as abstraction so that both are decoupled
	//Please refer Layer_demo2
}
 class BusinessLogicLayer
{
    private  DataAccessLayer DAL;

    public BusinessLogicLayer()
    {
        DAL = new DataAccessLayer();
    }

    public void Save(Object details)
    {
        DAL.Save(details);
    }
}

 class DataAccessLayer
{
    public void Save(Object details)
    {
        //perform save
    }
}
