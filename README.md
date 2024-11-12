一、实验内容
本实验开发了一套天气预报功能App，概要设计如下：
1.基本功能：
1.1显示当天天气预报
1.1.1使用HTTP协议，从天气预报接口获取JSON格式的天气预报数据
1.1.2解析JSON数据，并使用Android多线程将天气数据显示到App上。
1.2显示未来多日或逐时显示天气预报：
1.2.1解析JSON数据，使用自定义适配器以列表的方式显示天气数据。列表中需要有图标，如晴、多云、小雨等图标。
1.2.2点击多日或逐时天气列表项，查看详细天气情况，需要图文方式展示。
1.3按照所在城市显示天气预报：
1.3.1用户可选择城市，并切换到被选择城市的天气预报。
1.3.2根据定位，自动切换到所在城市的天气预报。
二 拓展需求：
APP设计时需考虑到延展性、兼容性、可用性、通用性、健壮性，不仅能满足现有需要，也要适应未来发展的能力。
1.4适应健壮性，APP应充分考虑运行期间的各种异常情况并加以处理，保证运行时不出现异常或业务逻辑错误等重大问题
2.2适应可用行，App应界面美观，使用方便快捷，充分考虑用户的体验感受。


三、实验环境
集成开发工具： AndroidStudio
操作系统：Windows 10

四、实验过程与分析
4.1创建项目并配置环境
在Android Studio中创建一个新的项目，配置必要的依赖项，如Gson和Retrofit。数据源：天气预报API。本实验使用万维易源天气预报API
![image](https://github.com/user-attachments/assets/54534bf3-740c-4c4b-9ba8-de9ed71558ae)
![image](https://github.com/user-attachments/assets/3ca73d15-e7c7-46cd-8e40-d58b8cef6e93)



在AndroidManifest.xml中注册所需的权限和Activity。
![image](https://github.com/user-attachments/assets/02e2ecdc-fb38-4d9c-9ac2-f7a6edee891f)


4.2 设计UI布局
创建主界面的布局文件activity_main.xml，包含城市选择的Spinner、显示当前天气的TextView和两个RecyclerView用于显示未来天气和小时天气。
![image](https://github.com/user-attachments/assets/1509c1ae-6cfd-47ec-9bd4-9415bde0cf57)

创建未来天气和小时天气的布局文件recycle_future_layout.xml和recycle_hour_layout.xml。
![image](https://github.com/user-attachments/assets/d1e94387-584d-4220-9f4e-bdf31f070702)
![image](https://github.com/user-attachments/assets/1cd27fe2-8f3d-41c3-93ba-1b535ad1b0c6)




4.3实现数据模型
定义数据模型类，以便解析从API获取的JSON数据。
![image](https://github.com/user-attachments/assets/1c941355-2ce7-41ab-a6d9-86cc17d7dcc6)


4.4实现网络请求
使用Retrofit进行网络请求，获取天气数据。
![image](https://github.com/user-attachments/assets/6b7aa186-2408-47bd-99d6-56b928cc2406)

解析获取的JSON数据并转换为数据模型对象。
![image](https://github.com/user-attachments/assets/9e514477-5c33-4251-91e0-ada6ead0b587)

4.5实现适配器
实现FutureWeatherAdapter和HourWeatherAdapter，用于将天气数据绑定到RecyclerView上显示。
![image](https://github.com/user-attachments/assets/2687709e-b692-4ca4-ab09-1699b771ce5b)
![image](https://github.com/user-attachments/assets/90502273-0f87-40ec-836e-c34a16725c17)



4.6处理用户交互
在主Activity中初始化UI控件，并设置城市选择Spinner的监听器。
![image](https://github.com/user-attachments/assets/cf6ec13b-f233-4e12-bd1e-9fb81b1ecc38)

用户选择城市后，通过后台线程，获取该城市的天气数据，并使用Handler更新UI。

4.7数据分析
当前天气数据：通过API获取并解析当前天气数据，显示在主界面上，包括温度、风力、风向和空气指数。
未来天气预报：将未来7天的天气数据通过FutureWeatherAdapter显示在RecyclerView上。
逐小时天气预报：将逐小时的天气数据通过HourWeatherAdapter显示在RecyclerView上。
![image](https://github.com/user-attachments/assets/91515db9-1174-40cd-b6be-b1b0a9106cb7)
![image](https://github.com/user-attachments/assets/67d7dbfd-f949-440a-a224-a26ad7bfd675)




五、实验创新点
实时数据更新：通过使用Retrofit进行网络请求，实现了天气数据的实时更新。
多种视图显示：实验中使用了多个RecyclerView，分别显示未来7天的天气预报和逐小时的天气预报，提高了数据展示的多样性和用户体验。
高效数据解析：使用Gson库进行JSON数据解析，提高了数据处理的效率和可靠性。
响应式设计：界面设计采用了响应式布局，能够适应不同屏幕尺寸和分辨率的设备。
