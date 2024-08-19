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

public val DuotoneGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.59f, 189.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.12f, -5.06f)
                lineToRelative(-17.42f, 5.81f)
                lineToRelative(-28.9f, -57.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 128.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(104.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(79.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -16.0f, 0.0f)
                verticalLineTo(89.81f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 112.0f, 232.0f)
                curveToRelative(33.52f, 0.0f, 63.69f, -22.71f, 71.75f, -54.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.5f, -4.0f)
                curveTo(162.09f, 198.0f, 137.91f, 216.0f, 112.0f, 216.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 96.0f, 106.34f)
                verticalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(83.05f)
                lineToRelative(29.79f, 59.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.69f, 4.0f)
                lineToRelative(24.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 255.59f, 189.47f)
                close()
                moveTo(88.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 48.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
