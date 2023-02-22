

package primeiroprograma;
public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}
---------------------------------------------------
package horadosistema;

import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date ();
        System.out.println("Horário do sistema: ");
        System.out.println(relogio.toString());
    }
}

#IDIOMA DO SISTEMA

package idiomadosistema;

import java.util.Locale;
public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("Idioma do sistema: ");
        System.out.print(loc.getDisplayLanguage());
    }
}
---------------------------------------------------
RESOLUÇÃO DO SISTEMA
