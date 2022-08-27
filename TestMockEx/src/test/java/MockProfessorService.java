public class MockProfessorService implements ProfessorService {

    @Override
    public String buscaProfessor (int id) {

        if(id == 1)
        {
            return ServerConst.Server1;
        }

        else if(id == 2)
        {
            return ServerConst.Server2;
        }

        else if(id == 3)
        {
            return ServerConst.Server3;
        }

        else if(id == 4)
        {
            return ServerConst.Server4;
        }

        else if(id == 5)
        {
            return ServerConst.Server5;
        }

        else if(id == 6)
        {
            return ServerConst.Server6;
        }

        else
        {
            return null;
        }
    }
}