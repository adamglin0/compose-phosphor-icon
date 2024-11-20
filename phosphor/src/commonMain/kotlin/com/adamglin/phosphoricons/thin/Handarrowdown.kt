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

public val ThinGroup.HandArrowDown: ImageVector
    get() {
        if (_handArrowDown != null) {
            return _handArrowDown!!
        }
        _handArrowDown = Builder(name = "HandArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.9f, 144.24f)
                arcToRelative(20.45f, 20.45f, 0.0f, false, false, -17.84f, -3.53f)
                lineTo(160.75f, 152.0f)
                arcTo(23.76f, 23.76f, 0.0f, false, false, 164.0f, 140.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(89.94f, 116.0f)
                arcToRelative(27.81f, 27.81f, 0.0f, false, false, -19.8f, 8.2f)
                lineTo(46.34f, 148.0f)
                lineTo(16.0f, 148.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(120.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -0.12f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(4.69f, 4.69f, 0.0f, false, false, 0.6f, -0.2f)
                lineToRelative(38.82f, -16.54f)
                lineToRelative(0.22f, -0.1f)
                arcToRelative(20.6f, 20.6f, 0.0f, false, false, 3.29f, -34.8f)
                close()
                moveTo(12.0f, 200.0f)
                lineTo(12.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(44.0f, 156.0f)
                verticalLineToRelative(48.0f)
                lineTo(16.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 200.0f)
                close()
                moveTo(221.13f, 171.83f)
                lineTo(182.72f, 188.2f)
                lineTo(119.51f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 153.66f)
                lineToRelative(23.8f, -23.8f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 89.94f, 124.0f)
                lineTo(140.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                lineTo(112.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 0.9f, -0.1f)
                lineToRelative(67.0f, -15.41f)
                lineToRelative(0.16f, 0.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, 9.0f, 23.38f)
                close()
                moveTo(157.13f, 74.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(188.0f, 94.34f)
                lineTo(188.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(196.0f, 94.34f)
                lineToRelative(25.17f, -25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                close()
            }
        }
        .build()
        return _handArrowDown!!
    }

private var _handArrowDown: ImageVector? = null
