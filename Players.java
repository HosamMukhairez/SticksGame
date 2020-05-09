package drawing.drawingsticksgame;

import java.awt.Color;

public class Players {

    private String playerName;

    private int score;

    private Color color;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void resetScore() {
        score = 0;
    }
}
