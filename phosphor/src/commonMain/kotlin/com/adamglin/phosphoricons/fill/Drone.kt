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

public val FillGroup.Drone: ImageVector
    get() {
        if (_drone != null) {
            return _drone!!
        }
        _drone = Builder(name = "Drone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.66f, 77.66f)
                lineTo(160.0f, 107.31f)
                verticalLineToRelative(41.38f)
                lineToRelative(29.66f, 29.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(148.69f, 160.0f)
                lineTo(107.31f, 160.0f)
                lineTo(77.66f, 189.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(96.0f, 148.69f)
                lineTo(96.0f, 107.31f)
                lineTo(66.34f, 77.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 77.66f, 66.34f)
                lineTo(107.31f, 96.0f)
                horizontalLineToRelative(41.38f)
                lineToRelative(29.65f, -29.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(143.38f, 71.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.21f, -4.87f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 35.74f, 35.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 118.0f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, false, 2.67f, -0.46f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -56.16f, -56.16f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 143.38f, 71.54f)
                close()
                moveTo(194.67f, 138.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.34f, 15.08f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -35.74f, 35.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.08f, 5.34f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 56.16f, -56.16f)
                close()
                moveTo(112.67f, 184.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.21f, 4.87f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -35.74f, -35.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.34f, -15.08f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 56.16f, 56.16f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.62f, 184.46f)
                close()
                moveTo(61.38f, 117.54f)
                arcTo(7.86f, 7.86f, 0.0f, false, false, 64.0f, 118.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.67f, -15.54f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 35.74f, -35.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.08f, -5.34f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -56.16f, 56.16f)
                close()
            }
        }
        .build()
        return _drone!!
    }

private var _drone: ImageVector? = null
