/*
package structural.adaptor.Fascade;

public class FacadeDemo {
    public static void main(String[] args) {
        */
/*ComputerFascade computerFascade = new ComputerFascade();
        computerFascade.doAllOperation();*//*

    }

    Class ComputerFascade {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();
        public void doAllOperation(){
            cpu.start();
            memory.load();
            hardDrive.read();
            System.out.println("");
        }

    }


    class CPU{
        void start(){
            System.out.println("CPU Started");
        }
    }

    class Memory {
        void load() {
            System.out.println("Memory Loaded");
        }
    }

    class HardDrive {
        void read() {
            System.out.println("Hard Drive Reading");
        }
    }



}
*/
