package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Handtap: ImageVector
    get() {
        if (_handtap != null) {
            return _handtap!!
        }
        _handtap = Builder(name = "Handtap", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(207.23f, 120.0f)
                curveToRelative(-8.61f, 0.4f, -15.23f, 7.82f, -15.23f, 16.43f)
                verticalLineToRelative(7.28f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                lineTo(176.0f, 120.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 144.0f, 120.0f)
                verticalLineToRelative(15.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                lineTo(128.0f, 64.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 64.0f)
                lineTo(96.0f, 183.74f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, -6.72f, 8.16f)
                lineToRelative(-0.12f, 0.0f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, true, -6.0f, -3.09f)
                lineToRelative(-21.0f, -36.44f)
                curveToRelative(-4.3f, -7.46f, -13.74f, -10.57f, -21.4f, -6.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 34.15f, 168.0f)
                lineTo(65.1f, 228.05f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 232.0f)
                lineTo(208.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, -4.42f)
                curveToRelative(0.36f, -0.72f, 8.84f, -15.06f, 8.84f, -40.65f)
                lineTo(224.0f, 136.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 207.23f, 120.0f)
                close()
            }
        }
        .build()
        return _handtap!!
    }

private var _handtap: ImageVector? = null
