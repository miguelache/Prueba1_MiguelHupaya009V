
package pruebaz.DTO;

public class Cliente {
        private int Id;
    private String NombreCompleto;
    private int Run;
    private String Dv;
    private int Telefono;
    private String NombreUsuario;
    private String Mail;
    private String Contraseña;
    
    public Cliente(){
        this.Id = 0;
        this.NombreCompleto = "";
        this.Run = 0;
        this.Dv = "";
        this.NombreUsuario = "";
        this.Telefono = 0;
        this.Mail = "";
        this.Contraseña = "";

    }

        public void setId(int Id) {
            this.Id = Id;
        }

    public void setRun(int Run) {
        this.Run = Run;
    }
    
    public Cliente(int Id, String NombreUsuario, String Mail, String Contraseña, 
            String NombreCompleto, int Run, String Dv, int Telefono) {
        this.Id = Id;
        this.NombreUsuario = NombreUsuario;
        this.Mail = Mail;
        this.Contraseña = Contraseña;
        this.NombreCompleto = NombreCompleto;
        this.Run = Run;
        this.Dv = Dv;
        this.NombreUsuario = NombreUsuario;
        this.Telefono = Telefono;
    
}

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public void setRun(int Run, char Dv) {
        if(this.validarrut(Run, Dv)){
            this.Run = Run;
            this.Dv = Dv+"";
    }
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public int getRun() {
        return Run;
    }

    public String getDv() {
        return Dv;
    }

    public int getTelefono() {
        return Telefono;
    }

    public int getId() {
        return Id;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public String getMail() {
        return Mail;
    }

    public String getContraseña() {
        return Contraseña;
    }



    public void setNombreUsuario(String NombreUsuario) {
        StringBuilder sb = new StringBuilder();
        sb.append(NombreUsuario);
        
        if(sb.length() > 4){
            this.NombreUsuario = NombreUsuario;
        }
    }

    public void setMail(String Mail) {
        if(Mail.length() > 5 && Mail.contains("@")){
            this.Mail = Mail;
        }
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;

    }
    
            public boolean validarrut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    }




