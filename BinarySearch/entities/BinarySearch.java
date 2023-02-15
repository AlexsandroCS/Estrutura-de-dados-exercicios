package entities;

public class BinarySearch {
    private String[][] lista;
    private String nome;

    public BinarySearch(String[][] lista, String nome){
        this.lista = lista;
        this.nome = nome;
    }

    public void listNameConfirmed(){
        int tamanhoMinLista = 0;
        int tamanhoMaxLista = lista.length - 1;
        int contador = 0;

        while(tamanhoMinLista <= tamanhoMaxLista){
            int tamanhoMidLista = (tamanhoMaxLista + tamanhoMinLista) / 2;
            String chuteNameList = lista[tamanhoMidLista][0];

            if (chuteNameList.equals(nome)){
                System.out.printf("\nNome correto | Posição verificada : %d | Nome que está na posição: %s\n",tamanhoMidLista,chuteNameList);
                break;
            }

            int comparaResultado = nome.compareTo(chuteNameList);

            if(comparaResultado < 0){
                System.out.println("Nome errado | Posição verificada muito alta: " + tamanhoMaxLista);
                tamanhoMaxLista = tamanhoMidLista -1;
            }
            else{
                System.out.println("Nome errado | Posição verificada muito baixa: " + tamanhoMinLista);
                tamanhoMinLista = tamanhoMidLista +1;
            }
            contador++;
        }
        System.out.println("\nQUANTIDADE DE * QUE FOI EFETUADO UMA VERIFICAÇÃO NO ARRAY: " + contador);
    }
}