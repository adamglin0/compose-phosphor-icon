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

public val LightGroup.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) {
            return _chatCenteredDots!!
        }
        _chatCenteredDots = Builder(name = "ChatCenteredDots", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.0f, 120.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 120.0f)
                close()
                moveTo(84.0f, 110.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 84.0f, 110.0f)
                close()
                moveTo(172.0f, 110.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 172.0f, 110.0f)
                close()
                moveTo(230.0f, 56.0f)
                lineTo(230.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(154.41f, 198.0f)
                lineTo(140.16f, 223.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -24.32f, 0.0f)
                lineTo(101.59f, 198.0f)
                lineTo(40.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(216.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 56.0f)
                close()
                moveTo(218.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(65.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.21f, 3.0f)
                lineToRelative(16.0f, 28.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.48f, 0.0f)
                lineToRelative(16.0f, -28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.21f, -3.0f)
                lineTo(216.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
