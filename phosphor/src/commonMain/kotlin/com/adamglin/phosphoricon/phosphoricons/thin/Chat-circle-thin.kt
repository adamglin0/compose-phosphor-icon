package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Chat-circle-thin`: ImageVector
    get() {
        if (`_chat-circle-thin` != null) {
            return `_chat-circle-thin`!!
        }
        `_chat-circle-thin` = Builder(name = "Chat-circle-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 40.53f, 176.5f)
                lineToRelative(-11.9f, 35.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.18f, 15.18f)
                lineToRelative(35.69f, -11.9f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -46.07f, -12.35f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, -2.0f, -0.54f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -1.27f, 0.21f)
                lineTo(41.28f, 219.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.06f, -5.06f)
                lineToRelative(12.46f, -37.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.33f, -3.27f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return `_chat-circle-thin`!!
    }

private var `_chat-circle-thin`: ImageVector? = null
