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

public val BoldGroup.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) {
            return _arrowCounterClockwise!!
        }
        _arrowCounterClockwise = Builder(name = "ArrowCounterClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, -98.66f, 100.0f)
                horizontalLineTo(128.0f)
                arcToRelative(99.39f, 99.39f, 0.0f, false, true, -68.62f, -27.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.48f, -17.45f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -1.57f, -109.0f)
                curveToRelative(-0.13f, 0.13f, -0.25f, 0.25f, -0.39f, 0.37f)
                lineTo(54.89f, 92.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(76.72f)
                lineTo(57.48f, 57.06f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
            }
        }
        .build()
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null
