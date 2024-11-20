package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 104.0f)
                lineTo(40.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(32.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(48.0f, 76.69f)
                lineTo(62.63f, 62.06f)
                arcTo(95.43f, 95.43f, 0.0f, false, true, 130.0f, 33.94f)
                horizontalLineToRelative(0.53f)
                arcToRelative(95.36f, 95.36f, 0.0f, false, true, 67.07f, 27.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.18f, 11.44f)
                arcToRelative(79.52f, 79.52f, 0.0f, false, false, -55.89f, -22.77f)
                horizontalLineToRelative(-0.45f)
                arcTo(79.56f, 79.56f, 0.0f, false, false, 73.94f, 73.37f)
                lineTo(59.31f, 88.0f)
                lineTo(88.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(216.0f, 152.0f)
                lineTo(168.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(28.69f)
                lineToRelative(-14.63f, 14.63f)
                arcToRelative(79.56f, 79.56f, 0.0f, false, true, -56.13f, 23.43f)
                horizontalLineToRelative(-0.45f)
                arcToRelative(79.52f, 79.52f, 0.0f, false, true, -55.89f, -22.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.18f, 11.44f)
                arcToRelative(95.36f, 95.36f, 0.0f, false, false, 67.07f, 27.33f)
                lineTo(126.0f, 222.06f)
                arcToRelative(95.43f, 95.43f, 0.0f, false, false, 67.36f, -28.12f)
                lineTo(208.0f, 179.31f)
                lineTo(208.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(224.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
