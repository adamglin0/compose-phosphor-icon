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

public val LightGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 58.0f)
                lineTo(179.21f, 58.0f)
                lineTo(165.0f, 36.67f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 34.0f)
                lineTo(96.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 2.67f)
                lineTo(76.78f, 58.0f)
                lineTo(48.0f, 58.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(208.0f, 214.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(230.0f, 80.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 208.0f, 58.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(48.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 70.0f)
                lineTo(80.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -2.67f)
                lineTo(99.21f, 46.0f)
                horizontalLineToRelative(57.57f)
                lineTo(171.0f, 67.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 176.0f, 70.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(174.0f, 96.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(144.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(-2.0f, -2.09f)
                arcToRelative(34.12f, 34.12f, 0.0f, false, false, -44.38f, -3.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.22f, -9.59f)
                arcToRelative(46.2f, 46.2f, 0.0f, false, true, 60.14f, 4.27f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.1f, 0.1f)
                lineTo(162.0f, 105.0f)
                lineTo(162.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(156.8f, 156.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.19f, 8.4f)
                arcToRelative(46.18f, 46.18f, 0.0f, false, true, -60.14f, -4.27f)
                lineToRelative(-0.1f, -0.1f)
                lineTo(94.0f, 159.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(82.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(102.0f, 150.0f)
                lineToRelative(2.0f, 2.09f)
                arcToRelative(34.12f, 34.12f, 0.0f, false, false, 44.38f, 3.12f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 156.8f, 156.4f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
