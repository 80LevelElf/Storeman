package Core.Helpers;

import org.modelmapper.ModelMapper;

/**
 * Created by Rustam on 02.05.2016.
 */
public final class MapperHelper {
    private static ModelMapper mapper;

    static {
        mapper = new ModelMapper();
    }

    private MapperHelper()
    {

    }

    public static void map(Object source, Object destination)
    {
        mapper.map(source, destination);
    }
}
