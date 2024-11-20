package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.HandEye: ImageVector
    get() {
        if (_handEye != null) {
            return _handEye!!
        }
        _handEye = Builder(name = "HandEye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 88.0f)
                arcToRelative(27.75f, 27.75f, 0.0f, false, false, -12.0f, 2.71f)
                lineTo(176.0f, 60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -41.36f, -24.6f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 44.0f)
                verticalLineToRelative(6.71f)
                arcTo(27.75f, 27.75f, 0.0f, false, false, 68.0f, 48.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 40.0f, 76.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                lineTo(216.0f, 116.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 188.0f, 88.0f)
                close()
                moveTo(200.0f, 152.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -144.0f, 0.0f)
                lineTo(56.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(96.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(140.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 168.0f)
                close()
                moveTo(128.0f, 128.0f)
                curveToRelative(-36.52f, 0.0f, -54.41f, 34.94f, -55.16f, 36.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 7.16f)
                curveTo(73.59f, 173.06f, 91.48f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(54.41f, -34.94f, 55.16f, -36.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -7.16f)
                curveTo(182.41f, 162.94f, 164.52f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(128.0f, 192.0f)
                curveToRelative(-20.63f, 0.0f, -33.8f, -16.52f, -38.7f, -24.0f)
                curveToRelative(4.9f, -7.48f, 18.07f, -24.0f, 38.7f, -24.0f)
                reflectiveCurveToRelative(33.81f, 16.53f, 38.7f, 24.0f)
                curveTo(161.8f, 175.48f, 148.63f, 192.0f, 128.0f, 192.0f)
                close()
            }
        }
        .build()
        return _handEye!!
    }

private var _handEye: ImageVector? = null
