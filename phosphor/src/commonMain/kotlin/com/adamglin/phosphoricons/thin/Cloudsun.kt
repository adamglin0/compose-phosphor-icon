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

public val ThinGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.0f)
                arcToRelative(71.85f, 71.85f, 0.0f, false, false, -22.14f, 3.48f)
                arcTo(51.78f, 51.78f, 0.0f, false, false, 129.0f, 63.83f)
                lineToRelative(11.56f, -16.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 134.0f, 42.73f)
                lineTo(122.45f, 59.24f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 96.0f, 52.0f)
                curveToRelative(-1.71f, 0.0f, -3.4f, 0.09f, -5.06f, 0.25f)
                lineTo(87.44f, 32.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.88f, 1.39f)
                lineToRelative(3.5f, 19.84f)
                arcTo(52.19f, 52.19f, 0.0f, false, false, 55.85f, 71.0f)
                lineTo(39.32f, 59.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 34.73f, 66.0f)
                lineTo(51.26f, 77.54f)
                arcTo(51.63f, 51.63f, 0.0f, false, false, 44.0f, 104.0f)
                curveToRelative(0.0f, 1.69f, 0.09f, 3.37f, 0.25f, 5.0f)
                lineToRelative(-19.85f, 3.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.69f, 7.94f)
                arcToRelative(4.23f, 4.23f, 0.0f, false, false, 0.7f, -0.06f)
                lineToRelative(19.85f, -3.5f)
                arcTo(52.07f, 52.07f, 0.0f, false, false, 54.0f, 134.6f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 84.0f, 220.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(52.0f, 104.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 82.33f, -21.61f)
                arcToRelative(72.23f, 72.23f, 0.0f, false, false, -38.82f, 43.0f)
                arcTo(48.28f, 48.28f, 0.0f, false, false, 84.0f, 124.0f)
                arcToRelative(47.76f, 47.76f, 0.0f, false, false, -23.4f, 6.11f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 52.0f, 104.0f)
                close()
                moveTo(164.0f, 212.0f)
                horizontalLineTo(84.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 9.43f, -78.88f)
                arcTo(71.63f, 71.63f, 0.0f, false, false, 92.0f, 143.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.46f)
                arcToRelative(64.3f, 64.3f, 0.0f, false, true, 2.0f, -12.67f)
                curveToRelative(0.0f, -0.12f, 0.07f, -0.24f, 0.09f, -0.36f)
                arcTo(64.06f, 64.06f, 0.0f, true, true, 164.0f, 212.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
