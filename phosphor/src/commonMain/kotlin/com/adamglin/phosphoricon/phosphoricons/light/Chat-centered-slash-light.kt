package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Chat-centered-slash-light`: ImageVector
    get() {
        if (`_chat-centered-slash-light` != null) {
            return `_chat-centered-slash-light`!!
        }
        `_chat-centered-slash-light` = Builder(name = "Chat-centered-slash-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.1f, 6.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(61.59f)
                lineTo(115.84f, 223.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 24.32f, 0.0f)
                lineTo(154.41f, 198.0f)
                horizontalLineToRelative(29.12f)
                lineToRelative(20.0f, 22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(150.93f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.21f, 3.0f)
                lineToRelative(-16.0f, 28.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.48f, 0.0f)
                lineToRelative(-16.0f, -28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.21f, -3.0f)
                lineTo(40.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(52.62f, 54.0f)
                lineToRelative(120.0f, 132.0f)
                close()
                moveTo(230.0f, 56.0f)
                lineTo(230.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(98.52f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f)
                lineTo(216.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_chat-centered-slash-light`!!
    }

private var `_chat-centered-slash-light`: ImageVector? = null
