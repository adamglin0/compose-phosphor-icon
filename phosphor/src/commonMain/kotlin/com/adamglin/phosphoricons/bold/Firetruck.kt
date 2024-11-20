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

public val BoldGroup.FireTruck: ImageVector
    get() {
        if (_fireTruck != null) {
            return _fireTruck!!
        }
        _fireTruck = Builder(name = "FireTruck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.14f, 115.54f)
                lineToRelative(-14.0f, -35.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 222.58f, 68.0f)
                lineTo(204.0f, 68.0f)
                lineTo(204.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(94.06f)
                arcTo(36.23f, 36.23f, 0.0f, false, false, 158.06f, 180.0f)
                lineTo(113.94f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -67.88f, 0.0f)
                lineTo(36.0f, 180.0f)
                lineTo(36.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(46.06f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 67.88f, 0.0f)
                horizontalLineToRelative(44.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 67.88f, 0.0f)
                lineTo(236.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(256.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 255.14f, 115.54f)
                close()
                moveTo(219.88f, 92.0f)
                lineToRelative(6.4f, 16.0f)
                lineTo(204.0f, 108.0f)
                lineTo(204.0f, 92.0f)
                close()
                moveTo(80.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 204.0f)
                close()
                moveTo(192.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 204.0f)
                close()
                moveTo(225.94f, 180.0f)
                arcTo(36.23f, 36.23f, 0.0f, false, false, 204.0f, 158.06f)
                lineTo(204.0f, 132.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(24.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(152.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 92.0f)
                lineTo(140.0f, 76.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(24.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(36.0f, 76.0f)
                lineTo(36.0f, 92.0f)
                close()
                moveTo(116.0f, 92.0f)
                lineTo(100.0f, 92.0f)
                lineTo(100.0f, 76.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(60.0f, 76.0f)
                lineTo(76.0f, 76.0f)
                lineTo(76.0f, 92.0f)
                lineTo(60.0f, 92.0f)
                close()
            }
        }
        .build()
        return _fireTruck!!
    }

private var _fireTruck: ImageVector? = null
