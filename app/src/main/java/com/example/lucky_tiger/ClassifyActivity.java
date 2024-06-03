package com.example.lucky_tiger;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ClassifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_classify);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView largeTextView = findViewById(R.id.large_text_view2);

        String largeText = "现代人的生活节奏越来越快，各种心理疾病频发。网易APP经过了多方面的数据收集，总结了八种常见的心理疾病。"
                + "\n\n1 抑郁症"
                + "\n\n近年来抑郁症收到越来越多的关注，尤其是高校学生的抑郁症比例越来越高，也有不少学者开展了关于高校学生抑郁症情况的研究。抑郁症主要表现为持续的心情低落，怎么都高兴不起来，对任何事物都不感兴趣，思维缓慢，反应迟钝，容易疲劳，失眠、食欲下降，严重时感觉自己的存在没有价值，像被抛弃的孩子一样，躲在黑暗的角落里，可能会出现自杀念头。"
                + "\n\n2 焦虑症"
                + "\n\n焦虑症的种类比较多，包括广泛性焦虑症（对很多事情都感到焦虑）和特定情况的焦虑症，如社交焦虑、分离焦虑、广场恐怖症、惊恐发作等。虽然焦虑的对象不同，但症状表现类似，主要为对将要发生的事情感到过分的担忧，焦虑不安，甚至出现一些躯体症状，如心慌、出汗、尿频等。"
                + "\n\n3 强迫症"
                + "\n\n强迫症是以同时存在强迫观念和强迫行为为特征的神经症。患者存在某种刻板行为，如反复洗手、检查门锁等，如果不做这些行为就会一直担心发生不好的事情。患者通常知道自己的行为不太正常，有反强迫的冲动，但是完全控制不住自己，因此感到十分痛苦。"
                + "\n\n4 精神分裂症"
                + "\n\n精神分裂症是一种较为严重的精神疾病，症状表现也比较复杂，核心症状为思维障碍，即思维的连贯性和逻辑性出现问题，最常见的是妄想；其次为感知觉障碍，主要表现为幻听、幻视等，还可能出现情感障碍和意志行为障碍，情感淡漠，活动减少，孤僻、喜欢独处。"
                + "\n\n5 自闭症"
                + "\n\n又称孤独症，通常在婴幼儿期发病，是一种广泛性发展障碍，症状表现多种多样。自闭症患儿常被称为“来自星星的孩子”，因为他们的眼睛像星星一样纯净，但是他们听不懂我们的话，不能像普通孩子一样和我们互动，喜欢的东西也比较特别，如转动的风车、电扇等，行为模式比较刻板，不喜欢改变。"
                + "\n\n6 多动症"
                + "\n\n多动症是儿童常见的心理疾病，主要表现为注意力不集中，容易分心，活动较多，做事拖拉，丢三落四。自控能力差，没有耐心，容易冲动。他们的智力大多处于正常状态，但是由于听课效率差，学业成绩通常也不理想。虽然多动症常见于儿童，但有60%～70%的患者症状会持续到成人阶段，所以要注意尽早治疗。"
                + "\n\n7 人格障碍"
                + "\n\n人格障碍是指人格特征明显偏离正常，常见的有多重人格、反社会人格障碍、表演型人格障碍、分裂型人格障碍等。人格障碍的患者通常不能很好地适应周围环境，社会功能较差，很难与别人建立和谐的人际关系。"
                + "\n\n一般人格障碍者很少主动求医，通常是在社会生活出现冲突时才会想到去找医生。但人格结构是很难改变的，抗精神病药物可以改善患者的情绪和躯体症状，而社会适应问题还需要借助心理治疗。"
                + "\n\n8 厌食症"
                + "\n\n厌食症以青少年女性比较常见，现代社会追求以瘦为美，导致很多女孩过度节食减肥，即使在别人看来已经很瘦了，仍然不想吃饭，担心胖了就不受人喜欢了，逐渐发展为无法进食，严重营养不良。其实厌食症的关键问题不在于吃饭，最应该解决的是心理问题，调整“瘦”与“被喜欢”之间的病态思维。"
                + "\n\n以上为八种常见心理疾病的介绍，但其实在实际生活中，很多疾病的症状可能没有那么典型，具体表现也略有差异。"
                + "\n\n如果发现自己或家人可能患上精神疾病，不要害怕，勇敢地寻求专业医生的帮助，积极治疗，大部分精神疾病都是可以治愈的，一些较为严重的精神疾病也可以通过药物控制病情。";

        // 设置文本到TextView
        largeTextView.setText(largeText);
    }
}