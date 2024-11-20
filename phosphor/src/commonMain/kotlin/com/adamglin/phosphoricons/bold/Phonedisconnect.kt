package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) {
            return _phoneDisconnect!!
        }
        _phoneDisconnect = Builder(name = "PhoneDisconnect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.39f, 87.29f)
                curveToRelative(-57.67f, -57.72f, -155.11f, -57.72f, -212.78f, 0.0f)
                curveToRelative(-21.45f, 21.47f, -23.52f, 53.13f, -5.0f, 77.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 22.92f, 6.37f)
                lineTo(88.4f, 153.29f)
                lineToRelative(0.45f, -0.16f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 101.0f, 138.47f)
                lineToRelative(5.44f, -27.24f)
                arcToRelative(72.48f, 72.48f, 0.0f, false, true, 42.76f, -0.09f)
                lineTo(155.0f, 138.62f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.14f, 14.49f)
                lineToRelative(0.45f, 0.17f)
                lineToRelative(48.94f, 17.37f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 22.91f, -6.37f)
                curveTo(257.91f, 140.42f, 255.84f, 108.76f, 234.39f, 87.29f)
                close()
                moveTo(222.16f, 147.19f)
                lineTo(178.0f, 131.5f)
                lineTo(172.24f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -13.0f, -14.8f)
                arcToRelative(96.49f, 96.49f, 0.0f, false, false, -62.94f, 0.14f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 83.4f, 104.24f)
                lineTo(78.0f, 131.53f)
                lineTo(33.84f, 147.19f)
                curveToRelative(-9.16f, -13.85f, -7.41f, -30.77f, 4.73f, -42.92f)
                curveTo(62.81f, 80.0f, 95.41f, 67.88f, 128.0f, 67.88f)
                reflectiveCurveTo(193.19f, 80.0f, 217.43f, 104.27f)
                curveTo(229.57f, 116.42f, 231.32f, 133.35f, 222.16f, 147.19f)
                close()
                moveTo(228.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 188.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 200.0f)
                close()
            }
        }
        .build()
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
