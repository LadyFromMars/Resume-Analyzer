



import java.awt.BorderLayout;
import java.awt.Color;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import static org.jfree.chart.ChartFactory.createRingChart;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;



public class nounParseTest {
    
    static String basedOnFinal1 = " ";

    //  adds new element to an Array
public static String[] add(String[] originalArray, String newItem)
{
    int currentSize = originalArray.length;
    int newSize = currentSize + 1;
    String[] tempArray = new String[ newSize ];
    for (int i=0; i < currentSize; i++)
    {
        tempArray[i] = originalArray [i];
    }
    tempArray[newSize- 1] = newItem;
    return tempArray;
}


 public static String[] GO () {

   //modyfying user input (resume and job description), library

   String library = keyWordsAPI.library1;
   Scanner input = new Scanner(System.in);
   String resume = frame1.resumeInput;
   String job = frame1.jobInput;



   // searching for key words in resume

   String[] words = library.split(" ");
   List<String> wordsList = Arrays.asList(words);
   String[] matches = resume.replace("!","").replace(",","").replace("/","").replace("?","").replace(".","").toLowerCase().split(" ");

   String[] result = {" "};

   for (String match : matches) {

       //add matches to results
       if(Collections.frequency(wordsList, match)>=1){
        result = add(result, match);}

    }


     // searching for key words in job description

     String[] equals = job.replace("!","").replace(",","").replace("/","")
     .replace("?","").replace(".","").toLowerCase().split(" ");

     String[] result2 = {" "};

     for (String equal : equals) {

         //add matches to results
         if(Collections.frequency(wordsList, equal)>=1){
          result2 = add(result2, equal);}

     }



        //outprint the results of KEYWORDS PARSE

        System.out.println("Key words in resume:");

        for (String element:result) {
        System.out.println( element );
            }

        System.out.println();
        System.out.println("Key words in job description:");

        for (String element:result2) {
        System.out.println( element );
        }




 // Matches btwn Job Description (result2) and resume (result)

    String[] twins = result2; //keywords in job description
    String[] jobTwin = result;
    List<String> resultList = Arrays.asList(jobTwin);



    String[] total = {" "}; //matches in the resume
    String[] missed = {" "};

    for (String twin : twins) {
        if(Collections.frequency(resultList, twin)>=1){
            total = add(total, twin);} //add common words to "total"
        else {
            missed = add(missed, twin);// add mismatches to "missed"
        }
     
    }


        //outprint the results (matches btw resume and job description)

        System.out.println();
        System.out.println("Common words in job description and resume:");

 
 
        StringBuilder sb = new StringBuilder(); //transform string[] to string
            for (String s : total)
                    {
                        sb.append(s);
                        sb.append("\t");
                        }

        String newTotal = sb.toString().replace("  "," ").replace("   "," ");
        System.out.println(newTotal); 



 
 

     //outprint the MISmatches btw resume and job description)

        System.out.println();
        System.out.println("You need to add this keywords to your resume:");

   /*for (String element:missed) {
   System.out.println( element );
   }
   System.out.println(" ");*/

   

        //removing duplications in mismatching words

            String resultDeDubl[] = {""};


  		String[] sameWords=missed;
                        
  		for(int i=0;i<sameWords.length;i++)	//outer loop
  		{
  			if(sameWords[i]!=null)
  			{
  			for(int j=i+1;j<sameWords.length;j++)	//inner loop
  			{
  			if(sameWords[i].equals(sameWords[j]))	//Checking for both strings are equal
  				{
  					sameWords[j]=null;
  				}
  			}  } }


  		for(int k=0;k<sameWords.length;k++)		//Creating new String without dupls
  		{
  			if(sameWords[k]!=null)
                            {
                            resultDeDubl = add(resultDeDubl, sameWords[k]);
                            }
                }

        StringBuilder sb5 = new StringBuilder(); //to String
                for (String s : resultDeDubl)
                    {
                        sb5.append(s);
                        sb5.append(" ");
                    }

        String noDubls = sb5.toString().trim();
        System.out.print(noDubls);
//missmatches: setting the value
    frame102.mismatchedWords.setText(noDubls);






 // removing duplication for matching words

  
  String resultDeDublMatch[] = {""};


  		String[] sameWordsMatch=total;
                        
  		for(int i=0;i<sameWordsMatch.length;i++)	//outer loop
  		{
  			if(sameWordsMatch[i]!=null)
  			{
  			for(int j=i+1;j<sameWordsMatch.length;j++)	//inner loop
  			{
  			if(sameWordsMatch[i].equals(sameWordsMatch[j]))	//Checking for both strings are equal
  				{
  					sameWordsMatch[j]=null;
  				}
  			}  } }


  		for(int k=0;k<sameWordsMatch.length;k++)		//Creating new String without dupls
                    {
  			if(sameWordsMatch[k]!=null)
  			{
                            resultDeDublMatch = add(resultDeDublMatch, sameWordsMatch[k]);
  			}
                    }

         StringBuilder sb6 = new StringBuilder(); //to String
          for (String s : resultDeDublMatch)
          {
          sb6.append(s);
          sb6.append(" ");
          }

         String noDublsMatch = sb6.toString().trim();
         System.out.print(noDublsMatch);
         
         
//setting the value to Text Field 'MatchedWords'
    frame102.MatchedWords.setText(noDublsMatch);
   
    
    
    

 //  %%%%%%%%%%% Match btw Resume and Job Description
 
double jobKeyWords = (resultDeDubl.length -2) + (resultDeDublMatch.length -2);
double matchKeyWords = resultDeDublMatch.length -2;

double percentMatch = matchKeyWords / jobKeyWords * 100;
   
   System.out.println(percentMatch);
   System.out.println(jobKeyWords);
   System.out.println(matchKeyWords);
   System.out.println("Your resume matches job description on " + (int)percentMatch + "%");
   
   
   int percentMatchValue = (int)percentMatch;
   
   
   
//setting value for "% match"

   frame102.PerMatch.setText("Your resume matches job description on " + percentMatchValue + "%");
   frame102.ProgressBar.setValue(percentMatchValue);
         
    
    
    
    
// OVERUSED WORDS

        //overused words to search for:
    String ovLibraryAdj = "great good excelent mojor basic intermidiate";
    String ovLibraryVerb = "created create deliver help helped delivered work worked ";

    String s2 = resume;
    String[] ovLibsA = ovLibraryAdj.split(" ");
    String[] ovLibsV = ovLibraryVerb.split(" ");

          
    String[] ovResult = {""}; //search result for ovLibsA(adjectives)
    String[] ovSwitch = {""};//search result for ovLibsV(Verbs)

    String[] s3 = s2.replace("!","").replace(",","").replace("/","").replace("?","").replace(".","").toLowerCase().split(" ");

    
        //modifying and saving the rusults to avoid duplication (result, result, text)
        
    List<String> s4 = Arrays.asList(s3);
          for (String ovLib : ovLibsA) {
                if(Collections.frequency(s4, ovLib)>1){ //for adjectieves
                    ovResult = add(ovResult, '\u201C' + ovLib + '\u201D' + " occurs " + Collections.frequency(s4, ovLib) + " times in your resume \n");
            }
                }

              for (String ovLib : ovLibsV) { //for verbs
             if (Collections.frequency(s4, ovLib)>1){
               ovSwitch = add(ovSwitch,'\u201C' + ovLib + '\u201D' + " occurs " + Collections.frequency(s4, ovLib) + " times in your resume \n");
                }

            }

          StringBuilder sb3 = new StringBuilder();
          for (String s : ovResult)
          {
          sb3.append(s);
          }
          String ovResultFinal = sb3.toString().replace("  "," ").replace("   "," ");
          String ovResultFinal1 =  ovResultFinal + "\n" + "Those words are not good enough for your resume. Try switch them on some of those:\n" +
          "advanced, expert, groundbreaking, robust, superior, phenomenal, strong, outstanding, proficient, deep passion for.\n";
          //System.out.println(ovResultFinal);


          StringBuilder sb4 = new StringBuilder();
          for (String s : ovSwitch)
          {
          sb4.append(s);
          }

          String ovSwitchFinal = sb4.toString().replace("  "," ").replace("   "," ");
          String ovSwitchFinal1 =ovSwitchFinal + "\n" + "Using the same verb over and over again doesn't look good on your resume. You can diversify it with verbs like: \n" +
          "achieve, establish, increase/decrease, influence, negotiate, resolve, launch, manage, provide, improve, coordinate, assist, execute, engage. \n";
          //System.out.println(ovSwitchFinal);

         

          
          
    //Combine output for "overused"
          
          String OverUsedOutput = "";
          if(ovResultFinal.length()>1 && ovSwitchFinal.length()>1){

            OverUsedOutput = ovResultFinal1 + "\n" + ovSwitchFinal1;
          }
          else if (ovResultFinal.length()>1 && ovSwitchFinal.length()<1) {

            OverUsedOutput = ovResultFinal1;
          } else if (ovResultFinal.length()<1 && ovSwitchFinal.length()>1){
            OverUsedOutput = ovSwitchFinal1;
          } else {
            OverUsedOutput = "No overused words found. Way to go!";
          }

          System.out.println(OverUsedOutput);
          
          
          
 //setting the value to overused words   
        frame102.overusedWords.setText(OverUsedOutput);

    
   
    
        
//Proffessional field (pie chart)


    //assing string values for JF
    
          String marketing = jobShares.marketing1;
          String tech = jobShares.tech1;
          String teacher = jobShares.teacher1;
          String medical = jobShares.medical1;
          String science = jobShares.scince1;
          String architecture = jobShares.architecture1;


          String uploadResume = resume;
          String[] marketingList = marketing.split(" ");
          List<String> marketingListS = Arrays.asList(marketingList);
          String[] techList = tech.split(" ");
          List<String> techListS = Arrays.asList(techList);
          String[] teatcherList = teacher.split(" ");
          List<String> teatcherListS = Arrays.asList(teatcherList);
          String[] medList = medical.split(" ");
          List<String> medListS = Arrays.asList(medList);
          String[] scienceList = science.split(" ");
          List<String> scienceListS = Arrays.asList(scienceList);
          String[] archList = architecture.split(" ");
          List<String> archListS = Arrays.asList(archList);

          int nMarketing = 0;
          int nTech = 0;
          int nTeacher = 0;
          int nMed = 0;
          int nScience = 0;
          int nArch = 0;

          String[] basedOn = {""};

          String[] resOps = uploadResume.replace("!","").replace(",","").replace("/","").replace("?","").replace(".","").toLowerCase().split(" ");
          List<String> ResList = Arrays.asList(resOps);


          
          
    //saving the words pie chart results based on 
    
    
          for (String resOp : resOps) {

            if(Collections.frequency(marketingListS, resOp)>=1 && resOp != null){
             basedOn = add(basedOn, resOp + " (marketing),  ");
             nMarketing++;
           }
             else if(Collections.frequency(techListS, resOp)>=1){
              basedOn = add(basedOn, resOp + " (IT),  ");
              nTech++;
            }  else if(Collections.frequency(teatcherListS, resOp)>=1){
             basedOn = add(basedOn, resOp + " (education),  ");
             nTeacher++;
           } else if(Collections.frequency(medListS, resOp)>=1){
              basedOn = add(basedOn, resOp + " (medicine),  ");
              nMed++; 
           } else if(Collections.frequency(scienceListS, resOp)>=1){
              basedOn = add(basedOn, resOp + " (science),  ");
              nScience++; 
          } else if(Collections.frequency(archListS, resOp)>=1){
              basedOn = add(basedOn, resOp + " (architecture),  ");
              nArch++; }

}

            System.out.println(nMarketing);
            System.out.println(nTech);
            System.out.println(nTeacher);
            System.out.println(nMed);
            System.out.println(nScience);
            System.out.println(nArch);
            
            

            for (String element:basedOn) {
                System.out.println( element );
            }


// conculating shares in fields

        double all = nMarketing + nTech + nTeacher + nMed + nArch + nScience;
        System.out.println("all " + all);
        
        int markShare = (int)((nMarketing/all)*100);
        int techShare = (int)((nTech/all)*100);
        int eduShare = (int)((nTeacher/all)*100);
        int medShare = (int)((nMed/all)*100);
        int scienceShare = (int)((nScience/all)*100);
        int archShare = (int)((nArch/all)*100);
        int other = 100 - (markShare + techShare + eduShare +medShare + scienceShare + archShare);

        System.out.println("Marketing: " + markShare + " %");
        System.out.println("IT: " + techShare + " %");
        System.out.println("education: " + eduShare + " %");
        System.out.println("Science: " + scienceShare + " %");
        System.out.println("architecture: " + archShare + " %");
        System.out.println("other: " + other + " %");
    
        
    
    // PIECHART 
      
      
      DefaultPieDataset pieDataset = new DefaultPieDataset();
      
            //legend output
      
      String IT = "IT: " + String.valueOf(techShare) + "%";
      String EDU = "education: " + String.valueOf(eduShare) + "%";
      String MARK = "marketing: " + String.valueOf(markShare) + "%";
      String MED = "medical: " + String.valueOf(medShare) + "%";
      String SCI = "science: " + String.valueOf(scienceShare) + "%";
      String ARCH = "architecture: " + String.valueOf(archShare) + "%";
      String OTHER = "other: " + String.valueOf(other) + "%";
      
      
            //pie chart values
            
      pieDataset.setValue(IT, techShare);
      pieDataset.setValue(EDU, eduShare);
      pieDataset.setValue(MARK, markShare);
      pieDataset.setValue(MED, medShare);
      pieDataset.setValue(SCI, scienceShare);
      pieDataset.setValue(ARCH, archShare);
      pieDataset.setValue(OTHER, other);
      JFreeChart chart = ChartFactory.createPieChart3D("Field match", pieDataset, true, true, true);
      PiePlot3D P=(PiePlot3D)chart.getPlot();
      
       
      
            //pie chart customization
            
      PiePlot plot = (PiePlot) chart.getPlot();
      plot.setSectionPaint(IT, new Color(64, 188, 188));
      plot.setSimpleLabels(true);
      plot.setSectionPaint("education", new Color(229, 244, 65));
      plot.setSectionPaint("marketing", new Color(31, 83, 239));
      plot.setSectionPaint("other", new Color(61, 28, 140));
      plot.setSectionPaint("medical", new Color(75, 168, 117));
      plot.setSectionPaint("science", new Color(247, 194, 34));
      plot.setSectionPaint("architecture", new Color(109, 249, 158));
      plot.setStartAngle(290);
      plot.setDirection(Rotation.CLOCKWISE);
      plot.setForegroundAlpha(0.5f);
      plot.setLabelGenerator(null);
      
      chart.getLegend().setFrame(BlockBorder.NONE);
      
      
      ChartPanel chartPanel = new ChartPanel(chart);
      chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
      chartPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      chart.setBackgroundPaint(Color.WHITE);
      chart.setBorderVisible(false); 
      
      
    
      
//setting a PIE CHART value

      frame102.PiePanel.add(chartPanel, BorderLayout.CENTER);
      

      
      
      
// Job field - BASED ON WORDS

StringBuilder sb7 = new StringBuilder();
          for (String s : basedOn)
          {
          sb7.append(s);
          }
          String basedOnFinal = sb7.toString().replace("  "," ").replace("   "," ");
          
         
           basedOnFinal1 = basedOnFinal;
   
    
return basedOn;




 }
 
