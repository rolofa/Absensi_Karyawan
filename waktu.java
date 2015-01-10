
/**
 * Write a description of class waktu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class waktu
{
   public static final int max_jamM = 7, max_menitM = 30 , max_detikM = 0, max_jamKerja = (8*3600); 
   private int jamM, menitM, detikM;
   private int jamK, menitK, detikK;
    
    public void setJamM(int jamM)
    {
        this.jamM=jamM;
    }
    
    public void setMenitM(int menitM)
    {
        this.menitM=menitM;
    }
    public void setDetikM(int detikM)
    {
        this.detikM=detikM;
    }
    
    public void setJamK(int jamK)
    {
        this.jamK=jamK;
    }
    public void setMenitK(int menitK)
    {
        this.menitK=menitK;
    }
    public void setDetikK(int detikK)
    {
        this.detikK=detikK;
    }
    
    public int getJamM()
    {return jamM;}
    public int getMenitM()
    {return menitM;}
    public int getDetikM()
    {return detikM;}
    public int getJamK()
    {return jamK;}
    public int getMenitK()
    {return menitK;}
    public int getDetikK()
    {return detikK;}
    
    public void masuk(int jamM, int menitM, int detikM)
    {
        this.jamM=jamM;
        this.menitM=menitM;
        this.detikM=detikM;
    }
    
    public void keluar(int jamK, int menitK, int detikK)
    {
        this.jamK=jamK;
        this.menitK=menitK;
        this.detikK=detikK;
    }

    public void lamaJamKerja()
    {
        int lama =((getJamK()*3600)+(getMenitK()*60)+getDetikK())-((getJamM()*3600)+(getMenitM()*60)+getDetikM());
        if (lama < max_jamKerja)
        {
            System.out.println("Jam Kerja Anda Kurang !");
        }else if (lama == max_jamKerja)
                {
                    System.out.println("Anda Tepat Waktu.");
                }else if (lama > max_jamKerja)
                        {
                            int lebih = lama - max_jamKerja;
                            int jam = lebih / 3600;
                            int index = lebih - (jam*3600);
                            int menit = index / 60 ;
                            index = index - (menit*60);
                            int detik = index;
                            System.out.println("Anda Memiliki Kelebihan Waktu " +jam+" jam : "+menit+" menit :"+detik+" detik.");
                        }
        
    }
   
    public void cek()
    {
        if( getJamM()<= max_jamM && getMenitM()<= max_menitM && getDetikM()<= max_detikM)
        {
            System.out.println("Selamat Bekerja.");
            return;
        }
        else 
        {
            System.out.println("Anda Telat Datang ! ");
        }
    }
}
