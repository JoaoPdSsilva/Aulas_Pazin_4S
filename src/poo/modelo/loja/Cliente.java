package poo.modelo.loja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Cliente extends Usuario{

    public Cliente() {

    }
    private Date dataNascimento;
    private List<Compra> ComprasRealizadas;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dataNascimento = simpleDateFormat.parse(dataNascimento);
        } catch (ParseException ex){
            System.out.println("Data em formato errado. Insira em dd/MM/yyyy");
        }

    }

    public List<Compra> getComprasRealizadas() {
        return ComprasRealizadas;
    }

    public void setComprasRealizadas(List<Compra> comprasRealizadas) {
        ComprasRealizadas = comprasRealizadas;
    }

    public int calcularIdade(){
            if(this.dataNascimento != null) {
                Calendar dataNasc = new GregorianCalendar();
                dataNasc.setTime(this.dataNascimento);
                Calendar dataAtual = Calendar.getInstance();

                int idade = dataAtual.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);
                    dataNasc.add(Calendar.YEAR, idade);

                    if(dataAtual.before(dataNasc)){
                        idade--;
                    }
                    return idade;
            } else {
                return 0;
            }
    }

}
