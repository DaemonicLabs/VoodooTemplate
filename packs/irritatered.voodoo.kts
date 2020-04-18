import newformat.builder.FnPatternList

mcVersion = "1.15.2"
title = "Rename_me"
authors = listOf("nikky")
modloader {
  fabric(Fabric.intermediary.v_1_15_2)
}

pack {
  multimc {
    // path tp the published modpack definition (not sk always)
    selfupdateUrl = "path/to/upload-location/irritatered.json"
  }
  experimental {
    // add files that users should be able to modify here
    userFiles = FnPatternList(
            include = listOf("servers.dat")
    )
  }
}

root<Curse> {
  // this sets all children elements to only look for more stable files on curseforge
  releaseTypes = setOf(FileType.Release, FileType.Beta)
  it.list {
    // content
    +Mod.lilTater
    +Mod.campanion
    +Mod.dihydrogenMonoxideReloaded

    // because i love you
    // also this is how you add stuff from direct urls
    withTypeClass(Direct::class) {
      // this makes voodoo NOT download from the original location
      useUrlTxt = false
    }.list {
      +"compuGlobalHyperMeganet" {
        url = "https://github.com/immibis/modfest2/releases/download/v1.0.1-modfest/compuglobalhypermeganet-SayNoToBeesYesToSylladices-1.0.1.jar"
        description = "Makes it painful to use your inventory"
      }
    }

    withTypeClass(Jenkins::class){
    }.list {
      +"drones" {
        jenkinsUrl = "https://ci.dblsaiko.net"
        job = "drones"
      }
    }

    //optional mods
    group {
      optional {
        selected = false
      }
    }.list {
      +Mod.retino {
        description = "Fixes issues with retina display on Mac. Don't use otherwise."
      }
      +Mod.minihud {
        description = "Displays server TPS and MSPT. Helpful for debugging."
      }
    }
  }
}
