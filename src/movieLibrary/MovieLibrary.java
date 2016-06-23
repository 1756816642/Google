package movieLibrary;

import java.util.ArrayList;

/**
 * Created by sofia on 6/22/16.
 */
public class MovieLibrary {
    public ArrayList<Comedy> comedies;
    public ArrayList<Action> actions;
    public ArrayList<ChickFlick> chickFlicks;
    public ArrayList<Animation> animations;
    public ArrayList<ScienceFiction> scienceFictions;

    public MovieLibrary() {
        comedies = new ArrayList<Comedy>();
        actions = new ArrayList<Action>();
        chickFlicks = new ArrayList<ChickFlick>();
        animations = new ArrayList<Animation>();
        scienceFictions = new ArrayList<ScienceFiction>();
    }

    public void addMovies(Comedy comedy) {
        comedies.add(comedy);
    }

    public void addMovies(Action action) {
        actions.add(action);
    }

    public void addMovies(ChickFlick chickFlick) {
        chickFlicks.add(chickFlick);
    }

    public void addMovies(Animation animation) {
        animations.add(animation);
    }

    public void addMovies(ScienceFiction scienceFiction) {
        scienceFictions.add(scienceFiction);
    }
}
