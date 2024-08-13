package test;

import dao.impl.OdontologoIDao;
import model.Odontologo;
import service.OdontologoService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OdontologoEnMemoria {

    public static Logger LOGGER=Logger.getLogger(OdontologoTest.class);
    private static OdontologoService odontologoService=new OdontologoService(new dao.impl.OdontologoEnMemoria());

    @Test
    @DisplayName("Test en Memoria de Registro Odontologo")

    void Test1(){
        Odontologo odontologo1=new Odontologo("Leonardo","Muzillo","123455");

        Odontologo odontologoRegistrado=odontologoService.registrarOdontologo(odontologo1);

        assertNotNull(odontologoRegistrado);
    }

    @Test
    @DisplayName("Test en Memoria de Listar Odontologo")
    void Test2(){
        Odontologo odontologo1=new Odontologo("Ezequiel","Auge","123455");

        Odontologo od2ontologoRegistrado=odontologoService.registrarOdontologo(odontologo1);

        List<Odontologo> odontologos=odontologoService.listarOdontologos();

        assertEquals(1,odontologos.size());
    }
}
