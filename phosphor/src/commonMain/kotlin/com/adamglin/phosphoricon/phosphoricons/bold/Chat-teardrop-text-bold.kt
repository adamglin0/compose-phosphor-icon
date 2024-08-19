package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Chat-teardrop-text-bold`: ImageVector
    get() {
        if (`_chat-teardrop-text-bold` != null) {
            return `_chat-teardrop-text-bold`!!
        }
        `_chat-teardrop-text-bold` = Builder(name = "Chat-teardrop-text-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 108.0f)
                close()
                moveTo(164.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(236.0f, 124.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 132.0f, 228.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 124.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, 208.0f, 0.0f)
                close()
                moveTo(212.0f, 124.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -160.0f, 0.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(80.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, false, 212.0f, 124.0f)
                close()
            }
        }
        .build()
        return `_chat-teardrop-text-bold`!!
    }

private var `_chat-teardrop-text-bold`: ImageVector? = null
