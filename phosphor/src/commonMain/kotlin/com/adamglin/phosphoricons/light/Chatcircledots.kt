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

public val LightGroup.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) {
            return _chatCircleDots!!
        }
        _chatCircleDots = Builder(name = "ChatCircleDots", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 79.31f, 217.65f)
                lineTo(44.44f, 229.27f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -17.71f, -17.71f)
                lineToRelative(11.62f, -34.87f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 230.0f, 128.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcTo(90.0f, 90.0f, 0.0f, true, false, 50.08f, 173.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.5f, 4.91f)
                lineTo(38.12f, 215.35f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.53f, 2.53f)
                lineTo(78.0f, 205.42f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 1.9f, -0.31f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, true, 3.0f, 0.81f)
                arcTo(90.0f, 90.0f, 0.0f, false, false, 218.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
