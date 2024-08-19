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

public val BoldGroup.Sharefat: ImageVector
    get() {
        if (_sharefat != null) {
            return _sharefat!!
        }
        _sharefat = Builder(name = "Sharefat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 103.52f)
                lineToRelative(-80.0f, -80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 32.0f)
                verticalLineTo(68.74f)
                curveToRelative(-25.76f, 3.12f, -53.66f, 15.89f, -76.75f, 35.47f)
                curveToRelative(-29.16f, 24.74f, -47.32f, 56.69f, -51.14f, 90.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 39.67f, 207.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(10.46f, -11.14f, 47.0f, -45.74f, 100.33f, -50.42f)
                verticalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.48f, 8.48f)
                lineToRelative(80.0f, -80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.49f, 103.52f)
                close()
                moveTo(164.0f, 163.0f)
                verticalLineTo(144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                curveToRelative(-49.0f, 0.0f, -86.57f, 21.56f, -109.79f, 40.11f)
                curveToRelative(7.13f, -18.16f, 19.63f, -35.22f, 36.57f, -49.59f)
                curveTo(101.3f, 103.41f, 128.67f, 92.0f, 152.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(61.0f)
                lineToRelative(51.0f, 51.0f)
                close()
            }
        }
        .build()
        return _sharefat!!
    }

private var _sharefat: ImageVector? = null
