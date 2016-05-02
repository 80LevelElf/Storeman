package Core;

import org.modelmapper.ModelMapper;

/**
 * Created by Rustam on 02.05.2016.
 */
public final class Mapper {
    private static ModelMapper mapper;

    static {
        mapper = new ModelMapper();
    }

    private Mapper()
    {

    }

    public static void map(Object source, Object destination)
    {
        mapper.map(source, destination);
    }
}
