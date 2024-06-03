package com.example.lucky_tiger;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PreventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prevent);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView largeTextView = findViewById(R.id.large_text_view4);

        // 设置大段文本内容
        String largeText = "随着社会不断发展和进步,人们的生活节奏越来越快,导致患上心理疾病的人越来越多。那我们就要注意了解如何预防心理疾病带来的危害，保持心理健康，以下是保持心理健康的六个方法"
                + "\n\nl.增强自己对事物与人的能力，遇事泰然处之。要清醒的状态下地认识自己由旺盛走向衰老直至消亡，这是不可能违抗的自然现象。作为人们应该养成乐观、豁达的个性，平静地接受生理上出现的种种变化，然后调整自己的生"
                + "\n\n2.尽力寻找情绪体验的机会。一是多想想你所从事的事业，时时不忘创新，做出新的成绩，跃上新的台阶;再者要关心他人，与亲朋、同事同甘共苦，无论悲欢、离合，都是对心理的撼动，它会使人头脑清醒，心胸开阔;三是多参加公益活动，乐善好施，为子孙造福。最好是学会一门艺术，无论唱歌弹琴，写作绘画，集邮藏币，都会使你进入一种新的境界，产生新的追求，在你的爱好之中寻找乐趣。"
                + "\n\n3.保护心理宁静。面对大量的信息不要紧张不安、焦急烦躁。手足无措，保持心情宁静，学会吸收现代科学信息的方法，提高应变能力。最后，要尽量多地设想出获取它们的可行途径，并选择一个最佳方案行动，从而减轻个人的心理负担，又能收到事半功倍之效。"
                + "\n\n4.适当变换环境。一个人在一个缺乏竞争的环境里容易滋生惰性，不求有功但求无过，过于安逸的环境反而更易引发心理失衡。而新的环境，接受具有挑战性的工作、生活，可激发人的潜能与活力，变换环境进而变换心境，使自己始终保持健康向上的心理，避免心理失衡。"
                + "\n\n5.要合理安排自己的生活习惯，培养多方面的娱乐兴趣。人在无聊的时候经常胡思乱想，所以更需要合理地安排工作与生活。适度调节紧张工作带来的压力，也可以避免心理上滋生压力感，让生活更加充实，让充实的生活改变人的抑郁心理。同时，要培养多样化的兴趣。爱好广泛者总觉得时间不够用，生活丰富多彩就能驱散不健康的情绪，并可增强生命的活力，令人生更有意义。"
                + "\n\n6.正确认识自知与社会的关系。要根据社会的要求，随时调整自己的意识和行为，使之更符合社会规范。要摆正个人与集体、个人与社会的关系，正确对待个人得失、成功与失败。这样，就可以减少心理失衡。"
                 +"\n\n保证心理健康对于个人的长期发展十分重要，一个人的健康包括了生理健康和心理健康，人们往往更加留意更加明显的生理健康，而忽视心理健康。但其实随着社会的发展，心理上的健康也越来越值得我们重视";

        // 设置文本到TextView
        largeTextView.setText(largeText);
    }
}