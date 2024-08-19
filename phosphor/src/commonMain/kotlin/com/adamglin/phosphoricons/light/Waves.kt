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

public val LightGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.62f, 178.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.79f, 8.45f)
                curveToRelative(-16.87f, 14.0f, -32.0f, 19.0f, -45.75f, 19.0f)
                curveToRelative(-18.19f, 0.0f, -34.13f, -8.66f, -48.94f, -16.7f)
                curveToRelative(-26.0f, -14.12f, -48.44f, -26.31f, -81.31f, 1.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 36.17f, 181.0f)
                curveToRelative(39.13f, -32.45f, 68.65f, -16.41f, 94.69f, -2.26f)
                reflectiveCurveToRelative(48.44f, 26.31f, 81.31f, -1.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 220.62f, 178.58f)
                close()
                moveTo(212.17f, 121.77f)
                curveToRelative(-32.87f, 27.27f, -55.32f, 15.07f, -81.31f, 1.0f)
                reflectiveCurveTo(75.3f, 92.54f, 36.17f, 125.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.66f, 9.25f)
                curveToRelative(32.87f, -27.27f, 55.32f, -15.08f, 81.31f, -1.0f)
                curveToRelative(14.81f, 8.0f, 30.75f, 16.71f, 48.94f, 16.71f)
                curveToRelative(13.79f, 0.0f, 28.88f, -5.0f, 45.75f, -19.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.66f, -9.24f)
                close()
                moveTo(43.83f, 78.21f)
                curveToRelative(32.87f, -27.27f, 55.32f, -15.07f, 81.31f, -1.0f)
                curveTo(140.0f, 85.3f, 155.89f, 94.0f, 174.08f, 94.0f)
                curveToRelative(13.79f, 0.0f, 28.88f, -5.0f, 45.75f, -19.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.66f, -9.24f)
                curveToRelative(-32.87f, 27.27f, -55.32f, 15.07f, -81.31f, 1.0f)
                reflectiveCurveTo(75.3f, 36.52f, 36.17f, 69.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.66f, 9.24f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
