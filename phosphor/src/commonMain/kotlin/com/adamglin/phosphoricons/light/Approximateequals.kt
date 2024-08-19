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

public val LightGroup.Approximateequals: ImageVector
    get() {
        if (_approximateequals != null) {
            return _approximateequals!!
        }
        _approximateequals = Builder(name = "Approximateequals", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.62f, 154.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.79f, 8.45f)
                curveToRelative(-16.87f, 14.0f, -32.0f, 19.0f, -45.75f, 19.0f)
                curveToRelative(-18.19f, 0.0f, -34.13f, -8.66f, -48.94f, -16.71f)
                curveToRelative(-26.0f, -14.12f, -48.44f, -26.31f, -81.31f, 1.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 36.17f, 157.0f)
                curveToRelative(39.13f, -32.46f, 68.65f, -16.42f, 94.69f, -2.27f)
                reflectiveCurveToRelative(48.44f, 26.31f, 81.31f, -1.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 220.62f, 154.57f)
                close()
                moveTo(43.83f, 102.22f)
                curveToRelative(32.87f, -27.27f, 55.32f, -15.08f, 81.31f, -1.0f)
                curveToRelative(14.81f, 8.0f, 30.75f, 16.71f, 48.94f, 16.71f)
                curveToRelative(13.79f, 0.0f, 28.88f, -5.0f, 45.75f, -19.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.66f, -9.24f)
                curveToRelative(-32.87f, 27.27f, -55.32f, 15.08f, -81.31f, 1.0f)
                reflectiveCurveTo(75.3f, 60.52f, 36.17f, 93.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.66f, 9.24f)
                close()
            }
        }
        .build()
        return _approximateequals!!
    }

private var _approximateequals: ImageVector? = null
