package com.ktreus.minecraftrealms.tools;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ShovelBase extends ItemSpade {

	public ShovelBase(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
	}
	public static class ShovelCobalt extends ShovelBase {

		public ShovelCobalt(ToolMaterial material) {
			super(material);
		}

	}
	public static class ShovelEnderCristal extends ShovelBase {

		public ShovelEnderCristal(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class ShovelEndernite extends ShovelBase {

		public ShovelEndernite(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class ShovelMagnetite extends ShovelBase {

		public ShovelMagnetite(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class ShovelNethiron extends ShovelBase {

		public ShovelNethiron(ToolMaterial material) {
			super(material);
		 
		}

	}
	public static class ShovelRagnarite extends ShovelBase {

		public ShovelRagnarite(ToolMaterial material) {
			super(material);
		 
		}

	}
}
