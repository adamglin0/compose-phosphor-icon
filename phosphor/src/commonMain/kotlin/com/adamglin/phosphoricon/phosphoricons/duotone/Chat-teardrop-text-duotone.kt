package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Chat-teardrop-text-duotone`: ImageVector
    get() {
        if (`_chat-teardrop-text-duotone` != null) {
            return `_chat-teardrop-text-duotone`!!
        }
        `_chat-teardrop-text-duotone` = Builder(name = "Chat-teardrop-text-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 124.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -92.0f, 92.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(124.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 92.0f, -92.0f)
                horizontalLineToRelative(0.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 224.0f, 124.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(68.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 112.0f)
                close()
                moveTo(164.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(232.0f, 124.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 132.0f, 224.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 200.0f, 0.0f)
                close()
                moveTo(216.0f, 124.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f)
                verticalLineToRelative(84.0f)
                horizontalLineToRelative(84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 216.0f, 124.0f)
                close()
            }
        }
        .build()
        return `_chat-teardrop-text-duotone`!!
    }

private var `_chat-teardrop-text-duotone`: ImageVector? = null
