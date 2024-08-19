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

public val ThinGroup.`Chat-teardrop-text-thin`: ImageVector
    get() {
        if (`_chat-teardrop-text-thin` != null) {
            return `_chat-teardrop-text-thin`!!
        }
        `_chat-teardrop-text-thin` = Builder(name = "Chat-teardrop-text-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 168.0f, 112.0f)
                close()
                moveTo(164.0f, 140.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 124.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, -96.0f, 96.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 124.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 192.0f, 0.0f)
                close()
                moveTo(220.0f, 124.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -176.0f, 0.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(84.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 220.0f, 124.0f)
                close()
            }
        }
        .build()
        return `_chat-teardrop-text-thin`!!
    }

private var `_chat-teardrop-text-thin`: ImageVector? = null
