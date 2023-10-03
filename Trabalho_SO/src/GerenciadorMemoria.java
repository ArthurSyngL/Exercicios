import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class Process {
        private int pid;
        private int startAddress;
        private int endAddress;
        private char fillChar;

        public Process(int pid, int startAddress, int endAddress, char fillChar) {
            this.pid = pid;
            this.startAddress = startAddress;
            this.endAddress = endAddress;
            this.fillChar = fillChar;
        }

        public int getPid() {
            return pid;
        }

        public int getStartAddress() {
            return startAddress;
        }

        public int getEndAddress() {
            return endAddress;
        }

        public char getFillChar() {
            return fillChar;
        }
    }

    public class GerenciadorMemoria {
        private static char[] memory;
        private static List<Process> processTable = new ArrayList<>();

           public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            boolean controlador = true;

            while (controlador) {

                System.out.println("\nGerenciador de Memória\n");
                System.out.println("1 - mem (tamanho em bytes)");
                System.out.println("2 - load (tamanho do processo em bytes, pid, caracter de preenchimento)");
                System.out.println("3 - delet (pid)");
                System.out.println("4 - reset");
                System.out.println("5 - dump_proc (pid)");
                System.out.println("6 - dump_mem");
                System.out.println("7 - Fechar Programa");

                System.out.println("\nEntre com a opcao desejada: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1: /* Armazenando a memoria  instrui o gerenciador a
                        alocar um array com o tamanho de bytes especificados. Com este
                        array é que o gerenciador irá trabalhar para carregar os processos.*/

                        int memorySize = scanner.nextInt();
                        initializeMemory(memorySize);

                        break;
                    case 2: /* Carregando o load Quando este comando for executado o
                            gerenciador de memória deverá procurar no array um espaço livre
                            contíguo grande o suficiente para acomodar o novo processo.*/

                        int processSize = scanner.nextInt();
                        int pid = scanner.nextInt();
                        char fillChar = scanner.next().charAt(0);
                        loadProcess(processSize, pid, fillChar);

                        break;
                    case 3: // Guardando o pid

                        pid = scanner.nextInt();
                        deleteProcess(pid);

                        break;
                    case 4: /*apaga toda a memória, reinicializa todas as estruturas de dados de controle.
                    O único comando que pode ser executado após um reset é o mem*/

                        resetMemory();

                        break;
                    case 5: /*exibe na tela o endereço de início, o endereço de fim, o caracter de preenchimento e o tamanho
                              em bytes da partição de memória ocupada pelo processo identificado pelo pid.*/

                        pid = scanner.nextInt();
                        dumpProcess(pid);

                        break;
                    case 6: /*deve mostrar a situação de toda a memória, ou seja, partições que estão alocadas com as informações
                              do processo e as partições livres (buracos) a partir do início do array. Uma visualização gráfica é desejável*/

                        dumpMemory();

                        break;
                    case 7: // Fechando o programa

                        controlador = false;

                        break;

                    default: // Ficar avisando o programa que nao acho alguma opcao
                        System.out.println("\nOpcao Invalida!\n");
                }
            }

        }
        private static void initializeMemory(int memorySize) {      //Inicializando a memoria
            memory = new char[memorySize];
            for (int i = 0; i < memorySize; i++) {
                memory[i] = '$';
            }
            processTable.clear();
            System.out.println("Memória alocada com sucesso.");
        }

        private static void loadProcess(int processSize, int pid, char fillChar) {  // Guardando o tamanho da memoria desejavel
            int start = -1;
            for (int i = 0; i < memory.length; i++) {
                if (memory[i] == '$' && (i + processSize) <= memory.length) {
                    start = i;
                    break;
                }
            }

            if (start != -1) {
                for (int i = start; i < start + processSize; i++) {
                    memory[i] = fillChar;
                }
                Process process = new Process(pid, start, start + processSize - 1, fillChar);
                processTable.add(process);
                System.out.println("Processo carregado com sucesso. PID: " + pid);
            } else {
                System.out.println("Não há memória disponível para alocar o processo.");
            }
        }

        private static void deleteProcess(int pid) { // Deletando a memoria
            Process processToDelete = null;
            for (Process process : processTable) {
                if (process.getPid() == pid) {
                    processToDelete = process;
                    break;
                }
            }

            if (processToDelete != null) {
                for (int i = processToDelete.getStartAddress(); i <= processToDelete.getEndAddress(); i++) {
                    memory[i] = '0';
                }
                processTable.remove(processToDelete);
                System.out.println("Processo removido com sucesso. PID: " + pid);
            } else {
                System.out.println("Processo não encontrado. PID: " + pid);
            }
        }

        private static void resetMemory() { // Resetando toda a memoria
            memory = null;
            processTable.clear();
            System.out.println("Memória resetada.");
        }

        private static void dumpProcess(int pid) {  // exibe na tela o endereço de início, o endereço de fim, o caracter de preenchimento e o tamanho em bytes da partição de memória ocupada
            for (Process process : processTable) {
                if (process.getPid() == pid) {
                    System.out.println("PID: " + process.getPid());
                    System.out.println("Endereço de Início: " + process.getStartAddress());
                    System.out.println("Endereço de Fim: " + process.getEndAddress());
                    System.out.println("Caracter de Preenchimento: " + process.getFillChar());
                    System.out.println("Tamanho em Bytes: " + (process.getEndAddress() - process.getStartAddress() + 1));
                    return;
                }
            }
            System.out.println("Processo não encontrado. PID: " + pid);
        }

        private static void dumpMemory() { // Mostra a situacao da memoria
            System.out.println("Estado da Memória:");
            for (int i = 0; i < memory.length; i++) {
                if (i % 40 == 0 && i != 0) {
                    System.out.println();
                }
                System.out.print(memory[i]);
            }
            System.out.println();
            System.out.println("Processos Carregados:");
            for (Process process : processTable) {
                System.out.println("PID: " + process.getPid() + ", Endereço de Início: " + process.getStartAddress() +
                        ", Endereço de Fim: " + process.getEndAddress() + ", Caracter de Preenchimento: " + process.getFillChar());
            }
    }
}