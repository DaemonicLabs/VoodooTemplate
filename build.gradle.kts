plugins {
    // kotlin("jvm") version "1.3.70" // automatically applied
    // idea // automatically applied
    id("voodoo") version "0.5.1-SNAPSHOT"
}

voodoo {
    addTask("build") {
        build()
    }
    addTask(name = "changelog") {
        changelog()
    }
    addTask(name = "pack_exp") {
        pack().experimental()
    }
    addTask(name = "pack_mmc-exp") {
        pack().multimcExperimental()
    }
    addTask(name = "pack_mmc-fat") {
        pack().multimcFat()
    }
    addTask(name = "pack_server") {
        pack().server()
    }
    addTask(name = "test_mmc") {
        test().multimc()
    }
    addTask(name = "pack_all") {
        pack().server()
        pack().experimental()
        pack().multimcExperimental()
        pack().multimcFat()
    }

//    generateCurseforgeMods("Mod", "1.12", "1.12.1", "1.12.2")
    generateCurseforgeMods("Mod", "1.15", "1.15.1", "1.15.2", categories = listOf("Fabric"))
    generateCurseforgeTexturepacks("TexturePack", "1.15", "1.15.1", "1.15.2")
    generateForge("Forge", "1.12.2")
    generateFabric("Fabric", stable = true)
}