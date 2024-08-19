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

public val ThinGroup.`Chat-teardrop-slash-thin`: ImageVector
    get() {
        if (`_chat-teardrop-slash-thin` != null) {
            return `_chat-teardrop-slash-thin`!!
        }
        `_chat-teardrop-slash-thin` = Builder(name = "Chat-teardrop-slash-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(60.62f, 59.83f)
                arcTo(95.41f, 95.41f, 0.0f, false, false, 36.0f, 124.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(96.34f, 96.34f, 0.0f, false, false, 57.11f, -18.83f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(132.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 124.0f)
                arcTo(87.49f, 87.49f, 0.0f, false, true, 66.0f, 65.77f)
                lineTo(183.7f, 195.21f)
                arcTo(86.92f, 86.92f, 0.0f, false, true, 132.0f, 212.0f)
                close()
                moveTo(228.0f, 124.0f)
                arcToRelative(95.79f, 95.79f, 0.0f, false, true, -13.78f, 49.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.84f, -4.14f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 93.92f, 44.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.46f, -7.21f)
                arcTo(95.0f, 95.0f, 0.0f, false, true, 132.0f, 28.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, true, 228.0f, 124.0f)
                close()
            }
        }
        .build()
        return `_chat-teardrop-slash-thin`!!
    }

private var `_chat-teardrop-slash-thin`: ImageVector? = null
