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

public val DuotoneGroup.HourglassSimpleLow: ImageVector
    get() {
        if (_hourglassSimpleLow != null) {
            return _hourglassSimpleLow!!
        }
        _hourglassSimpleLow = Builder(name = "HourglassSimpleLow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 216.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineTo(77.87f, 176.0f)
                horizontalLineTo(178.13f)
                lineToRelative(27.51f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 216.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.18f, 196.56f)
                lineTo(139.57f, 128.0f)
                lineToRelative(71.61f, -68.56f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 0.13f, -0.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 32.0f)
                horizontalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 44.69f, 59.31f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, 0.13f, 0.13f)
                lineTo(116.43f, 128.0f)
                lineTo(44.82f, 196.56f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, -0.13f, 0.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 224.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.32f, -27.31f)
                arcTo(1.59f, 1.59f, 0.0f, false, true, 211.18f, 196.56f)
                close()
                moveTo(56.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(158.21f, 168.0f)
                horizontalLineTo(97.79f)
                lineTo(128.0f, 139.08f)
                close()
                moveTo(200.0f, 48.0f)
                lineToRelative(-72.0f, 68.92f)
                lineTo(56.0f, 48.0f)
                close()
                moveTo(56.0f, 208.0f)
                lineToRelative(25.06f, -24.0f)
                horizontalLineToRelative(93.84f)
                lineTo(200.0f, 208.0f)
                close()
            }
        }
        .build()
        return _hourglassSimpleLow!!
    }

private var _hourglassSimpleLow: ImageVector? = null
