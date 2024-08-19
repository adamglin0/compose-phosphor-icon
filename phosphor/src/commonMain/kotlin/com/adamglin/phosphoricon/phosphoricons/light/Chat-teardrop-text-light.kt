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

public val LightGroup.`Chat-teardrop-text-light`: ImageVector
    get() {
        if (`_chat-teardrop-text-light` != null) {
            return `_chat-teardrop-text-light`!!
        }
        `_chat-teardrop-text-light` = Builder(name = "Chat-teardrop-text-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(68.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 112.0f)
                close()
                moveTo(164.0f, 138.0f)
                lineTo(96.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
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
        return `_chat-teardrop-text-light`!!
    }

private var `_chat-teardrop-text-light`: ImageVector? = null
