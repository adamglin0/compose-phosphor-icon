package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Handfist: ImageVector
    get() {
        if (_handfist != null) {
            return _handfist!!
        }
        _handfist = Builder(name = "Handfist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 82.0f)
                lineTo(182.0f, 82.0f)
                lineTo(182.0f, 64.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -54.0f, -18.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 74.0f, 64.0f)
                verticalLineToRelative(0.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 26.0f, 88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 204.0f, 0.0f)
                lineTo(230.0f, 112.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 200.0f, 82.0f)
                close()
                moveTo(152.0f, 46.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f)
                lineTo(170.0f, 82.0f)
                lineTo(136.0f, 82.0f)
                arcToRelative(14.71f, 14.71f, 0.0f, false, false, -2.0f, 0.16f)
                lineTo(134.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 152.0f, 46.0f)
                close()
                moveTo(86.0f, 64.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                close()
                moveTo(38.0f, 88.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -180.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 42.0f, -6.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 45.12f, 3.3f)
                arcTo(30.18f, 30.18f, 0.0f, false, false, 140.0f, 139.51f)
                arcTo(45.92f, 45.92f, 0.0f, false, false, 122.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, -34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(152.0f, 130.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, -18.0f)
                lineTo(134.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f)
                close()
            }
        }
        .build()
        return _handfist!!
    }

private var _handfist: ImageVector? = null
