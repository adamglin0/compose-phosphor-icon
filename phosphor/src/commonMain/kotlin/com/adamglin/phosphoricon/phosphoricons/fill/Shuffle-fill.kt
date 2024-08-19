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

public val FillGroup.`Shuffle-fill`: ImageVector
    get() {
        if (`_shuffle-fill` != null) {
            return `_shuffle-fill`!!
        }
        `_shuffle-fill` = Builder(name = "Shuffle-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 178.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 208.0f)
                lineTo(200.0f, 192.0f)
                arcToRelative(72.15f, 72.15f, 0.0f, false, true, -57.65f, -30.14f)
                lineToRelative(-41.72f, -58.4f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 55.06f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(55.06f, 64.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, true, 58.59f, 30.15f)
                lineToRelative(41.72f, 58.4f)
                arcTo(56.08f, 56.08f, 0.0f, false, false, 200.0f, 176.0f)
                lineTo(200.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                close()
                moveTo(143.0f, 107.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.16f, -1.86f)
                lineToRelative(1.2f, -1.67f)
                arcTo(56.08f, 56.08f, 0.0f, false, true, 200.0f, 80.0f)
                lineTo(200.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineToRelative(-24.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 48.0f)
                lineTo(200.0f, 64.0f)
                arcToRelative(72.15f, 72.15f, 0.0f, false, false, -57.65f, 30.14f)
                lineToRelative(-1.2f, 1.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 143.0f, 107.0f)
                close()
                moveTo(113.0f, 149.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.16f, 1.86f)
                lineToRelative(-1.2f, 1.67f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 55.06f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(55.06f, 192.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, false, 58.59f, -30.15f)
                lineToRelative(1.2f, -1.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 113.0f, 149.0f)
                close()
            }
        }
        .build()
        return `_shuffle-fill`!!
    }

private var `_shuffle-fill`: ImageVector? = null
