package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Funnelx: ImageVector
    get() {
        if (_funnelx != null) {
            return _funnelx!!
        }
        _funnelx = Builder(name = "Funnelx", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.82f, 66.76f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 28.19f, 66.76f)
                lineToRelative(0.08f, 0.09f)
                lineTo(96.0f, 139.17f)
                lineTo(96.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 24.87f, 13.32f)
                lineToRelative(32.0f, -21.34f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 160.0f, 194.66f)
                lineTo(160.0f, 139.17f)
                lineToRelative(67.73f, -72.32f)
                close()
                moveTo(40.0f, 56.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(146.19f, 130.59f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 136.0f)
                verticalLineToRelative(58.66f)
                lineTo(112.0f, 216.0f)
                lineTo(112.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.16f, -5.46f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                close()
                moveTo(245.68f, 210.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(216.0f, 203.32f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f)
                lineTo(204.69f, 192.0f)
                lineToRelative(-18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.31f)
                lineTo(216.0f, 180.69f)
                lineToRelative(18.34f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f)
                lineTo(227.31f, 192.0f)
                close()
            }
        }
        .build()
        return _funnelx!!
    }

private var _funnelx: ImageVector? = null
