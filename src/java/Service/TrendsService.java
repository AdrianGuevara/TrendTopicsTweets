/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Places;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import twitter4j.Trend;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author adrian
 */
public class TrendsService {
    
    private static final String CONSUMER_KEY = "IzM2FWF30fz2LbbxPNjQHkGRL";
    private static final String CONSUMER_SECRET = "htcgiPRKmt80CkFjRwMe3dAbBvXlx3ooaC4053QTgnmUZAnA6k";
    private static final String ACCESS_TOKEN = "63791078-sSI7VtSzGQHrOtGEEWM71hLlFcP7bagQ381KxD97A";
    private static final String ACCESS_TOKEN_SECRET = "YpXs9JmNPPf9kN2gbzFuAtnbpeg2KoQsLK8RuocAgBpSA";
    
    private Twitter twitter;
    private String errorMessage;

    public TrendsService() {
        twitter = getTwitter();
        errorMessage = "";
    }
    
    private Twitter getTwitter() {
        return new TwitterFactory(
                getConfigBuilder().build()
        ).getInstance();
    }
    
    private ConfigurationBuilder getConfigBuilder() {
        return new ConfigurationBuilder()
                .setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
    }
    
    public List<Trend> getTopTrends(String placeName) {
        return new Places()
                .parallelStream()
                .filter(x -> x.getName().equals(placeName))
                .map(x -> x.getId())
                .map(this::getTrends)
                .flatMap(Arrays::stream)
                .limit(10)
                .collect(Collectors.toList());
    }
    
    private Trend[] getTrends(int placeId) {
        try {
            return tryGetTrends(placeId);
        } catch(TwitterException ex) {
            errorMessage = ex.getErrorMessage();
            return new Trend[0];
        }
    }
    
    public Trend[] tryGetTrends(int placeId) throws TwitterException {
        return twitter
                    .getPlaceTrends(placeId)
                    .getTrends();
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
