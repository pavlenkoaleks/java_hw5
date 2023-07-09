


public class task1 {
    
    public static void main(String[] args) {
        telephone telephone = new telephone();
        telephone.addNote("+456789", "Костя Иванов");
        telephone.addNote("+5654665464", "Костя Иванов");
        telephone.addNote("+56547", "Саня Петров");
        telephone.addNote("+5645645", "Вика");
        telephone.addNote("+234561", "Леша");
        telephone.addNote("+234561323", "Артур");
        System.out.println(telephone.findTelephone("Леша"));
    }
}