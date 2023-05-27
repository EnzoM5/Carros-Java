import java.util.*;

public class CarroApp extends Carro {
    public CarroApp(String modelo, String cor, String descricao, float velocidadeMaxima) {
        super(modelo, cor, descricao, velocidadeMaxima);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Deseja criar um carro ou visualizar os criados no código? \n1 - Criar\n2 - Visualizar");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        List<Carro> listaDeCarros = new ArrayList(10);
        switch(escolha) {
            case 1:
                CriarInteragindo(listaDeCarros);
                break;
            case 2: 
                CriarCodando(listaDeCarros);
                
        }
        scanner.close();
        for (Carro carro : listaDeCarros) {
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Cor: " + carro.getCor());
            System.out.println("Descrição: " + carro.getDescricao());
            System.out.println("Velocidade Máxima: " + carro.getVelocidadeMaxima());
            System.out.println();
        }
    }

 

    public static void CriarInteragindo(List<Carro> listaDeCarros) {
        System.out.println("Digite o nome do carro: ");
        Scanner sc = new Scanner(System.in);
        String modeloCarro;
        modeloCarro = sc.nextLine();
        System.out.println("Digite a cor do carro: ");
        String corCarro = sc.nextLine();
        System.out.println("Digite uma descrição para o carro: ");
        String descricaoCarro = sc.nextLine();
        System.out.println("Digite a velocidade máxima do carro: ");
        float velocidadeMaximaCarro = sc.nextFloat();
        sc.close();
        Carro carro = new Carro(modeloCarro, corCarro, descricaoCarro, velocidadeMaximaCarro);
        listaDeCarros.add(0, carro);
    }

      

    public static void CriarCodando(List<Carro> listaDeCarros) {
        Carro carro1 = new Carro("Fusca", "Azul", "Um fusca azul bem legal", 7000);
        Carro carro2 = new Carro(null, null, null, 0);
        carro2.setModelo("Ferrari");
        carro2.setCor("Amarelo");
        carro2.setDescricao("Carro de luxo");
        carro2.setVelocidadeMaxima(300);
        listaDeCarros.add(0, carro1);
        listaDeCarros.add(1, carro2);
  
        }

    }

