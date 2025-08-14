package sintaxis;

public class TiposPrimitivos {

    public static void main(String[] args){
        //Enteros ==> byte
        byte enteroByte = 127;
        System.out.println("Byte: "+enteroByte);
        System.out.println("Valor minimo de byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: "+ Byte.MAX_VALUE);

        //Enteros ==> short (Tipo de referencia)
        short enteroShort = 32123;
        System.out.println("Short:"+enteroShort);
        System.out.println("Valor minimo de short: "+Short.MIN_VALUE);
        System.out.println("Valor maximo de short: "+Short.MAX_VALUE);

        //Enteros ==> int (Tipo de referencia : Integer)
        int entero = 32769;
        System.out.println("Int: "+entero);
        System.out.println("Valor minimo de int: "+Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: "+Integer.MAX_VALUE);

        //Enteros ==> Long (Tipo de referencia: Long)
        long entroLong = 2147483647;
        System.out.println("Long: "+ entroLong);
        System.out.println("Valor minimo de long: "+Long.MIN_VALUE);
        System.out.println("Valor maximo de long: "+Long.MAX_VALUE);

        //Punto flotante ==> float (Tipo de referencia:Float)
        float numeroDecimal =34.23f;

        System.out.println("Float: "+numeroDecimal);
        System.out.println("Valor minimo de float:"+Float.MIN_VALUE);
        System.out.println("Valor maximo de float: "+Float.MAX_VALUE);

        //Punto flotante ==> double (Tipo de referencia :Double)
        double numeroDouble = 34.23;
        System.out.println("Float: "+numeroDouble);
        System.out.println("Valor minimo de Double:"+Double.MIN_VALUE);
        System.out.println("Valor maximo de Double: "+Double.MAX_VALUE);

        //Caracteres ==> Char (Tipo de referencia : Character)
        char caracter = 'c';
        System.out.println("Caracter: "+caracter);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        
        //Boolean ==> (Tipo de referencia : Boolean  )
        boolean esValido =false ;
        System.out.println(""+esValido);
        System.out.println(Boolean.TRUE);
//primitivos directamente en la memoria los tipos de referencia guanda una direccion que apunta al objeto real de la memoria
        //Tipo de referencia: Cadenas
        String nombre = "Eloy";
        System.out.println("Nombre: "+ nombre.toUpperCase());
        System.out.println("Nombre: "+nombre);
        
        //Conversion de tipos
        int i = 100;
        System.out.println("Entero: "+i);
        double d = 100;//conversion de forma directa
        System.out.println("Double :"+ d);

        int x =(int)d;
        System.out.println("Entero: "+x );

    }
    
}



