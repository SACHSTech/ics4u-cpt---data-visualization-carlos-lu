package Datasets;

import DataSheets;

public class games {

    private String QueryID;
    private String ResponseID;
    private String QueryName;
    private String ResponseName;
    private String ReleaseDate;
    private String RequiredAge;
    private String DemoCount;
    private String DeveloperCount;
    private String DLCCount;
    private String Metacritic;
    private String MovieCount;
    private String PackageCount;
    private String RecommendationCount;
    private String PublisherCount;
    private String ScreenshotCount;
    private String SteamSpyOwners;
    private String SteamSpyOwnersVariance;
    private String SteamSpyPlayersEstimate;
    private String SteamSpyPlayersVariance;
    private String AchievementCount;
    private String AchievementHighlightedCount;
    private String ControllerSupport;
    private String IsFree;
    private String FreeVerAvail;
    private String PurchaseAvail;
    private String SubscriptionAvail;
    private String PlatformWindows;
    private String PlatformLinux;
    private String PlatformMac;
    private String PCReqsHaveMin;
    private String PCReqsHaveRec;
    private String LinuxReqsHaveMin;
    private String LinuxReqsHaveRec;
    private String MacReqsHaveMin;
    private String MacReqsHaveRec;
    private String CategorySinglePlayer;
    private String CategoryMultiplayer;
    private String CategoryCoop;
    private String CategoryMMO;
    private String CategoryInAppPurchase;
    private String CategoryIncludeSrcSDK;
    private String CategoryIncludeLevelEditor;
    private String CategoryVRSupport;
    private String GenreIsNonGame;
    private String GenreIsIndie;
    private String GenreIsAction;
    private String GenreIsAdventure;
    private String GenreIsCasual;
    private String GenreIsStrategy;
    private String GenreIsRPG;
    private String GenreIsSimulation;
    private String GenreIsEarlyAccess;
    private String GenreIsFreeToPlay;
    private String GenreIsSports;
    private String GenreIsRacing;
    private String GenreIsMassivelyMultiplayer;
    private String PriceCurrency;
    private String PriceInitial;
    private String PriceFinal;
    private String SupportEmail;
    private String SupportURL;
    private String AboutText;
    private String Background;
    private String ShortDescrip;
    private String DetailedDescrip;
    private String DRMNotice;
    private String ExtUserAcctNotice;
    private String HeaderImage;
    private String LegalNotice;
    private String Reviews;
    private String SupportedLanguages;
    private String Website;
    private String PCMinReqsText;
    private String PCRecReqsText;
    private String LinuxMinReqsText;
    private String LinuxRecReqsText;
    private String StringMacMinReqsText;
    private String MacRecReqsText;

