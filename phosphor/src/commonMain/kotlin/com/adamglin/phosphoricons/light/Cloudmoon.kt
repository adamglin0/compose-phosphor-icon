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

public val LightGroup.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) {
            return _cloudMoon!!
        }
        _cloudMoon = Builder(name = "CloudMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 74.0f)
                arcToRelative(74.41f, 74.41f, 0.0f, false, false, -14.17f, 1.36f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, -54.11f, -63.59f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.53f, 19.0f)
                arcTo(58.06f, 58.06f, 0.0f, false, true, 27.0f, 88.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.19f, 7.19f)
                arcToRelative(70.22f, 70.22f, 0.0f, false, false, 33.3f, 44.95f)
                arcTo(50.0f, 50.0f, 0.0f, false, false, 92.0f, 222.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, -148.0f)
                close()
                moveTo(34.22f, 101.76f)
                quadTo(37.1f, 102.0f, 40.0f, 102.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, -70.0f)
                curveToRelative(0.0f, -1.94f, -0.08f, -3.88f, -0.24f, -5.8f)
                arcTo(57.64f, 57.64f, 0.0f, false, true, 146.0f, 78.71f)
                arcTo(74.32f, 74.32f, 0.0f, false, false, 102.2f, 123.0f)
                arcTo(50.36f, 50.36f, 0.0f, false, false, 92.0f, 122.0f)
                arcToRelative(49.74f, 49.74f, 0.0f, false, false, -29.86f, 9.92f)
                arcTo(58.24f, 58.24f, 0.0f, false, true, 34.22f, 101.76f)
                close()
                moveTo(172.0f, 210.0f)
                horizontalLineTo(92.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 7.08f, -75.34f)
                arcToRelative(75.84f, 75.84f, 0.0f, false, false, -1.07f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.7f)
                arcToRelative(61.54f, 61.54f, 0.0f, false, true, 2.0f, -12.24f)
                curveToRelative(0.0f, -0.15f, 0.08f, -0.29f, 0.11f, -0.43f)
                arcTo(62.06f, 62.06f, 0.0f, true, true, 172.0f, 210.0f)
                close()
            }
        }
        .build()
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
