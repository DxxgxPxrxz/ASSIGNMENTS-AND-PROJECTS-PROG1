public class Ranks {
    public Ranks() {
    }

    public double calculateMaxRank(double score, double min_score, double max_score, boolean inverse) {
        score = score - min_score;
        max_score = max_score - min_score;
        if(!inverse){
            return (score/max_score)*100;
        } else {
            return 100 - ((score / max_score) * 100);
        }
    }

    public String getLetter(double totalRank, String[] ranks) {
        String result = ranks[0];
        if (totalRank > 20){
            result = ranks[1];
        }
        if (totalRank > 40){
            result = ranks[2];
        }
        if (totalRank > 60){
            result = ranks[3];
        }
        if (totalRank > 80){
            result = ranks[4];
        }
        return result;

    }

    public double getTotalRank(double totalRankT, double  totalRankP, double totalRankD, double totalRankIU){
        return (totalRankT+totalRankP+totalRankD+totalRankIU) / 4;
    }
}