    public games(String QueryID, String ResponseID, String QueryName, String ResponseName, String ReleaseDate, String RequiredAge, String DemoCount, String DeveloperCount, String DLCCount, String Metacritic, String MovieCount, String PackageCount, String RecommendationCount, String PublisherCount, String ScreenshotCount, String SteamSpyOwners, String SteamSpyOwnersVariance, String SteamSpyPlayersEstimate, String SteamSpyPlayersVariance, String AchievementCount, String AchievementHighlightedCount,String ControllerSupport, String IsFree, String FreeVerAvail, String PurchaseAvail, String SubscriptionAvail, String PlatformWindows, String PlatformLinux, String PlatformMac, String PCReqsHaveMin, String PCReqsHaveRec, String LinuxReqsHaveMin, String LinuxReqsHaveRec, String MacReqsHaveMin, String MacReqsHaveRec, String CategorySinglePlayer, String CategoryMultiplayer, String CategoryCoop, String CategoryMMO, String CategoryInAppPurchase, String CategoryIncludeSrcSDK, String CategoryIncludeLevelEditor, String CategoryVRSupport, String GenreIsNonGame, String GenreIsIndie, String GenreIsAction, String GenreIsAdventure, String GenreIsCasual, String GenreIsStrategy, String GenreIsRPG, String GenreIsSimulation, String GenreIsEarlyAccess, String GenreIsFreeToPlay, String GenreIsSports, String GenreIsRacing, String GenreIsMassivelyMultiplayer, String PriceCurrency, String PriceInitial, String PriceFinal, String SupportEmail, String SupportURL, String AboutText, String Background, String ShortDescrip, String DetailedDescrip, String DRMNotice, String ExtUserAcctNotice, String HeaderImage, String LegalNotice, String Reviews, String SupportedLanguages, String Website, String PCMinReqsText, String PCRecReqsText, String LinuxMinReqsText, String LinuxRecReqsText, String StringMacMinReqsText, String MacRecReqsText) {
        this.QueryID = QueryID;
        this.ResponseID = ResponseID;
        this.QueryName = QueryName;
        this.ResponseName = ResponseName;
        this.ReleaseDate = ReleaseDate;
        this.RequiredAge = RequiredAge;
        this.DemoCount = DemoCount;
        this.DeveloperCount = DeveloperCount;
        this.DLCCount = DLCCount;
        this.Metacritic = Metacritic;
        this.MovieCount = MovieCount;
        this.PackageCount = PackageCount;
        this.RecommendationCount = RecommendationCount;
        this.PublisherCount = PublisherCount;
        this.ScreenshotCount = ScreenshotCount;
        this.SteamSpyOwners = SteamSpyOwners;
        this.SteamSpyOwnersVariance = SteamSpyOwnersVariance;
        this.SteamSpyPlayersEstimate = SteamSpyPlayersEstimate;
        this.SteamSpyPlayersVariance = SteamSpyPlayersVariance;
        this.AchievementCount = AchievementCount;
        this.AchievementHighlightedCount = AchievementHighlightedCount;
        this.ControllerSupport = ControllerSupport;
        this.IsFree = IsFree;
        this.FreeVerAvail = FreeVerAvail;
        this.PurchaseAvail = PurchaseAvail;
        this.SubscriptionAvail = SubscriptionAvail;
        this.PlatformWindows = PlatformWindows;
        this.PlatformLinux = PlatformLinux;
        this.PlatformMac = PlatformMac;
        this.PCReqsHaveMin = PCReqsHaveMin;
        this.PCReqsHaveRec = PCReqsHaveRec;
        this.LinuxReqsHaveMin = LinuxReqsHaveMin;
        this.LinuxReqsHaveRec = LinuxReqsHaveRec;
        this.MacReqsHaveMin = MacReqsHaveMin;
        this.MacReqsHaveRec = MacReqsHaveRec;
        this.CategorySinglePlayer = CategorySinglePlayer;
        this.CategoryMultiplayer = CategoryMultiplayer;
        this.CategoryCoop = CategoryCoop;
        this.CategoryMMO = CategoryMMO;
        this.CategoryInAppPurchase = CategoryInAppPurchase;
        this.CategoryIncludeSrcSDK = CategoryIncludeSrcSDK;
        this.CategoryIncludeLevelEditor = CategoryIncludeLevelEditor;
        this.CategoryVRSupport = CategoryVRSupport;
        this.GenreIsNonGame = GenreIsNonGame;
        this.GenreIsIndie = GenreIsIndie;
        this.GenreIsAction = GenreIsAction;
        this.GenreIsAdventure = GenreIsAdventure;
        this.GenreIsCasual = GenreIsCasual;
        this.GenreIsStrategy = GenreIsStrategy;
        this.GenreIsRPG = GenreIsRPG;
        this.GenreIsSimulation = GenreIsSimulation;
        this.GenreIsEarlyAccess = GenreIsEarlyAccess;
        this.GenreIsFreeToPlay = GenreIsFreeToPlay;
        this.GenreIsSports = GenreIsSports;
        this.GenreIsRacing = GenreIsRacing;
        this.GenreIsMassivelyMultiplayer = GenreIsMassivelyMultiplayer;
        this.PriceCurrency = PriceCurrency;
        this.PriceInitial = PriceInitial;
        this.PriceFinal = PriceFinal;
        this.SupportEmail = SupportEmail;
        this.SupportURL = SupportURL;
        this.AboutText = AboutText;
        this.Background = Background;
        this.ShortDescrip = ShortDescrip;
        this.DetailedDescrip = DetailedDescrip;
        this.DRMNotice = DRMNotice;
        this.ExtUserAcctNotice = ExtUserAcctNotice;
        this.HeaderImage = HeaderImage;
        this.LegalNotice = LegalNotice;
        this.Reviews = Reviews;
        this.SupportedLanguages = SupportedLanguages;
        this.Website = Website;
        this.PCMinReqsText = PCMinReqsText;
        this.PCRecReqsText = PCRecReqsText;
        this.LinuxMinReqsText = LinuxMinReqsText;
        this.LinuxRecReqsText = LinuxRecReqsText;
        this.StringMacMinReqsText = StringMacMinReqsText;
        this.MacRecReqsText = MacRecReqsText;
    }

    public String getWebsite() {
        return Website;
    }

    public int getQueryID() {
        return Integer.parseInt(QueryID);
    }

    public String getQueryName() {
        return QueryName;
    }

    public boolean getIsFree() {
        return Boolean.parseBoolean(IsFree);
    }

    public boolean getGenreIsNonGame() {
        return Boolean.parseBoolean(GenreIsNonGame);
    }

    public boolean getGenreIsFreeToPlay() {
        return Boolean.parseBoolean(GenreIsFreeToPlay);
    }
    public boolean getGenreIsIndie() {
        return Boolean.parseBoolean(GenreIsIndie);
    }
    public boolean getGenreIsAction() {
        return Boolean.parseBoolean(GenreIsAction);
    }
    public boolean getGenreIsAdventure() {
        return Boolean.parseBoolean(GenreIsAdventure);
    }
    public boolean getGenreIsCasual() {
        return Boolean.parseBoolean(GenreIsCasual);
    }
    public boolean getGenreIsStrategy() {
        return Boolean.parseBoolean(GenreIsStrategy);
    }
    public boolean getGenreIsRPG() {
        return Boolean.parseBoolean(GenreIsRPG);
    }
    public boolean getGenreIsSimulation() {
        return Boolean.parseBoolean(GenreIsSimulation);
    }
    public boolean getGenreIsEarlyAccess() {
        return Boolean.parseBoolean(GenreIsEarlyAccess);
    }
    public boolean getGenreIsSports() {
        return Boolean.parseBoolean(GenreIsSports);
    }
    public boolean getGenreIsRacing() {
        return Boolean.parseBoolean(GenreIsRacing);
    }
    public boolean getGenreIsMassivelyMultiplayer() {
        return Boolean.parseBoolean(GenreIsMassivelyMultiplayer);
    }
}
