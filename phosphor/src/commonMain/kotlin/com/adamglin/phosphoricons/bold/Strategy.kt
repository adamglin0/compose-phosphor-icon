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

public val BoldGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 144.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 144.0f)
                close()
                moveTo(80.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 200.0f)
                close()
                moveTo(48.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.49f, -20.49f)
                lineTo(51.0f, 96.0f)
                lineTo(39.51f, 84.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(68.0f, 79.0f)
                lineTo(79.51f, 67.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(85.0f, 96.0f)
                lineToRelative(11.52f, 11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(68.0f, 113.0f)
                lineTo(56.49f, 124.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 128.0f)
                close()
                moveTo(232.49f, 203.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(204.0f, 209.0f)
                lineToRelative(-11.51f, 11.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(187.0f, 192.0f)
                lineToRelative(-11.52f, -11.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(204.0f, 175.0f)
                lineToRelative(11.51f, -11.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(221.0f, 192.0f)
                close()
                moveTo(189.09f, 110.89f)
                curveToRelative(-5.21f, 23.0f, -23.33f, 43.53f, -45.09f, 51.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -8.0f, -22.63f)
                curveToRelative(14.07f, -5.0f, 26.27f, -18.91f, 29.67f, -33.9f)
                curveToRelative(2.37f, -10.46f, 0.4f, -20.84f, -5.68f, -30.54f)
                verticalLineToRelative(9.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(135.99f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(176.0f, 56.0f)
                curveTo(188.77f, 72.61f, 193.42f, 91.76f, 189.09f, 110.89f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
