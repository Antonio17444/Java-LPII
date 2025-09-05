package Package;

public class QuestTres {
	public static void main(String[] args) {
		
		Animal cachorroUm = new Animal();
        cachorroUm.nome = "Spike";
        cachorroUm.especie = "Cachorro";
        cachorroUm.idade = 3;
        
        Animal cachorroDois = new Animal();
        cachorroDois.nome = "Lampiao";
        cachorroDois.especie = "Cachorro";
        cachorroDois.idade = 4;
        
        Animal cachorroTres = new Animal();
        cachorroTres.nome = "Amora";
        cachorroTres.especie = "Cachorro";
        cachorroTres.idade = 5;
        
        cachorroUm.emitirSom();
        cachorroDois.emitirSom();
        cachorroTres.emitirSom();
        
	}
}
