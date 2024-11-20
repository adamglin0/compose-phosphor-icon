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

public val RegularGroup.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) {
            return _handSwipeLeft!!
        }
        _handSwipeLeft = Builder(name = "HandSwipeLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 140.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 25.59f, -8.49f, 42.85f, -8.85f, 43.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 224.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.57f, -0.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.58f, -10.73f)
                curveToRelative(0.06f, -0.12f, 7.16f, -14.81f, 7.16f, -36.42f)
                lineTo(200.01f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(160.01f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.01f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(96.01f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.79f, 4.23f)
                lineToRelative(-18.68f, -30.0f)
                lineToRelative(-0.14f, -0.23f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 41.6f, 162.0f)
                lineTo(70.89f, 212.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 57.08f, 220.0f)
                lineToRelative(-29.32f, -50.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 48.41f, -28.17f)
                lineTo(80.0f, 148.0f)
                lineTo(80.0f, 68.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                lineTo(136.0f, 98.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 38.65f, 16.69f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 216.0f, 140.0f)
                close()
                moveTo(248.0f, 48.0f)
                lineTo(195.31f, 48.0f)
                lineToRelative(18.34f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, -11.32f)
                lineTo(195.31f, 64.0f)
                lineTo(248.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
