package com.example.lucky_tiger;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_age);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView largeTextView = findViewById(R.id.large_text_view5);

        // 设置大段文本内容
        String largeText = "不同年纪的人有各自的心理特征，与此对应的，也有不同的心理健康问题。接下来将介绍不同年龄的人所面对的心理健康问题"
                + "\n\n婴幼儿（0-3岁）"
                + "\n\n常见问题：养育方式不当所带来的心理发育问题，如语言发育慢、怕生人、不合群、易乱发脾气。"
                + "\n\n建议：家长多与孩子说话、多进行情感互动，提供良好的语言环境刺激，尊重和引导孩子识别和表达情绪，培养良好的生活行为习惯，是避免婴幼儿心理、行为出现异常的可行方法。"
                + "\n\n学龄前儿童（4-6岁）"
                + "\n\n常见问题：难以离开家长，过分胆小、紧张，不愿上幼儿园；与同伴相处困难，独来独往、不合群、动则哭闹、发脾气等。"
                + "\n\n建议：鼓励孩子参与同伴游戏、表达情绪体验，多与孩子共同户外运动、家务劳动，培养孩子的独立与合作能力，是避免学龄前儿童精神卫生问题发生的可行方法。"
                + "\n\n学龄儿童和青少年（7-17岁）"
                + "\n\n常见问题：学习问题（如考试焦虑、学习困难）、人际交往问题（如学校适应不良、逃学）、情绪问题、性心理发展问题、行为问题（如恃强凌弱、自我伤害、行事冲动）、网络成瘾、吸烟、饮酒、接触毒品、过度追星、过度节食、厌食和贪食等。"
                + "\n\n建议：构建宽松愉悦的家庭氛围，给予爱与尊重，提供有效的沟通与陪伴；培养孩子运动、艺术等多样的兴趣爱好，提高自信心与建立意义感；提高社会适应能力，是避免学龄儿童和青少年精神卫生问题发生的可行方法。"
                + "\n\n中青年（18-64岁）"
                + "\n\n常见问题：与工作相关的问题，如工作环境适应不良、人际关系紧张、就业和工作压力等带来的问题；与家庭相关的问题，如建立亲密关系受挫、婚姻危机、家庭关系紧张、子女教育问题。"
                + "\n\n建议：构建良好的人际支持网络，合理宣泄不良情绪，如倾诉、运动，培养兴趣爱好；合理饮食、规律作息；坚持学习、尝试接受新事物，是避免中青年精神卫生问题发生的可行方法。"
                + "\n\n老年人（65岁及以上）"
                + "\n\n常见问题：退休、与子女关系、空巢、家庭婚姻变故、躯体疾病等带来抑郁、焦虑、疑病等问题。"
                + "\n\n建议：可以学会寻求亲友的帮助，倾诉自己的真实感受，根据客观现实将期望值调整至合适的程度。子女应多关心父母，给予支持和安慰，鼓励其建立新的人际交往圈、多参加社区和社会活动，学习新知识，拓展兴趣爱好，是避免中老年心理健康问题发生的可行方法。"
                +"\n\n综上所述，心理健康的影响因素随着年龄的增长而不同，人们应该根据自己的实际情况进行针对性地干预与调整。";

        // 设置文本到TextView
        largeTextView.setText(largeText);
    }
}