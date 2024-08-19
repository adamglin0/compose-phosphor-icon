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

public val BoldGroup.`Star-four-bold`: ImageVector
    get() {
        if (`_star-four-bold` != null) {
            return `_star-four-bold`!!
        }
        `_star-four-bold` = Builder(name = "Star-four-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.86f, 109.25f)
                lineTo(169.18f, 86.82f)
                lineTo(146.75f, 25.14f)
                arcToRelative(19.95f, 19.95f, 0.0f, false, false, -37.5f, 0.0f)
                lineTo(86.82f, 86.82f)
                lineTo(25.14f, 109.25f)
                arcToRelative(19.95f, 19.95f, 0.0f, false, false, 0.0f, 37.5f)
                lineToRelative(61.68f, 22.43f)
                lineToRelative(22.43f, 61.68f)
                arcToRelative(19.95f, 19.95f, 0.0f, false, false, 37.5f, 0.0f)
                lineToRelative(22.43f, -61.68f)
                lineToRelative(61.68f, -22.43f)
                arcToRelative(19.95f, 19.95f, 0.0f, false, false, 0.0f, -37.5f)
                close()
                moveTo(155.72f, 148.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.18f, 7.18f)
                lineTo(128.0f, 212.21f)
                lineToRelative(-20.54f, -56.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.18f, -7.18f)
                lineTo(43.79f, 128.0f)
                lineToRelative(56.49f, -20.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.18f, -7.18f)
                lineTo(128.0f, 43.79f)
                lineToRelative(20.54f, 56.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.18f, 7.18f)
                lineTo(212.21f, 128.0f)
                close()
            }
        }
        .build()
        return `_star-four-bold`!!
    }

private var `_star-four-bold`: ImageVector? = null
