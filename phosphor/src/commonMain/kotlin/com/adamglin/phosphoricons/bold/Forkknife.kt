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

public val BoldGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 88.0f)
                verticalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(220.0f, 40.0f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(180.0f)
                horizontalLineTo(152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                arcToRelative(273.23f, 273.23f, 0.0f, false, true, 7.33f, -57.82f)
                curveTo(157.42f, 68.42f, 176.76f, 40.33f, 203.27f, 29.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 40.0f)
                close()
                moveTo(196.0f, 62.92f)
                curveTo(182.6f, 77.0f, 175.0f, 98.0f, 170.77f, 115.38f)
                arcTo(254.41f, 254.41f, 0.0f, false, false, 164.55f, 156.0f)
                horizontalLineTo(196.0f)
                close()
                moveTo(128.0f, 39.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 41.0f)
                lineToRelative(4.0f, 47.46f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                lineTo(56.0f, 41.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 32.0f, 39.0f)
                lineTo(28.0f, 87.0f)
                curveToRelative(0.0f, 0.34f, 0.0f, 0.67f, 0.0f, 1.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, 40.0f, 50.59f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(138.59f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 132.0f, 88.0f)
                curveToRelative(0.0f, -0.33f, 0.0f, -0.66f, 0.0f, -1.0f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
