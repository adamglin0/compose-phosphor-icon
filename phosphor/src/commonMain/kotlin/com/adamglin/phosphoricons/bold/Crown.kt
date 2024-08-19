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

public val BoldGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -60.0f, 15.45f)
                lineToRelative(-20.86f, 25.66f)
                lineTo(150.82f, 74.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.64f, 0.0f)
                lineTo(84.87f, 121.11f)
                lineTo(64.0f, 95.45f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -35.0f, 15.78f)
                lineToRelative(14.0f, 84.06f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 62.78f, 212.0f)
                lineTo(193.22f, 212.0f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 213.0f, 195.29f)
                lineToRelative(14.0f, -84.06f)
                arcTo(32.05f, 32.05f, 0.0f, false, false, 252.0f, 80.0f)
                close()
                moveTo(220.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 220.0f, 72.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(36.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 36.0f, 72.0f)
                close()
                moveTo(189.83f, 188.0f)
                lineTo(66.17f, 188.0f)
                lineTo(55.29f, 122.78f)
                lineToRelative(23.4f, 28.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 156.0f)
                arcToRelative(12.87f, 12.87f, 0.0f, false, false, 1.63f, -0.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.37f, -7.1f)
                lineTo(127.18f, 84.0f)
                lineToRelative(0.82f, 0.0f)
                lineToRelative(0.82f, 0.0f)
                lineTo(157.0f, 148.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.37f, 7.1f)
                arcTo(12.87f, 12.87f, 0.0f, false, false, 168.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.31f, -4.43f)
                lineToRelative(23.4f, -28.79f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