  public static String pushTheButton(){
 
     FieldBased.BasedOnWords.setText(basedOnFinal1);
     
     return basedOnFinal1;
 }

  
  
  
  
  
 // Save resume (checkbox)
  
  public static void saveResumeInp(){
      
      String resImpSaved = frame1.saveResumeInput;
      String resEmpty = " ";
      

//save chechbox state
      
      int boxState = frame1.saveBox;
      if (boxState%2 == 0){
         frame1.saveResume.setSelected(true); 
          
      } else {
         frame1.saveResume.setSelected(false); 
      }

//String resImpSaved = resume;
        
        if(frame1.saveResume.isSelected()){
            
            frame1.TextFieldResume.setText(resImpSaved);
        } else {
            frame1.TextFieldResume.setText(resEmpty);
        }
        
  }
  
  
  
  
  
  // save Job Description (checkbox)
  
   public static void saveJD(){
      
      String JDSaved = frame1.saveJDInput;
      String jobEmpty = " ";
      

//save chechbox state
      
      int boxJDState = frame1.saveJDBox;
      if (boxJDState%2 == 0){
         frame1.SaveJobDes.setSelected(true); 
          
      } else {
         frame1.SaveJobDes.setSelected(false); 
      }

//String resImpSaved = resume;
        
        if(frame1.SaveJobDes.isSelected()){
            
            frame1.TextFieldJob.setText(JDSaved);
        } else {
            frame1.TextFieldJob.setText(jobEmpty);
        }
      
        
  }
  
  

// MAIN

public static void main (String[] args) {

  GO();
  
    }
}
