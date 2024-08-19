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

public val LightGroup.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(195.31f, 187.67f)
                curveToRelative(-1.0f, -1.12f, -2.0f, -2.26f, -2.9f, -3.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.36f, 7.5f)
                curveToRelative(1.19f, 1.49f, 2.43f, 2.94f, 3.71f, 4.37f)
                arcToRelative(89.84f, 89.84f, 0.0f, false, true, -117.52f, 0.0f)
                curveToRelative(1.28f, -1.43f, 2.52f, -2.88f, 3.71f, -4.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.36f, -7.5f)
                curveToRelative(-0.93f, 1.16f, -1.91f, 2.3f, -2.9f, 3.42f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, 0.0f, -119.34f)
                curveToRelative(1.0f, 1.12f, 2.0f, 2.26f, 2.9f, 3.42f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 68.28f, 74.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 73.0f, 64.25f)
                curveToRelative(-1.19f, -1.49f, -2.43f, -2.94f, -3.71f, -4.37f)
                arcToRelative(89.84f, 89.84f, 0.0f, false, true, 117.52f, 0.0f)
                curveToRelative(-1.28f, 1.43f, -2.52f, 2.88f, -3.71f, 4.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.36f, 7.5f)
                curveToRelative(0.93f, -1.16f, 1.91f, -2.3f, 2.9f, -3.42f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, 0.0f, 119.34f)
                close()
                moveTo(93.92f, 145.0f)
                arcToRelative(101.43f, 101.43f, 0.0f, false, true, -4.4f, 17.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.31f, -4.0f)
                arcToRelative(89.91f, 89.91f, 0.0f, false, false, 3.87f, -15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, 2.0f)
                close()
                moveTo(93.92f, 111.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 89.0f, 117.92f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, 0.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, -5.0f)
                arcToRelative(89.91f, 89.91f, 0.0f, false, false, -3.87f, -15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.31f, -4.0f)
                arcTo(101.43f, 101.43f, 0.0f, false, true, 93.92f, 111.0f)
                close()
                moveTo(177.79f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.31f, 4.0f)
                arcToRelative(101.43f, 101.43f, 0.0f, false, true, -4.4f, -17.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, -2.0f)
                arcTo(89.91f, 89.91f, 0.0f, false, false, 177.79f, 158.0f)
                close()
                moveTo(177.79f, 98.0f)
                arcToRelative(89.91f, 89.91f, 0.0f, false, false, -3.87f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, 5.0f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, -0.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.93f, -6.91f)
                arcToRelative(101.43f, 101.43f, 0.0f, false, true, 4.4f, -17.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.31f, 4.0f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
