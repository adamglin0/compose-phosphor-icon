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

public val RegularGroup.Hearthalf: ImageVector
    get() {
        if (_hearthalf != null) {
            return _hearthalf!!
        }
        _hearthalf = Builder(name = "Hearthalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.47f, 56.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.94f, -15.73f)
                curveTo(150.42f, 44.08f, 137.0f, 52.18f, 128.0f, 64.0f)
                curveToRelative(-11.26f, -15.0f, -29.36f, -24.0f, -50.0f, -24.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, -62.0f, 62.0f)
                curveToRelative(0.0f, 70.0f, 103.79f, 126.67f, 108.21f, 129.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 7.58f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(332.57f, 332.57f, 0.0f, false, false, 41.09f, -27.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -9.76f, -12.67f)
                curveToRelative(-10.31f, 7.94f, -20.0f, 14.37f, -27.12f, 18.82f)
                lineTo(136.0f, 81.7f)
                curveTo(141.84f, 68.75f, 153.94f, 59.7f, 169.47f, 56.79f)
                close()
                moveTo(120.0f, 210.0f)
                curveTo(93.58f, 193.41f, 32.0f, 149.71f, 32.0f, 102.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, true, 78.0f, 56.0f)
                curveToRelative(18.91f, 0.0f, 34.86f, 9.78f, 42.0f, 25.64f)
                close()
                moveTo(232.55f, 104.0f)
                arcToRelative(8.85f, 8.85f, 0.0f, false, true, -0.89f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.94f, -7.12f)
                arcToRelative(45.88f, 45.88f, 0.0f, false, false, -20.17f, -33.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.9f, -13.29f)
                arcToRelative(61.83f, 61.83f, 0.0f, false, true, 27.17f, 44.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.55f, 104.0f)
                close()
                moveTo(230.46f, 139.62f)
                curveToRelative(-5.67f, 11.37f, -13.94f, 23.0f, -24.59f, 34.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.74f, -10.86f)
                curveToRelative(9.61f, -10.4f, 17.0f, -20.75f, 22.0f, -30.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.31f, 7.14f)
                close()
            }
        }
        .build()
        return _hearthalf!!
    }

private var _hearthalf: ImageVector? = null
