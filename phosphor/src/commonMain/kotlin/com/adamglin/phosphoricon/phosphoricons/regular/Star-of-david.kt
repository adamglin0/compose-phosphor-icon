package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Star-of-david`: ImageVector
    get() {
        if (`_star-of-david` != null) {
            return `_star-of-david`!!
        }
        `_star-of-david` = Builder(name = "Star-of-david", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.21f, 128.0f)
                lineTo(231.0f, 76.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 64.0f)
                lineTo(164.65f, 64.0f)
                lineTo(135.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.9f, 0.0f)
                lineTo(91.33f, 64.0f)
                lineTo(32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.95f, 12.0f)
                lineToRelative(29.72f, 52.0f)
                lineTo(25.05f, 180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.0f, 12.0f)
                lineTo(91.33f, 192.0f)
                lineToRelative(29.72f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.9f, 0.0f)
                lineToRelative(29.7f, -52.0f)
                lineTo(224.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 231.0f, 180.0f)
                close()
                moveTo(210.21f, 80.0f)
                lineTo(192.0f, 111.88f)
                lineTo(173.79f, 80.0f)
                close()
                moveTo(182.79f, 128.0f)
                lineTo(155.37f, 176.0f)
                lineTo(100.62f, 176.0f)
                lineTo(73.2f, 128.0f)
                lineToRelative(27.42f, -48.0f)
                lineToRelative(54.75f, 0.0f)
                close()
                moveTo(128.0f, 32.12f)
                lineTo(146.22f, 64.0f)
                lineTo(109.77f, 64.0f)
                close()
                moveTo(45.78f, 80.0f)
                lineTo(82.19f, 80.0f)
                lineTo(64.0f, 111.88f)
                close()
                moveTo(45.78f, 175.92f)
                lineTo(64.0f, 144.12f)
                lineTo(82.19f, 176.0f)
                close()
                moveTo(128.0f, 223.88f)
                lineTo(109.77f, 192.0f)
                horizontalLineToRelative(36.45f)
                close()
                moveTo(173.79f, 176.0f)
                lineTo(192.0f, 144.12f)
                lineTo(210.21f, 176.0f)
                close()
            }
        }
        .build()
        return `_star-of-david`!!
    }

private var `_star-of-david`: ImageVector? = null
