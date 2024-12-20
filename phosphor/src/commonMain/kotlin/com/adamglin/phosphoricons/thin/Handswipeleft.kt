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

public val ThinGroup.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) {
            return _handSwipeLeft!!
        }
        _handSwipeLeft = Builder(name = "HandSwipeLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 140.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 24.66f, -8.08f, 41.1f, -8.42f, 41.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.16f, -3.58f)
                curveToRelative(0.07f, -0.15f, 7.58f, -15.55f, 7.58f, -38.21f)
                lineTo(204.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(164.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 68.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                lineTo(92.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.39f, 2.11f)
                lineToRelative(-18.68f, -30.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.07f, -0.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.72f, 16.0f)
                lineToRelative(29.31f, 50.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.9f, 4.0f)
                lineTo(31.22f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 41.52f, -24.09f)
                lineTo(84.0f, 162.0f)
                lineTo(84.0f, 68.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f)
                verticalLineToRelative(38.13f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 39.94f, 16.06f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 212.0f, 140.0f)
                close()
                moveTo(248.0f, 52.0f)
                lineTo(185.65f, 52.0f)
                lineToRelative(25.18f, -25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                lineTo(185.65f, 60.0f)
                lineTo(248.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
