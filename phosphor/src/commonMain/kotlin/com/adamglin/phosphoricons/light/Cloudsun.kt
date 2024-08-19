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

public val LightGroup.Cloudsun: ImageVector
    get() {
        if (_cloudsun != null) {
            return _cloudsun!!
        }
        _cloudsun = Builder(name = "Cloudsun", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 74.0f)
                arcToRelative(74.15f, 74.15f, 0.0f, false, false, -21.18f, 3.09f)
                arcToRelative(54.08f, 54.08f, 0.0f, false, false, -11.14f, -13.61f)
                lineToRelative(10.52f, -15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.83f, -6.89f)
                lineToRelative(-10.52f, 15.0f)
                arcTo(53.9f, 53.9f, 0.0f, false, false, 96.0f, 50.0f)
                curveToRelative(-1.15f, 0.0f, -2.28f, 0.0f, -3.41f, 0.12f)
                lineTo(89.4f, 32.05f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.81f, 2.09f)
                lineTo(80.77f, 52.2f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 55.52f, 68.32f)
                lineTo(40.47f, 57.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.89f, 9.83f)
                lineToRelative(15.0f, 10.52f)
                arcTo(53.7f, 53.7f, 0.0f, false, false, 42.0f, 104.0f)
                curveToRelative(0.0f, 1.13f, 0.0f, 2.26f, 0.12f, 3.39f)
                lineToRelative(-18.07f, 3.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.0f, 11.91f)
                arcToRelative(6.38f, 6.38f, 0.0f, false, false, 1.05f, -0.09f)
                lineTo(44.2f, 119.2f)
                arcToRelative(53.51f, 53.51f, 0.0f, false, false, 7.08f, 15.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, false, 84.0f, 222.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, -148.0f)
                close()
                moveTo(54.0f, 104.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 77.48f, -22.49f)
                arcTo(74.29f, 74.29f, 0.0f, false, false, 94.2f, 123.0f)
                arcTo(50.36f, 50.36f, 0.0f, false, false, 84.0f, 122.0f)
                arcToRelative(49.65f, 49.65f, 0.0f, false, false, -22.79f, 5.52f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 54.0f, 104.0f)
                close()
                moveTo(164.0f, 210.0f)
                horizontalLineTo(84.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 7.08f, -75.34f)
                arcToRelative(75.84f, 75.84f, 0.0f, false, false, -1.07f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.7f)
                arcToRelative(61.54f, 61.54f, 0.0f, false, true, 2.0f, -12.24f)
                curveToRelative(0.0f, -0.15f, 0.08f, -0.29f, 0.11f, -0.43f)
                arcTo(62.06f, 62.06f, 0.0f, true, true, 164.0f, 210.0f)
                close()
            }
        }
        .build()
        return _cloudsun!!
    }

private var _cloudsun: ImageVector? = null
