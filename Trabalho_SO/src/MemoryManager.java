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

public class MemoryManager {
    private static char[] memory;
    private static List<Process> processTable = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Comando: ");
            String command = scanner.next();

            if (command.equals("mem")) {
                int memorySize = scanner.nextInt();
                initializeMemory(memorySize);
            } else if (command.equals("load")) {
                int processSize = scanner.nextInt();
                int pid = scanner.nextInt();
                char fillChar = scanner.next().charAt(0);
                loadProcess(processSize, pid, fillChar);
            } else if (command.equals("delet")) {
                int pid = scanner.nextInt();
                deleteProcess(pid);
            } else if (command.equals("reset")) {
                resetMemory();
            } else if (command.equals("dump_proc")) {
                int pid = scanner.nextInt();
                dumpProcess(pid);
            } else if (command.equals("dump_mem")) {
                dumpMemory();
            } else if (command.equals("exit")) {
                break;
            }
        }

        scanner.close();
    }

    private static void initializeMemory(int memorySize) {
        memory = new char[memorySize];
        for (int i = 0; i < memorySize; i++) {
            memory[i] = '$';
        }
        processTable.clear();
        System.out.println("Memória alocada com sucesso.");
    }

    private static void loadProcess(int processSize, int pid, char fillChar) {
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

    private static void deleteProcess(int pid) {
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

    private static void resetMemory() {
        memory = null;
        processTable.clear();
        System.out.println("Memória resetada.");
    }

    private static void dumpProcess(int pid) {
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

    private static void dumpMemory() {
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
