package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Ambulance: ImageVector
    get() {
        if (_ambulance != null) {
            return _ambulance!!
        }
        _ambulance = Builder(name = "Ambulance", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                lineTo(104.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(120.0f, 128.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(104.0f, 128.0f)
                lineTo(88.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 120.0f)
                close()
                moveTo(256.0f, 120.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(223.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -62.0f, 0.0f)
                lineTo(111.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -62.0f, 0.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 56.0f)
                lineTo(184.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(34.58f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, 14.86f, 10.06f)
                lineToRelative(14.0f, 35.0f)
                arcTo(7.92f, 7.92f, 0.0f, false, true, 256.0f, 120.0f)
                close()
                moveTo(192.0f, 88.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(44.18f)
                lineToRelative(-9.6f, -24.0f)
                close()
                moveTo(32.0f, 184.0f)
                lineTo(49.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 62.0f, 0.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(32.11f, 32.11f, 0.0f, false, true, 15.0f, -19.69f)
                lineTo(176.0f, 72.0f)
                lineTo(32.0f, 72.0f)
                close()
                moveTo(96.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 192.0f)
                close()
                moveTo(208.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 192.0f)
                close()
                moveTo(240.0f, 184.0f)
                lineTo(240.0f, 128.0f)
                lineTo(192.0f, 128.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, true, 31.0f, 24.0f)
                close()
            }
        }
        .build()
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
