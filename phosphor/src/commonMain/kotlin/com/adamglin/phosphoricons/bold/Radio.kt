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

public val BoldGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 172.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 160.0f, 172.0f)
                close()
                moveTo(160.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 124.0f)
                close()
                moveTo(216.0f, 60.0f)
                lineTo(113.76f, 60.0f)
                lineToRelative(81.69f, -24.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.9f, -23.0f)
                lineToRelative(-160.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 72.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 60.0f)
                close()
                moveTo(212.0f, 188.0f)
                lineTo(44.0f, 188.0f)
                lineTo(44.0f, 84.0f)
                lineTo(212.0f, 84.0f)
                close()
                moveTo(60.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(96.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(72.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 116.0f)
                close()
                moveTo(60.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(96.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(72.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 156.0f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
