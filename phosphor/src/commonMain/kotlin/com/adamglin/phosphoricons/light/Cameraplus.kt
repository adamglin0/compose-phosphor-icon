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

public val LightGroup.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) {
            return _cameraPlus!!
        }
        _cameraPlus = Builder(name = "CameraPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 142.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 142.0f)
                lineTo(96.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(122.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                horizontalLineToRelative(26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 136.0f)
                close()
                moveTo(230.0f, 80.0f)
                lineTo(230.0f, 192.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f)
                lineTo(48.0f, 214.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, -22.0f)
                lineTo(26.0f, 80.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 48.0f, 58.0f)
                lineTo(76.79f, 58.0f)
                lineTo(88.63f, 40.23f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 100.28f, 34.0f)
                horizontalLineToRelative(55.44f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 11.65f, 6.23f)
                lineTo(179.21f, 58.0f)
                lineTo(208.0f, 58.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 230.0f, 80.0f)
                close()
                moveTo(218.0f, 80.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(176.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -2.67f)
                lineTo(157.38f, 46.89f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.66f, -0.89f)
                lineTo(100.28f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.66f, 0.89f)
                lineTo(85.0f, 67.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 80.0f, 70.0f)
                lineTo(48.0f, 70.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 38.0f, 80.0f)
                lineTo(38.0f, 192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                lineTo(208.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
