package foxQuotes.common;

import java.util.Random;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import foxQuotes.client.JCIRQuote;
import foxQuotes.client.QuoteList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = "fq", name = "Fox-Quotes", version = "1.0.0")
public class FoxQuotes {
    @Instance("fq")
    public static FoxQuotes instance;

    public static Logger tcLog = LogManager.getLogger("Fox-Quotes");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    @EventHandler
    public void load(FMLInitializationEvent event)
    {

    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent evt)
    {
        Random rand = new Random();
        JCIRQuote quoteOfTheDay = QuoteList.getQuotes().get(rand.nextInt(QuoteList.getQuotes().size()));
        tcLog.info(quoteOfTheDay.quote + " -" + quoteOfTheDay.from);
    }
}

