package com.nico.junit5.training;

/**
 *
 * @author Nico Michael
 */
public class FootballSearchEngine {

    public static String search(String abbreviation){
        String result;
        switch (abbreviation) {

            case "ARZ":
                result = FootballTeams.ARZ.getName();
                break;
                
            case "ATL":
                result = FootballTeams.ATL.getName();
                break;
                
            case "BLT":
                result = FootballTeams.BLT.getName();
                break;
                
            case "BUF":
                result = FootballTeams.BUF.getName();
                break;
                
            case "CAR":
                result = FootballTeams.CAR.getName();
                break;
                
            case "CHI":
                result = FootballTeams.CHI.getName();
                break;
                
            case "CIN":
                result = FootballTeams.CIN.getName();
                break;
                
            case "CLV":
                result = FootballTeams.CLV.getName();
                break;
                
            case "DAL":
                result = FootballTeams.DAL.getName();
                break;
                
            case "DEN":
                result = FootballTeams.DEN.getName();
                break;
                
            case "DET":
                result = FootballTeams.DET.getName();
                break;
                
            case "GB":
                result = FootballTeams.GB.getName();
                break;
                
            case "HST":
                result = FootballTeams.HST.getName();
                break;
            case "IND":
                result = FootballTeams.IND.getName();
                break;
                
            case "JAX":
                result = FootballTeams.JAX.getName();
                break;
                
            case "KC":
                result = FootballTeams.KC.getName();
                break;
                
            case "LV":
                result = FootballTeams.LV.getName();
                break;
                
            case "LAC":
                result = FootballTeams.LAC.getName();
                break;
                
            case "LA":
                result = FootballTeams.LA.getName();
                break;
                
            case "MIA":
                result = FootballTeams.MIA.getName();
                break;
                
            case "MIN":
                result = FootballTeams.MIN.getName();
                break;
                
            case "NE":
                result = FootballTeams.NE.getName();
                break;
                
            case "NO":
                result = FootballTeams.NO.getName();
                break;
                
            case "NYG":
                result = FootballTeams.NYG.getName();
                break;
                
            case "NYJ":
                result = FootballTeams.NYJ.getName();
                break;
                
            case "PHI":
                result = FootballTeams.PHI.getName();
                break;
                
            case "PIT":
                result = FootballTeams.PIT.getName();
                break;
                
            case "SF":
                result = FootballTeams.SF.getName();
                break;
                
            case "SEA":
                result = FootballTeams.SEA.getName();
                break;
                
            case "TB":
                result = FootballTeams.TB.getName();
                break;
                
            case "TEN":
                result = FootballTeams.TEN.getName();
                break;
                
            case "WAS":
                result = FootballTeams.WAS.getName();
                break;

            default:
                result = "Search for " + abbreviation + " returned no values";
        }
        return result;
    }
}
