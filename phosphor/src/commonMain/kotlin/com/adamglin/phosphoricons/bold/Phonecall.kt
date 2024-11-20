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

public val BoldGroup.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.41f, 44.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.69f, -8.49f)
                arcToRelative(90.12f, 90.12f, 0.0f, false, true, 64.49f, 64.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.18f, 6.2f)
                arcTo(66.42f, 66.42f, 0.0f, false, false, 148.9f, 59.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.41f, 44.9f)
                close()
                moveTo(227.85f, 183.58f)
                arcTo(60.27f, 60.27f, 0.0f, false, true, 168.0f, 236.0f)
                curveTo(86.39f, 236.0f, 20.0f, 169.61f, 20.0f, 88.0f)
                arcTo(60.27f, 60.27f, 0.0f, false, true, 72.42f, 28.15f)
                arcTo(20.05f, 20.05f, 0.0f, false, true, 93.2f, 40.0f)
                lineToRelative(21.11f, 47.13f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, false, 0.08f, 0.18f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.66f, 18.83f)
                arcToRelative(10.67f, 10.67f, 0.0f, false, true, -0.85f, 1.15f)
                lineTo(92.82f, 130.0f)
                curveToRelative(7.06f, 12.84f, 20.5f, 26.16f, 33.49f, 33.21f)
                lineToRelative(22.31f, -19.0f)
                arcToRelative(13.08f, 13.08f, 0.0f, false, true, 1.12f, -0.84f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, true, 19.0f, -1.74f)
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
                arcToRelative(10.75f, 10.75f, 0.0f, false, true, 0.86f, -1.15f)
                lineTo(91.3f, 94.49f)
                lineToRelative(-18.82f, -42.0f)
                arcTo(36.29f, 36.29f, 0.0f, false, false, 44.0f, 88.0f)
                arcTo(124.15f, 124.15f, 0.0f, false, false, 168.0f, 212.0f)
                arcTo(36.29f, 36.29f, 0.0f, false, false, 203.54f, 183.52f)
                close()
                moveTo(137.63f, 97.47f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 20.9f, 20.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.44f, 8.4f)
                arcToRelative(12.22f, 12.22f, 0.0f, false, false, 3.61f, -0.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.84f, -15.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -36.59f, -36.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -7.2f, 22.89f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
