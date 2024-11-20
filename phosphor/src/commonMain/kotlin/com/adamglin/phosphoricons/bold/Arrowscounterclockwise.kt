package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 108.0f)
                lineTo(40.0f, 108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 96.0f)
                lineTo(28.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(52.0f, 67.0f)
                lineToRelative(7.8f, -7.8f)
                arcTo(99.42f, 99.42f, 0.0f, false, true, 130.0f, 29.94f)
                horizontalLineToRelative(0.56f)
                arcToRelative(99.38f, 99.38f, 0.0f, false, true, 69.87f, 28.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.78f, 17.16f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -106.84f, 0.63f)
                lineTo(69.0f, 84.0f)
                lineTo(88.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(216.0f, 148.0f)
                lineTo(168.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(19.0f)
                lineToRelative(-7.8f, 7.8f)
                arcToRelative(75.55f, 75.55f, 0.0f, false, true, -53.32f, 22.26f)
                horizontalLineToRelative(-0.43f)
                arcToRelative(75.49f, 75.49f, 0.0f, false, true, -53.09f, -21.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.78f, 17.16f)
                arcToRelative(99.38f, 99.38f, 0.0f, false, false, 69.87f, 28.47f)
                lineTo(126.0f, 226.06f)
                arcToRelative(99.42f, 99.42f, 0.0f, false, false, 70.16f, -29.29f)
                lineTo(204.0f, 189.0f)
                verticalLineToRelative(19.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(228.0f, 160.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 148.0f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
