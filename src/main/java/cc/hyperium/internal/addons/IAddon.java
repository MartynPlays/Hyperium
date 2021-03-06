package cc.hyperium.internal.addons;

/**
 * Interface of which the main class
 * of an Addon must implement
 *
 * @since 1.0
 * @author Kevin Brewster
 */
public interface IAddon {

    /**
     * Invoked once the plugin has successfully loaded
     * {@see cc.hyperium.internal.addons.AddonMinecraftBootstrap#init}
     */
    public void onLoad();

    /**
     * Invoked once the game has been closed
     * this is executed at the start of {@link net.minecraft.client.Minecraft#shutdown}
     */
    public void onClose();


    /**
     * Invoked on debug call. Can be used to add things into crash reports
     *
     * This does not need to be overriden if it's not needed
     */
    public default void sendDebugInfo() { }
}
