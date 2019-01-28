package modules;

import core.buffers.MeshVBO;
import core.model.Mesh;
import core.utils.objloader.OBJLoader;

public class Skydome {

	public Skydome() {

		Mesh mesh = new OBJLoader().load("./res/models/dome", "dome.obj", null)[0].getMesh();
		MeshVBO meshBuffer = new MeshVBO();
		meshBuffer.allocate(mesh);
		System.out.println("ree");
	}
}
