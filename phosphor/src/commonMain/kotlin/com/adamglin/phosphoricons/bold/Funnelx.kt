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

public val BoldGroup.Funnelx: ImageVector
    get() {
        if (_funnelx != null) {
            return _funnelx!!
        }
        _funnelx = Builder(name = "Funnelx", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.78f, 69.45f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 25.2f, 69.45f)
                lineToRelative(0.12f, 0.14f)
                lineTo(92.0f, 140.75f)
                lineTo(92.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 31.09f, 16.65f)
                lineToRelative(32.0f, -21.34f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.9f, -16.64f)
                lineTo(163.99f, 140.75f)
                lineToRelative(66.67f, -71.16f)
                close()
                moveTo(143.23f, 127.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 136.0f)
                verticalLineToRelative(56.52f)
                lineToRelative(-24.0f, 16.0f)
                lineTo(116.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.24f, -8.2f)
                lineTo(49.23f, 60.0f)
                lineTo(206.75f, 60.0f)
                close()
                moveTo(248.49f, 207.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f)
                lineTo(216.0f, 209.0f)
                lineToRelative(-15.52f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(199.0f, 192.0f)
                lineToRelative(-15.52f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(216.0f, 175.0f)
                lineToRelative(15.51f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                lineTo(233.0f, 192.0f)
                close()
            }
        }
        .build()
        return _funnelx!!
    }

private var _funnelx: ImageVector? = null
