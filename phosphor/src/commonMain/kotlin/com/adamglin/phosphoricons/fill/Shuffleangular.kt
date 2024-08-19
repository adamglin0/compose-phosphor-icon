package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Shuffleangular: ImageVector
    get() {
        if (_shuffleangular != null) {
            return _shuffleangular!!
        }
        _shuffleangular = Builder(name = "Shuffleangular", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 178.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 208.0f)
                lineTo(200.0f, 192.0f)
                lineTo(168.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.51f, -3.35f)
                lineTo(83.88f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(88.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.51f, 3.35f)
                lineTo(172.12f, 176.0f)
                lineTo(200.0f, 176.0f)
                lineTo(200.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                close()
                moveTo(143.0f, 107.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.16f, -1.86f)
                lineToRelative(18.0f, -25.12f)
                lineTo(200.0f, 80.02f)
                lineTo(200.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineToRelative(-24.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 48.0f)
                lineTo(200.0f, 64.0f)
                lineTo(168.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.51f, 3.35f)
                lineTo(141.15f, 95.82f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 143.0f, 107.0f)
                close()
                moveTo(113.0f, 149.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.16f, 1.86f)
                lineTo(83.88f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(88.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.51f, -3.35f)
                lineToRelative(20.34f, -28.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 113.0f, 149.0f)
                close()
            }
        }
        .build()
        return _shuffleangular!!
    }

private var _shuffleangular: ImageVector? = null
