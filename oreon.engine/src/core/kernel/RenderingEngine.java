package core.kernel;

import core.kernel.Window;
import modules.sky.Skydome;
import modules.terrain.Terrain;
import core.configs.Default;
import core.kernel.Camera;

/**
 * 
 * @author oreon3D
 * The RenderingEngine manages the render calls of all 3D entities
 * with shadow rendering and post processing effects
 *
 */
public class RenderingEngine {
	
	private Window window;
	
	//Instances of what to render
	private Skydome skydome;
	private Terrain terrain;
	
	public RenderingEngine()
	{
		//instantiate here
		window = Window.getInstance();
		skydome = new Skydome();
		terrain = new Terrain();
	}
	
	public void init()
	{
		window.init();
		terrain.init("./res/settings/terrain_settings.txt");
	}

	public void render()
	{	
		// Call render methods
		Camera.getInstance().update();
		
		Default.clearScreen();
		
		skydome.render();
		
		terrain.updateQuadtree();
		terrain.render();
		
		// draw into OpenGL window
		window.render();
	}
	
	public void update(){}
	
	public void shutdown(){}
}
