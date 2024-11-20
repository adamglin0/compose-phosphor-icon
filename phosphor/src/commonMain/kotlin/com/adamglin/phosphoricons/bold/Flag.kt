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

public val BoldGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.14f, 46.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(181.72f)
                curveToRelative(22.84f, -17.12f, 42.1f, -9.12f, 70.68f, 5.0f)
                curveToRelative(16.23f, 8.0f, 34.74f, 17.2f, 54.8f, 17.2f)
                curveToRelative(14.72f, 0.0f, 30.28f, -4.94f, 46.38f, -18.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 176.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.86f, -9.07f)
                curveToRelative(-24.71f, 21.41f, -44.53f, 13.31f, -74.82f, -1.68f)
                curveTo(113.19f, 31.27f, 78.17f, 13.94f, 40.14f, 46.88f)
                close()
                moveTo(212.0f, 170.26f)
                curveToRelative(-22.84f, 17.13f, -42.1f, 9.11f, -70.68f, -5.0f)
                curveTo(118.16f, 153.76f, 90.33f, 140.0f, 60.0f, 153.87f)
                verticalLineTo(61.69f)
                curveToRelative(22.84f, -17.12f, 42.1f, -9.12f, 70.68f, 5.0f)
                curveToRelative(16.23f, 8.0f, 34.74f, 17.2f, 54.8f, 17.2f)
                arcTo(63.0f, 63.0f, 0.0f, false, false, 212.0f, 78.08f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
