package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Hourglass-medium-fill`: ImageVector
    get() {
        if (`_hourglass-medium-fill` != null) {
            return `_hourglass-medium-fill`!!
        }
        `_hourglass-medium-fill` = Builder(name = "Hourglass-medium-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 75.64f)
                lineTo(200.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 76.0f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, false, 6.4f, 12.8f)
                lineTo(114.67f, 128.0f)
                lineTo(62.4f, 167.2f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 56.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(200.0f, 180.36f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, -6.35f, -12.77f)
                lineTo(141.27f, 128.0f)
                lineToRelative(52.38f, -39.59f)
                arcTo(16.09f, 16.09f, 0.0f, false, false, 200.0f, 75.64f)
                close()
                moveTo(184.0f, 180.36f)
                lineTo(184.0f, 216.0f)
                lineTo(72.0f, 216.0f)
                lineTo(72.0f, 180.0f)
                lineToRelative(48.0f, -36.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 144.08f)
                close()
                moveTo(184.0f, 75.64f)
                lineTo(178.23f, 80.0f)
                lineTo(77.33f, 80.0f)
                lineTo(72.0f, 76.0f)
                lineTo(72.0f, 40.0f)
                lineTo(184.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_hourglass-medium-fill`!!
    }

private var `_hourglass-medium-fill`: ImageVector? = null
