package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineTo(176.0f)
                curveToRelative(-64.0f, 55.43f, -112.0f, -55.43f, -176.0f, 0.0f)
                verticalLineTo(56.0f)
                curveTo(112.0f, 0.57f, 160.0f, 111.43f, 224.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.76f, 50.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 56.0f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(179.77f)
                curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f)
                curveToRelative(16.4f, 8.11f, 34.06f, 16.85f, 53.0f, 16.85f)
                curveToRelative(13.93f, 0.0f, 28.54f, -4.75f, 43.82f, -18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -6.0f)
                verticalLineTo(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 218.76f, 50.0f)
                curveToRelative(-28.0f, 24.23f, -51.72f, 12.49f, -79.21f, -1.12f)
                curveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50.0f)
                close()
                moveTo(216.0f, 172.25f)
                curveToRelative(-26.79f, 21.16f, -49.87f, 9.74f, -76.45f, -3.41f)
                curveToRelative(-25.0f, -12.35f, -52.81f, -26.13f, -83.55f, -8.4f)
                verticalLineTo(59.79f)
                curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.4f)
                curveToRelative(25.0f, 12.35f, 52.82f, 26.13f, 83.55f, 8.4f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
