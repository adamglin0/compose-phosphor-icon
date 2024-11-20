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

public val BoldGroup.PhoneX: ImageVector
    get() {
        if (_phoneX != null) {
            return _phoneX!!
        }
        _phoneX = Builder(name = "PhoneX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.52f, 95.51f)
                lineTo(159.0f, 80.0f)
                lineTo(143.52f, 64.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(176.0f, 63.0f)
                lineToRelative(15.52f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(193.0f, 80.0f)
                lineToRelative(15.52f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f)
                lineTo(176.0f, 97.0f)
                lineToRelative(-15.51f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                close()
                moveTo(227.85f, 183.58f)
                arcTo(60.27f, 60.27f, 0.0f, false, true, 168.0f, 236.0f)
                curveTo(86.39f, 236.0f, 20.0f, 169.61f, 20.0f, 88.0f)
                arcTo(60.27f, 60.27f, 0.0f, false, true, 72.42f, 28.15f)
                arcTo(20.06f, 20.06f, 0.0f, false, true, 93.2f, 40.0f)
                lineToRelative(21.11f, 47.13f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, false, 0.08f, 0.18f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.66f, 18.83f)
                arcToRelative(11.76f, 11.76f, 0.0f, false, true, -0.85f, 1.15f)
                lineTo(92.82f, 130.0f)
                curveToRelative(7.06f, 12.84f, 20.5f, 26.16f, 33.49f, 33.21f)
                lineToRelative(22.31f, -19.0f)
                arcToRelative(13.08f, 13.08f, 0.0f, false, true, 1.12f, -0.84f)
                arcToRelative(19.94f, 19.94f, 0.0f, false, true, 19.0f, -1.75f)
                lineToRelative(0.18f, 0.08f)
                lineTo(216.0f, 162.8f)
                arcTo(20.06f, 20.06f, 0.0f, false, true, 227.85f, 183.58f)
                close()
                moveTo(203.54f, 183.52f)
                lineTo(161.54f, 164.71f)
                lineTo(139.11f, 183.78f)
                arcToRelative(11.63f, 11.63f, 0.0f, false, true, -1.11f, 0.85f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 118.31f, 186.0f)
                curveToRelative(-19.48f, -9.4f, -38.89f, -28.68f, -48.31f, -48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 1.28f, -19.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.86f, -1.16f)
                lineTo(91.3f, 94.49f)
                lineToRelative(-18.82f, -42.0f)
                arcTo(36.29f, 36.29f, 0.0f, false, false, 44.0f, 88.0f)
                arcTo(124.15f, 124.15f, 0.0f, false, false, 168.0f, 212.0f)
                arcTo(36.29f, 36.29f, 0.0f, false, false, 203.54f, 183.52f)
                close()
            }
        }
        .build()
        return _phoneX!!
    }

private var _phoneX: ImageVector? = null
