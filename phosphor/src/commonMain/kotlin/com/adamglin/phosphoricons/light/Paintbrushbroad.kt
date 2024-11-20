package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) {
            return _paintBrushBroad!!
        }
        _paintBrushBroad = Builder(name = "PaintBrushBroad", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 26.0f)
                horizontalLineTo(72.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 34.0f, 64.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.23f)
                lineTo(98.08f, 207.0f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, false, -0.08f, 1.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, false, -0.08f, -1.0f)
                lineTo(150.0f, 160.23f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.23f)
                horizontalLineToRelative(48.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineTo(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 26.0f)
                close()
                moveTo(72.0f, 38.0f)
                horizontalLineTo(178.0f)
                verticalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(38.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(68.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(64.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 72.0f, 38.0f)
                close()
                moveTo(200.0f, 146.0f)
                horizontalLineTo(152.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.86f, 16.0f)
                lineToRelative(0.0f, 0.15f)
                lineTo(146.0f, 208.47f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineToRelative(7.82f, -46.34f)
                lineToRelative(0.0f, -0.15f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 104.0f, 146.0f)
                horizontalLineTo(56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                verticalLineTo(118.0f)
                horizontalLineTo(210.0f)
                verticalLineToRelative(18.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 200.0f, 146.0f)
                close()
            }
        }
        .build()
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
