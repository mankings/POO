package aula11.Ex2;

import java.util.*;

public class Voo {
    public static Set<String> companhias;
    private String hora, codigo, companhia, origem, atraso = "";

    public Voo(String hora, String codigo, String origem) {
        this.hora = hora;
        this.codigo = codigo;
        this.origem = origem;
        setCompanhia();
    }

    public Voo(String hora, String codigo, String origem, String atraso) {
        this(hora, codigo, origem);
        this.atraso = atraso;
    }

    public String getHora() {
        return hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCompanhia() {
        return companhia;
    }

    public String getOrigem() {
        return origem;
    }

    public String getAtraso() {
        return atraso;
    }

    private void setCompanhia() {
        for(String c : companhias) {
            if(this.getCodigo().startsWith(c)) {
                this.companhia = c;
                break;
            }
        }
    }

    public String horaPrevista() {
        int[] atr = atrasoToInt();
        if(atr == null) return "";
        String hours = (atr[0] < 10 ? "0" : "") + atr[0];
        String minutes = (atr[1] < 10 ? "0" : "") + atr[1];
        return String.format("Previsto: %2s:%2s", hours, minutes);
    }

    public int[] atrasoToInt() {
        if(getAtraso() == "") return null;
        String[] hr = getHora().split(":");
        int[] h = {Integer.parseInt(hr[0]), Integer.parseInt(hr[1])};
        String[] at = getAtraso().split(":");
        int[] a = {Integer.parseInt(at[0]), Integer.parseInt(at[1])};
        int[] p = {h[0]+a[0], h[1]+a[1]};
        if(p[0] > 23) p[0] = p[0] % 24;
        if(p[1] > 59) p[1] = p[1] % 60;
        return p;
    }
}