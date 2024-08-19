package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Chatdots: ImageVector
    get() {
        if (_chatdots != null) {
            return _chatdots!!
        }
        _chatdots = Builder(name = "Chatdots", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 128.0f)
                close()
                moveTo(84.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 84.0f, 118.0f)
                close()
                moveTo(172.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 172.0f, 118.0f)
                close()
                moveTo(230.0f, 64.0f)
                lineTo(230.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(82.23f, 206.0f)
                lineTo(49.07f, 234.64f)
                lineToRelative(-0.06f, 0.05f)
                arcTo(13.87f, 13.87f, 0.0f, false, true, 40.0f, 238.0f)
                arcToRelative(14.11f, 14.11f, 0.0f, false, true, -5.95f, -1.33f)
                arcTo(13.88f, 13.88f, 0.0f, false, true, 26.0f, 224.0f)
                lineTo(26.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f)
                lineTo(216.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 64.0f)
                close()
                moveTo(218.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 224.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.26f, 1.55f)
                lineToRelative(34.82f, -30.08f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 80.0f, 194.0f)
                lineTo(216.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _chatdots!!
    }

private var _chatdots: ImageVector? = null
