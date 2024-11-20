package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 108.0f)
                lineTo(225.66f, 108.0f)
                lineTo(189.17f, 71.51f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 180.69f, 68.0f)
                lineTo(136.0f, 68.0f)
                lineTo(136.0f, 36.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(100.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(28.0f)
                lineTo(128.0f, 68.0f)
                lineTo(64.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 80.0f)
                verticalLineToRelative(56.0f)
                lineTo(20.0f, 136.0f)
                lineTo(20.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(20.0f, 144.0f)
                lineTo(52.0f, 144.0f)
                verticalLineToRelative(24.69f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 3.51f, 8.48f)
                lineToRelative(39.32f, 39.32f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 8.48f, 3.51f)
                horizontalLineToRelative(77.38f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 8.48f, -3.51f)
                lineTo(225.66f, 180.0f)
                lineTo(240.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(252.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 108.0f)
                close()
                moveTo(244.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(224.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 1.17f)
                lineToRelative(-37.66f, 37.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, 1.17f)
                lineTo(103.31f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -1.17f)
                lineTo(61.17f, 171.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 60.0f, 168.69f)
                lineTo(60.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(180.69f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f)
                lineToRelative(37.66f, 37.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 116.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
