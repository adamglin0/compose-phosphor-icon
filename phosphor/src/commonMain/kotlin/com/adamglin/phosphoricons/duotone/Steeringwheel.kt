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

public val DuotoneGroup.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) {
            return _steeringWheel!!
        }
        _steeringWheel = Builder(name = "SteeringWheel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(222.4f, 145.55f)
                arcTo(96.6f, 96.6f, 0.0f, false, true, 218.54f, 160.0f)
                horizontalLineToRelative(-53.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.5f, 5.19f)
                lineToRelative(-21.9f, 58.47f)
                curveToRelative(-2.69f, 0.22f, -5.41f, 0.34f, -8.15f, 0.34f)
                reflectiveCurveToRelative(-5.5f, -0.12f, -8.2f, -0.35f)
                lineTo(97.94f, 165.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.49f, -5.2f)
                horizontalLineToRelative(-53.0f)
                arcToRelative(96.6f, 96.6f, 0.0f, false, true, -3.86f, -14.45f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, true, 188.8f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(40.0f, 128.0f)
                verticalLineToRelative(0.33f)
                arcToRelative(135.93f, 135.93f, 0.0f, false, true, 176.0f, 0.0f)
                lineTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -176.0f, 0.0f)
                close()
                moveTo(107.5f, 213.58f)
                lineTo(90.45f, 168.0f)
                lineTo(49.63f, 168.0f)
                arcTo(88.35f, 88.35f, 0.0f, false, false, 107.5f, 213.58f)
                close()
                moveTo(128.0f, 216.0f)
                curveToRelative(0.83f, 0.0f, 1.66f, 0.0f, 2.49f, 0.0f)
                lineToRelative(20.07f, -53.57f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, true, 15.0f, -10.39f)
                horizontalLineToRelative(47.12f)
                curveToRelative(0.38f, -1.31f, 0.72f, -2.64f, 1.0f, -4.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, false, false, -171.4f, 0.0f)
                curveToRelative(0.31f, 1.34f, 0.65f, 2.67f, 1.0f, 4.0f)
                lineTo(90.45f, 152.04f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, true, 15.0f, 10.4f)
                lineToRelative(20.0f, 53.56f)
                curveTo(126.31f, 216.0f, 127.15f, 216.0f, 128.0f, 216.0f)
                close()
                moveTo(206.37f, 168.0f)
                lineTo(165.55f, 168.0f)
                lineToRelative(-17.09f, 45.59f)
                arcTo(88.34f, 88.34f, 0.0f, false, false, 206.37f, 168.0f)
                close()
            }
        }
        .build()
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
