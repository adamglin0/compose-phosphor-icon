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

public val DuotoneGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.0f, 88.0f)
                lineToRelative(32.0f, 80.0f)
                curveToRelative(0.0f, 17.67f, -20.0f, 24.0f, -32.0f, 24.0f)
                reflectiveCurveToRelative(-32.0f, -6.33f, -32.0f, -24.0f)
                close()
                moveTo(200.0f, 56.0f)
                lineToRelative(-32.0f, 80.0f)
                curveToRelative(0.0f, 17.67f, 20.0f, 24.0f, 32.0f, 24.0f)
                reflectiveCurveToRelative(32.0f, -6.33f, 32.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.43f, 133.0f)
                lineToRelative(-32.0f, -80.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.16f, -4.84f)
                lineTo(136.0f, 62.0f)
                lineTo(136.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 65.58f)
                lineTo(54.26f, 80.19f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.57f, 85.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.06f)
                lineTo(16.57f, 165.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, 3.0f)
                curveToRelative(0.0f, 23.31f, 24.54f, 32.0f, 40.0f, 32.0f)
                reflectiveCurveToRelative(40.0f, -8.69f, 40.0f, -32.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, -3.0f)
                lineTo(66.92f, 93.77f)
                lineTo(120.0f, 82.0f)
                lineTo(120.0f, 208.0f)
                lineTo(104.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 208.0f)
                lineTo(136.0f, 78.42f)
                lineTo(187.0f, 67.1f)
                lineTo(160.57f, 133.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, 3.0f)
                curveToRelative(0.0f, 23.31f, 24.54f, 32.0f, 40.0f, 32.0f)
                reflectiveCurveToRelative(40.0f, -8.69f, 40.0f, -32.0f)
                arcTo(7.92f, 7.92f, 0.0f, false, false, 239.43f, 133.0f)
                close()
                moveTo(56.0f, 184.0f)
                curveToRelative(-7.53f, 0.0f, -22.76f, -3.61f, -23.93f, -14.64f)
                lineTo(56.0f, 109.54f)
                lineToRelative(23.93f, 59.82f)
                curveTo(78.76f, 180.39f, 63.53f, 184.0f, 56.0f, 184.0f)
                close()
                moveTo(200.0f, 152.0f)
                curveToRelative(-7.53f, 0.0f, -22.76f, -3.61f, -23.93f, -14.64f)
                lineTo(200.0f, 77.54f)
                lineToRelative(23.93f, 59.82f)
                curveTo(222.76f, 148.39f, 207.53f, 152.0f, 200.0f, 152.0f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null
