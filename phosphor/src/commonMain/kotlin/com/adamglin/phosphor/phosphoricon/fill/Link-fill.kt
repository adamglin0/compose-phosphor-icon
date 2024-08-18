package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Link-fill`: ImageVector
    get() {
        if (`_link-fill` != null) {
            return `_link-fill`!!
        }
        `_link-fill` = Builder(name = "Link-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(115.7f, 192.49f)
                arcToRelative(43.31f, 43.31f, 0.0f, false, true, -55.0f, -66.43f)
                lineToRelative(25.37f, -25.37f)
                arcToRelative(43.35f, 43.35f, 0.0f, false, true, 61.25f, 0.0f)
                arcToRelative(42.9f, 42.9f, 0.0f, false, true, 9.95f, 15.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.0f, 5.6f)
                arcTo(27.33f, 27.33f, 0.0f, false, false, 97.37f, 112.0f)
                lineTo(72.0f, 137.37f)
                arcToRelative(27.32f, 27.32f, 0.0f, false, false, 34.68f, 41.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 9.0f, 13.21f)
                close()
                moveTo(195.31f, 129.94f)
                lineTo(169.94f, 155.31f)
                arcTo(43.0f, 43.0f, 0.0f, false, true, 139.32f, 168.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(43.35f, 43.35f, 0.0f, false, true, -40.53f, -28.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, -5.6f)
                arcTo(27.35f, 27.35f, 0.0f, false, false, 139.28f, 152.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(27.14f, 27.14f, 0.0f, false, false, 19.32f, -8.0f)
                lineTo(184.0f, 118.63f)
                arcToRelative(27.32f, 27.32f, 0.0f, false, false, -34.68f, -41.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.0f, -13.21f)
                arcToRelative(43.32f, 43.32f, 0.0f, false, true, 55.0f, 66.43f)
                close()
            }
        }
        .build()
        return `_link-fill`!!
    }

private var `_link-fill`: ImageVector? = null
