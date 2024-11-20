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

public val ThinGroup.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) {
            return _metaLogo!!
        }
        _metaLogo = Builder(name = "MetaLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 149.31f)
                curveToRelative(0.0f, 15.38f, -3.0f, 28.45f, -8.6f, 37.78f)
                curveToRelative(-6.67f, 11.06f, -17.0f, 16.91f, -30.0f, 16.91f)
                curveToRelative(-25.55f, 0.0f, -44.83f, -36.0f, -65.25f, -74.11f)
                curveTo(113.78f, 95.53f, 94.74f, 60.0f, 74.0f, 60.0f)
                curveTo(62.9f, 60.0f, 51.3f, 70.53f, 42.16f, 88.89f)
                arcTo(142.23f, 142.23f, 0.0f, false, false, 28.0f, 149.31f)
                curveToRelative(0.0f, 13.93f, 2.58f, 25.56f, 7.45f, 33.65f)
                curveToRelative(5.22f, 8.65f, 13.0f, 13.0f, 23.11f, 13.0f)
                curveToRelative(17.15f, 0.0f, 33.07f, -24.32f, 47.73f, -50.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.0f, 3.9f)
                curveTo(98.52f, 175.76f, 80.9f, 204.0f, 58.56f, 204.0f)
                curveToRelative(-12.93f, 0.0f, -23.29f, -5.85f, -30.0f, -16.91f)
                curveTo(23.0f, 177.76f, 20.0f, 164.69f, 20.0f, 149.31f)
                arcToRelative(150.73f, 150.73f, 0.0f, false, true, 15.0f, -64.0f)
                curveTo(45.69f, 63.83f, 59.54f, 52.0f, 74.0f, 52.0f)
                curveToRelative(25.54f, 0.0f, 44.83f, 36.0f, 65.25f, 74.11f)
                curveToRelative(18.41f, 34.36f, 37.44f, 69.89f, 58.2f, 69.89f)
                curveToRelative(10.12f, 0.0f, 17.89f, -4.39f, 23.11f, -13.0f)
                curveToRelative(4.87f, -8.09f, 7.45f, -19.72f, 7.45f, -33.65f)
                arcToRelative(142.23f, 142.23f, 0.0f, false, false, -14.16f, -60.42f)
                curveTo(204.7f, 70.53f, 193.1f, 60.0f, 182.0f, 60.0f)
                curveToRelative(-9.75f, 0.0f, -20.15f, 8.0f, -31.78f, 24.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.54f, -4.6f)
                curveToRelative(13.42f, -19.08f, 25.6f, -28.0f, 38.32f, -28.0f)
                curveToRelative(14.45f, 0.0f, 28.3f, 11.83f, 39.0f, 33.32f)
                arcTo(150.73f, 150.73f, 0.0f, false, true, 236.0f, 149.31f)
                close()
            }
        }
        .build()
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
