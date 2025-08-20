### Script Template

This repo consists of the following: 
- Gradle config
- .gitignore 
- Basic project setup

### Project Setup
- [ ] update the project name in settings.gradle.kts
- [ ] update the group and version in build.gradle.kts
- [ ] run `./gradlew build` to build the project. The jar file will be also copied to inubot/scripts.
- [ ] optional, assign a shortcut key to build the project.
  - [ ] Open the gradle window, expand tasks, build structures. Then right click on the build task and select: Assign Shortcut.


### Script "completion" checklist

Below is a full list of points that I personally like to go through when developing a high end 
goldfarming script

- [ ] Perform the method optimally
- [ ] Config
- [ ] Banking
  - [ ] Restore prayer and health at bank or PoH pool if applicable
    - [ ] Additionally, overheal at bank if using anglerfish and it benefits the method
- [ ] Death handling
- [ ] Restocking
- [ ] Automatically toggling in game settings (audio, alchemy warning)
  - [ ] Including retry strategies if items take too long to buy or sell
- [ ] Recharging/refilling items (blowpipe, rune pouch, repairing armor if desirable)
- [ ] Bonding
- [ ] If not done via muling - find a way for accs to self sustain supplies/bonds (Typically 
  selling items or alching loot)
- [ ] Selling items if applicable Generally avoid uniques to avoid crashing prices (just mule 
  them!)
- [ ] Muling (typically after a unique item is received, or after X wealth is made)
- [ ] Miscellenous features
  - [ ] Combat style switching for eventual gear progression and stat upgrades
    - Examples
      - If a script is optimal with fang, prioritize 82 attack
      - If you're 82-99-75, switch to training attack and then defence, then switch back to 
        strength when all are 99
  - [ ] World hopping 
    - [ ] Extra world hop configurations (ignore AUS worlds, ignore EU worlds)
- [ ] Discord Webhooks
- [ ] Automatically stopping script if unable to continue (out of coins, can't pay death cost, 
  stuck due to some other issue)