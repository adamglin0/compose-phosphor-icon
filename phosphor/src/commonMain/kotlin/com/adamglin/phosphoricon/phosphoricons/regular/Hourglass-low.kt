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

public val RegularGroup.`Hourglass-low`: ImageVector
    get() {
        if (`_hourglass-low` != null) {
            return `_hourglass-low`!!
        }
        `_hourglass-low` = Builder(name = "Hourglass-low", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 75.64f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                verticalLineTo(76.0f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, false, 6.4f, 12.8f)
                lineTo(114.67f, 128.0f)
                lineTo(62.4f, 167.2f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 56.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(180.36f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, false, -6.35f, -12.76f)
                lineTo(141.27f, 128.0f)
                lineToRelative(52.38f, -39.6f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 200.0f, 75.64f)
                close()
                moveTo(178.23f, 176.0f)
                horizontalLineTo(77.33f)
                lineTo(128.0f, 138.0f)
                close()
                moveTo(72.0f, 216.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(184.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(184.0f, 75.64f)
                lineTo(128.0f, 118.0f)
                lineTo(72.0f, 76.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(184.0f)
                close()
            }
        }
        .build()
        return `_hourglass-low`!!
    }

private var `_hourglass-low`: ImageVector? = null
