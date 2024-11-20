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

public val DuotoneGroup.HandPointing: ImageVector
    get() {
        if (_handPointing != null) {
            return _handPointing!!
        }
        _handPointing = Builder(name = "HandPointing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 116.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f)
                curveToRelative(-44.18f, 0.0f, -55.81f, -24.0f, -93.32f, -90.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.64f, -20.0f)
                lineTo(96.0f, 152.0f)
                verticalLineTo(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 88.0f)
                arcToRelative(27.86f, 27.86f, 0.0f, false, false, -13.35f, 3.39f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 144.0f, 74.7f)
                lineTo(144.0f, 44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(80.0f)
                lineToRelative(-3.82f, -6.13f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 35.73f, 146.0f)
                lineToRelative(4.67f, 8.23f)
                curveTo(74.81f, 214.89f, 89.05f, 240.0f, 136.0f, 240.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f)
                lineTo(224.0f, 116.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 196.0f, 88.0f)
                close()
                moveTo(208.0f, 152.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, 72.0f)
                curveToRelative(-37.63f, 0.0f, -47.84f, -18.0f, -81.68f, -77.68f)
                lineToRelative(-4.69f, -8.27f)
                lineToRelative(0.0f, -0.05f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 54.0f, 121.61f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, true, 6.0f, -1.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.41f, 6.0f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, 0.14f, 0.23f)
                lineToRelative(18.67f, 30.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 152.0f)
                lineTo(104.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(144.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
