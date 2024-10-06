package depenedency_inversion_principle;

public class Layers_demo2 {
//High-level modules should not depend on low-level modules. Both should depend on abstractions
//Abstractions should not depend on details. Details should depend on abstractions.
	
	
//we have introduced the Interface which is extended by the Data Access Layer and referred in the BLL.
//Hence we can say that Irepository layer acts as abstraction between these modules
}
 class BusinessLogicLayer1
{
    private  IRepositoryLayer DAL;

    public BusinessLogicLayer1(IRepositoryLayer repositoryLayer)
    {
        DAL = repositoryLayer;
    }

    public void Save(Object details)
    {
        DAL.Save(details);
    }
}

 interface IRepositoryLayer
{
    void Save(Object details);
}

 class DataAccessLayer1 implements IRepositoryLayer
{
    public void Save(Object details)
    {
        //perform save
    }
}