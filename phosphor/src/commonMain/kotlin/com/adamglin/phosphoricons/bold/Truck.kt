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

public val BoldGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.14f, 115.54f)
                lineToRelative(-14.0f, -35.0f)
                arcTo(19.89f, 19.89f, 0.0f, false, false, 222.58f, 68.0f)
                lineTo(196.0f, 68.0f)
                lineTo(196.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(32.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 72.0f)
                lineTo(12.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(46.06f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 67.88f, 0.0f)
                horizontalLineToRelative(44.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 67.88f, 0.0f)
                lineTo(236.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(256.0f, 120.0f)
                arcTo(21.7f, 21.7f, 0.0f, false, false, 255.14f, 115.54f)
                close()
                moveTo(196.0f, 92.0f)
                horizontalLineToRelative(23.88f)
                lineToRelative(6.4f, 16.0f)
                lineTo(196.0f, 108.0f)
                close()
                moveTo(80.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 204.0f)
                close()
                moveTo(172.0f, 162.08f)
                arcTo(36.32f, 36.32f, 0.0f, false, false, 158.06f, 180.0f)
                lineTo(113.94f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -67.88f, 0.0f)
                lineTo(36.0f, 180.0f)
                lineTo(36.0f, 140.0f)
                lineTo(172.0f, 140.0f)
                close()
                moveTo(172.0f, 116.0f)
                lineTo(36.0f, 116.0f)
                lineTo(36.0f, 76.0f)
                lineTo(172.0f, 76.0f)
                close()
                moveTo(192.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 204.0f)
                close()
                moveTo(232.0f, 180.0f)
                horizontalLineToRelative(-6.06f)
                arcTo(36.09f, 36.09f, 0.0f, false, false, 196.0f, 156.23f)
                lineTo(196.0f, 132.0f)
                horizontalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
