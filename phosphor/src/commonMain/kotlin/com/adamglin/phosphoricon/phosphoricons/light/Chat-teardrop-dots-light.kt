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

public val LightGroup.`Chat-teardrop-dots-light`: ImageVector
    get() {
        if (`_chat-teardrop-dots-light` != null) {
            return `_chat-teardrop-dots-light`!!
        }
        `_chat-teardrop-dots-light` = Builder(name = "Chat-teardrop-dots-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 142.0f, 128.0f)
                close()
                moveTo(88.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 88.0f, 118.0f)
                close()
                moveTo(176.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 176.0f, 118.0f)
                close()
                moveTo(230.0f, 124.0f)
                arcToRelative(98.11f, 98.11f, 0.0f, false, true, -98.0f, 98.0f)
                lineTo(48.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(34.0f, 124.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, true, 196.0f, 0.0f)
                close()
                moveTo(218.0f, 124.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, -172.0f, 0.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(84.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 218.0f, 124.0f)
                close()
            }
        }
        .build()
        return `_chat-teardrop-dots-light`!!
    }

private var `_chat-teardrop-dots-light`: ImageVector? = null
