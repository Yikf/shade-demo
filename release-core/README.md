1. 这是核心要发布的项目，该项目中原先引入了hive1.2低版本
2. 现在有个需求，该需求依赖hive2.3的包，但是hive1.2与hive2.3之间有冲突

解决方案resolution：
1. 新建一个shade-module，该module没有代码，只有一个依赖hive2.3的pom，并且该pom中加入maven-shade-plugin插件

-- NOTE
为方便起见，以fastjson为例，可参考源代码：release-core