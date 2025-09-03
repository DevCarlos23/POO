package colegiov2;

public class ColegioPrincipalV2 {

    public static void main(String[] args) {
        Colegio[] CO = new Colegio[3];
        CO[0]=new Colegio("San Bernardo","Cll 68 # 68 B 63",300);
        CO[1]=new Colegio("Santiago Felipe","Cra 27 sur # 40-21",200);
        CO[2]=new Colegio("Walt Wiltman","Ac 72 # 57 33",500);
                
        for(int i=0; i<CO.length; i++){
            CO[i].Mostrarinfo();
        }
    }
    
}
