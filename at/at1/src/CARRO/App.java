public class App {
        public static void main(String[] args) {
            
            Carro c1 = new Carro(2003, "Vermelho", "Toyota", 200.0, "Motor V8", "Automático", "ABC123456", "Couro");
            Carro c2 = new Carro(1999, "Verde", "Fiat", 140.0, "1.6", "Manual", "KADKJ4122", "Couro-Sintético");
            Carro c3 = new Carro(2000, "Azul", "Mercedes", 250.0, "Motor V6", "Manual", "JAMK41512", "Tecido");
            
            System.out.println("Informações do Carro:");
            System.out.println("Ano de Fabricação: " + c1.getAnoFabricacao());
            System.out.println("Cor: " + c1.getCor());
            System.out.println("Marca: " + c1.getMarca());
            System.out.println("Velocidade Máxima: " + c1.getVelocidadeMaxima() + " km/h");
            System.out.println("Motor: " + c1.getMotor());
            System.out.println("Câmbio: " + c1.getCambio());
            System.out.println("Chassi: " + c1.getChassi());
            System.out.println("Banco: " + c1.getBanco());

            System.out.println("\nInformações do Carro 2:");
            System.out.println("Ano de Fabricação: " + c2.getAnoFabricacao());
            System.out.println("Cor: " + c2.getCor());
            System.out.println("Marca: " + c2.getMarca());
            System.out.println("Velocidade Máxima: " + c2.getVelocidadeMaxima() + " km/h");
            System.out.println("Motor: " + c2.getMotor());
            System.out.println("Câmbio: " + c2.getCambio());
            System.out.println("Chassi: " + c2.getChassi());
            System.out.println("Banco: " + c2.getBanco());
    
            System.out.println("\nInformações do Carro 3:");
            System.out.println("Ano de Fabricação: " + c3.getAnoFabricacao());
            System.out.println("Cor: " + c3.getCor());
            System.out.println("Marca: " + c3.getMarca());
            System.out.println("Velocidade Máxima: " + c3.getVelocidadeMaxima() + " km/h");
            System.out.println("Motor: " + c3.getMotor());
            System.out.println("Câmbio: " + c3.getCambio());
            System.out.println("Chassi: " + c3.getChassi());
            System.out.println("Banco: " + c3.getBanco());


            c1.liga();
            c1.desliga();
            c1.acelera();
            c1.freia();

            c2.liga();
            c2.desliga();
            c2.acelera();
            c2.freia();

            c3.liga();
            c3.desliga();
            c3.acelera();
            c3.freia();
    }
}
