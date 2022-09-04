package ee.taltech.b_practise.assignment8;

import java.util.ArrayList;
import java.util.List;

public class PositivesAndNegatives {

    private List<Integer> positives = new ArrayList<>();
    private List<Integer> negatives = new ArrayList<>();

    public PositivesAndNegatives() {
    }

    public PositivesAndNegatives(List<Integer> positives, List<Integer> negatives) {
        this.positives = positives;
        this.negatives = negatives;
    }

    public List<Integer> getPositives() {
        return positives;
    }

    public List<Integer> getNegatives() {
        return negatives;
    }

    public void setPositives(List<Integer> positives) {
        this.positives = positives;
    }

    public void setNegatives(List<Integer> negatives) {
        this.negatives = negatives;
    }
}
