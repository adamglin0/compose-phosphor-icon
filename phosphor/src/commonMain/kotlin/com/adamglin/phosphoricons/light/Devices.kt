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

public val LightGroup.Devices: ImageVector
    get() {
        if (_devices != null) {
            return _devices!!
        }
        _devices = Builder(name = "Devices", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 74.0f)
                lineTo(206.0f, 74.0f)
                lineTo(206.0f, 64.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(40.0f, 42.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 18.0f, 64.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(154.0f, 182.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(246.0f, 96.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 224.0f, 74.0f)
                close()
                moveTo(40.0f, 170.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(30.0f, 64.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 40.0f, 54.0f)
                lineTo(184.0f, 54.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                lineTo(194.0f, 74.0f)
                lineTo(176.0f, 74.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(74.0f)
                close()
                moveTo(234.0f, 192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(176.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(166.0f, 96.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(134.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 134.0f, 208.0f)
                close()
                moveTo(214.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(192.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 112.0f)
                close()
            }
        }
        .build()
        return _devices!!
    }

private var _devices: ImageVector? = null
