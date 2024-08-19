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

public val ThinGroup.Personsimplerun: ImageVector
    get() {
        if (_personsimplerun != null) {
            return _personsimplerun!!
        }
        _personsimplerun = Builder(name = "Personsimplerun", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 152.0f, 84.0f)
                close()
                moveTo(152.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 36.0f)
                close()
                moveTo(217.66f, 137.0f)
                curveToRelative(-0.57f, 0.26f, -6.84f, 3.0f, -18.08f, 3.0f)
                curveToRelative(-13.86f, 0.0f, -35.25f, -4.15f, -62.81f, -22.16f)
                arcToRelative(162.59f, 162.59f, 0.0f, false, true, -19.49f, 40.78f)
                curveToRelative(9.47f, 2.56f, 23.08f, 7.5f, 35.14f, 16.67f)
                curveToRelative(18.3f, 13.92f, 27.58f, 33.0f, 27.58f, 56.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                curveToRelative(0.0f, -15.89f, -5.88f, -53.77f, -59.7f, -66.37f)
                quadToRelative(-1.56f, 2.06f, -3.22f, 4.08f)
                curveToRelative(-18.85f, 22.83f, -42.42f, 34.72f, -68.6f, 34.72f)
                quadToRelative(-4.4f, 0.0f, -8.89f, -0.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.8f, -8.0f)
                curveToRelative(27.33f, 2.73f, 51.06f, -7.83f, 70.52f, -31.41f)
                curveToRelative(13.82f, -16.74f, 22.89f, -37.44f, 26.9f, -51.32f)
                curveToRelative(-42.84f, -26.69f, -71.0f, -4.8f, -71.32f, -4.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.0f, -6.24f)
                curveToRelative(0.36f, -0.29f, 9.0f, -7.1f, 23.84f, -9.58f)
                curveToRelative(13.5f, -2.27f, 35.0f, -1.26f, 60.91f, 16.34f)
                curveToRelative(25.0f, 17.0f, 44.41f, 21.64f, 56.29f, 22.56f)
                curveToRelative(12.75f, 1.0f, 19.77f, -2.0f, 19.84f, -2.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.29f, 7.29f)
                close()
            }
        }
        .build()
        return _personsimplerun!!
    }

private var _personsimplerun: ImageVector? = null
