package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 48.0f)
                close()
                moveTo(224.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                lineTo(32.0f, 64.0f)
                lineTo(224.0f, 64.0f)
                lineTo(224.0f, 192.0f)
                close()
                moveTo(118.93f, 151.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 116.0f, 162.64f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -69.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 13.85f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 41.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 118.93f, 151.71f)
                close()
                moveTo(198.93f, 151.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 162.64f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -69.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 13.85f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 41.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 198.93f, 151.71f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
