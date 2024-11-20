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

public val BoldGroup.CableCar: ImageVector
    get() {
        if (_cableCar != null) {
            return _cableCar!!
        }
        _cableCar = Builder(name = "CableCar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.81f, 29.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.92f, -9.7f)
                lineToRelative(-224.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 16.0f, 84.0f)
                arcToRelative(11.77f, 11.77f, 0.0f, false, false, 2.12f, -0.19f)
                lineTo(116.0f, 66.33f)
                lineTo(116.0f, 92.0f)
                lineTo(64.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                lineTo(192.0f, 228.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(228.0f, 128.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                lineTo(140.0f, 92.0f)
                lineTo(140.0f, 62.05f)
                lineTo(242.11f, 43.81f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 251.81f, 29.89f)
                close()
                moveTo(108.0f, 156.0f)
                lineTo(108.0f, 116.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(64.0f, 116.0f)
                lineTo(84.0f, 116.0f)
                verticalLineToRelative(40.0f)
                lineTo(52.0f, 156.0f)
                lineTo(52.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 116.0f)
                close()
                moveTo(192.0f, 204.0f)
                lineTo(64.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(52.0f, 180.0f)
                lineTo(204.0f, 180.0f)
                verticalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 204.0f)
                close()
                moveTo(204.0f, 128.0f)
                verticalLineToRelative(28.0f)
                lineTo(172.0f, 156.0f)
                lineTo(172.0f, 116.0f)
                horizontalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 128.0f)
                close()
            }
        }
        .build()
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
