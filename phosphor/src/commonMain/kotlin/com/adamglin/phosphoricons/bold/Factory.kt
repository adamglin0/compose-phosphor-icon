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

public val BoldGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(80.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 176.0f)
                close()
                moveTo(176.0f, 164.0f)
                lineTo(148.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(244.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(24.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(28.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.2f, -9.6f)
                lineTo(92.0f, 112.0f)
                lineTo(92.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.2f, -9.6f)
                lineToRelative(33.33f, 25.0f)
                lineToRelative(10.61f, -74.23f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 174.94f, 12.0f)
                horizontalLineToRelative(18.12f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 19.8f, 17.17f)
                lineToRelative(15.0f, 105.13f)
                curveToRelative(0.0f, 0.1f, 0.12f, 1.34f, 0.12f, 1.7f)
                verticalLineToRelative(68.0f)
                horizontalLineToRelative(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 216.0f)
                close()
                moveTo(166.43f, 119.83f)
                lineTo(172.0f, 124.0f)
                horizontalLineToRelative(30.16f)
                lineTo(189.59f, 36.0f)
                lineTo(178.41f, 36.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(204.0f, 204.0f)
                lineTo(204.0f, 148.0f)
                lineTo(168.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.2f, -2.4f)
                lineToRelative(-14.38f, -10.78f)
                lineToRelative(-0.06f, 0.0f)
                lineTo(116.0f, 112.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.2f, 9.6f)
                lineTo(52.0f, 112.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
