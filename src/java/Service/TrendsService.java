/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Countries;
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

    public TrendsService() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
        twitter = new TwitterFactory(cb.build()).getInstance();
    }
    
    public List<Trend> getTopTrends(String placeName) {
        return new Countries()
                .parallelStream()
                .filter(x -> x.getName().equals(placeName))
                .map(x -> x.getId())
                .map(this::getTrends)
                .flatMap(Arrays::stream)
                .limit(10)
                .collect(Collectors.toList());
    }
    
    public Trend[] getTrends(int placeId) {
        try {
            return twitter
                    .getPlaceTrends(placeId)
                    .getTrends();
        } catch (TwitterException ex) {
            return new Trend[0];
        }
    }
}
