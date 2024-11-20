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

public val LightGroup.PersonSimpleRun: ImageVector
    get() {
        if (_personSimpleRun != null) {
            return _personSimpleRun!!
        }
        _personSimpleRun = Builder(name = "PersonSimpleRun", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 86.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 152.0f, 86.0f)
                close()
                moveTo(152.0f, 38.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 152.0f, 38.0f)
                close()
                moveTo(218.49f, 138.86f)
                curveToRelative(-0.59f, 0.27f, -7.17f, 3.13f, -18.88f, 3.13f)
                curveToRelative(-13.86f, 0.0f, -34.9f, -4.0f, -61.73f, -21.0f)
                arcToRelative(165.89f, 165.89f, 0.0f, false, true, -17.43f, 36.51f)
                curveToRelative(9.43f, 2.78f, 22.0f, 7.72f, 33.19f, 16.26f)
                curveTo(172.46f, 188.05f, 182.0f, 207.65f, 182.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                curveToRelative(0.0f, -44.0f, -37.23f, -59.18f, -56.91f, -64.11f)
                quadToRelative(-1.2f, 1.55f, -2.46f, 3.09f)
                curveToRelative(-19.25f, 23.31f, -43.34f, 35.45f, -70.11f, 35.45f)
                arcTo(90.72f, 90.72f, 0.0f, false, true, 31.4f, 206.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 32.6f, 194.0f)
                curveToRelative(26.63f, 2.66f, 49.77f, -7.66f, 68.77f, -30.69f)
                curveToRelative(13.16f, -15.94f, 21.94f, -35.51f, 26.08f, -49.15f)
                curveToRelative(-40.51f, -24.52f, -66.59f, -4.78f, -67.72f, -3.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.48f, -9.38f)
                curveToRelative(0.37f, -0.3f, 9.39f, -7.43f, 24.76f, -10.0f)
                curveToRelative(13.86f, -2.31f, 35.92f, -1.3f, 62.36f, 16.67f)
                curveToRelative(47.14f, 32.0f, 73.88f, 20.47f, 74.14f, 20.35f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.0f, 10.92f)
                close()
            }
        }
        .build()
        return _personSimpleRun!!
    }

private var _personSimpleRun: ImageVector? = null
