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

public val FillGroup.HandFist: ImageVector
    get() {
        if (_handFist != null) {
            return _handFist!!
        }
        _handFist = Builder(name = "HandFist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 120.0f)
                verticalLineToRelative(8.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 127.63f, 232.0f)
                curveToRelative(-54.0f, -0.19f, -98.0f, -42.06f, -103.12f, -94.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.56f, -4.0f)
                arcTo(35.94f, 35.94f, 0.0f, false, false, 72.0f, 122.59f)
                arcToRelative(35.92f, 35.92f, 0.0f, false, false, 53.94f, 2.33f)
                arcToRelative(40.36f, 40.36f, 0.0f, false, false, 12.87f, 13.0f)
                arcTo(47.94f, 47.94f, 0.0f, false, false, 120.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.67f, 8.0f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, 7.33f, -8.26f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 168.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -8.25f, -7.47f)
                lineTo(160.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(136.0f, 88.0f)
                horizontalLineToRelative(64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 232.0f, 120.0f)
                close()
                moveTo(44.73f, 120.0f)
                curveTo(55.57f, 119.6f, 64.0f, 110.37f, 64.0f, 99.52f)
                verticalLineToRelative(-23.0f)
                curveTo(64.0f, 65.63f, 55.57f, 56.4f, 44.73f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 24.0f, 76.0f)
                verticalLineToRelative(24.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.73f, 120.0f)
                close()
                moveTo(100.73f, 120.0f)
                curveToRelative(10.84f, -0.39f, 19.27f, -9.62f, 19.27f, -20.47f)
                verticalLineToRelative(-47.0f)
                curveToRelative(0.0f, -10.85f, -8.43f, -20.08f, -19.27f, -20.47f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 80.0f, 52.0f)
                verticalLineToRelative(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.73f, 120.0f)
                close()
                moveTo(176.0f, 52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.73f, -20.0f)
                curveTo(144.43f, 32.4f, 136.0f, 41.63f, 136.0f, 52.48f)
                lineTo(136.0f, 72.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _handFist!!
    }

private var _handFist: ImageVector? = null
